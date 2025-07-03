package generator

import java.io.File
import tagCategories
import categoryParents

class NativeGenerator(val categoryNativeOutputDir: String) {
    fun generate(categories: Map<String, Set<String>>) {
        // 親カテゴリーの情報を収集
        val allParentCategories = categoryParents.toMutableMap()
        tagCategories.forEach { tagInfo ->
            allParentCategories.putAll(tagInfo.tagCategories.parentCategories)
            allParentCategories.putAll(tagInfo.allowedCategories.parentCategories)
        }

        // Unionクラスの生成
        categories.forEach { (name, deps) ->
            val categoryName = name

            // 親カテゴリーを取得
            val parentCategory = allParentCategories[name]

            // 継承するインターフェースのリスト
            val interfaces = if (parentCategory != null) {
                (deps + "ContentCategory" + parentCategory).joinToString(", ")
            } else {
                (deps + "ContentCategory").joinToString(", ")
            }

            val fileContent = """
                package net.kigawa.renlin.w3c.category.native

                import net.kigawa.renlin.w3c.category.ContentCategory

                /**
                 * Union to ${deps.joinToString(", ")}
                 * ${if (parentCategory != null) "Parent: $parentCategory" else ""}
                 */
                interface $categoryName : $interfaces
            """.trimIndent()

            val file = File("$categoryNativeOutputDir/${categoryName}.kt")
            file.writeText(fileContent)
            println("Generated native: ${categoryName}.kt")
        }
    }
}
