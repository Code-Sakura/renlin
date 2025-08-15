package generator

import java.io.File
import tagCategories
import categoryParents

class NativeGenerator(val categoryNativeOutputDir: String) {
    fun generate() {
        // 使用されているすべてのネイティブカテゴリを収集
        val usedNativeCategories = mutableSetOf<String>()
        tagCategories.forEach { tagInfo ->
            usedNativeCategories.addAll(tagInfo.tagCategories.categories)
            usedNativeCategories.addAll(tagInfo.allowedCategories.categories)
            // 各タグ専用のCategoryインターフェースも追加
            usedNativeCategories.add("${tagInfo.className}Category")
        }

        // 親カテゴリーの情報を収集
        val allParentCategories = categoryParents.toMutableMap()
        tagCategories.forEach { tagInfo ->
            allParentCategories.putAll(tagInfo.tagCategories.parentCategories)
            allParentCategories.putAll(tagInfo.allowedCategories.parentCategories)
            // 各タグ専用のCategoryの親カテゴリーを設定（ContentCategoryのみ継承）
            allParentCategories["${tagInfo.className}Category"] = ""
        }
        
        // FlowContent, PhrasingContentなどが継承すべきタグカテゴリを設定
        val categoryToTagCategories = mutableMapOf<String, MutableSet<String>>()
        tagCategories.forEach { tagInfo ->
            tagInfo.tagCategories.categories.forEach { category ->
                categoryToTagCategories.getOrPut(category) { mutableSetOf() }.add("${tagInfo.className}Category")
            }
        }

        // ネイティブカテゴリの生成
        usedNativeCategories.forEach { categoryName ->
            // 親カテゴリーを取得
            val parentCategory = allParentCategories[categoryName]

            // 継承するインターフェースのリスト
            val interfaces = when {
                parentCategory == null -> "ContentCategory"
                parentCategory.isEmpty() -> "" // P, Divの場合は継承なし
                else -> "ContentCategory, $parentCategory"
            }

            val fileContent = when {
                parentCategory?.isEmpty() == true && !categoryName.endsWith("Category") -> {
                    // P, Divの場合は基本インターフェースのみ
                    """
                        package net.kigawa.renlin.w3c.category.native

                        interface $categoryName
                    """.trimIndent()
                }
                categoryName.endsWith("Category") -> {
                    // タグ専用カテゴリはContentCategoryのみ継承
                    """
                        package net.kigawa.renlin.w3c.category.native

                        import net.kigawa.renlin.w3c.category.ContentCategory

                        /**
                         * ${categoryName} represents elements that are part of the ${categoryName.replace("Category", "").lowercase()} content category.
                         */
                        interface $categoryName : ContentCategory
                    """.trimIndent()
                }
                else -> {
                    // 標準カテゴリ（FlowContent、PhrasingContentなど）の場合、関連するタグカテゴリを継承
                    val tagCategoriesToInherit = categoryToTagCategories[categoryName] ?: emptySet()
                    val tagCategoryImports = tagCategoriesToInherit.map { "import net.kigawa.renlin.w3c.category.native.$it" }
                    val allTagCategoriesInheritance = if (tagCategoriesToInherit.isNotEmpty()) {
                        tagCategoriesToInherit.joinToString(", ")
                    } else {
                        ""
                    }
                    
                    val finalInterfaces = if (allTagCategoriesInheritance.isNotEmpty()) {
                        if (interfaces.isNotEmpty()) "$interfaces, $allTagCategoriesInheritance" else allTagCategoriesInheritance
                    } else {
                        interfaces
                    }
                    
                    """
                        package net.kigawa.renlin.w3c.category.native

                        import net.kigawa.renlin.w3c.category.ContentCategory
                        ${tagCategoryImports.joinToString("\n                        ")}

                        /**
                         * ${categoryName} represents elements that are part of the ${categoryName.replace("Content", "").lowercase()} content category.
                         * ${if (parentCategory != null && parentCategory.isNotEmpty()) "Parent: $parentCategory" else ""}
                         */
                        interface $categoryName : $finalInterfaces
                    """.trimIndent()
                }
            }

            val file = File("$categoryNativeOutputDir/${categoryName}.kt")
            file.writeText(fileContent)
            println("Generated native: ${categoryName}.kt")
        }
    }
}
