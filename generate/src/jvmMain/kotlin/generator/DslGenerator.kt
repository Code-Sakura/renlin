package generator

import tagCategories
import java.io.File

class DslGenerator(
    val categoryDslOutputDir: String,
) {
    val processedDsls = mutableSetOf<String>()
    fun generate() {
        // DSLクラスの生成
        tagCategories
            .map { it.allowedCategories }
            .filter { it.categories.isNotEmpty() }
            .forEach { allowedCategories ->
            val dslName = allowedCategories.connectedStr() + "Dsl"
            if (!processedDsls.contains(dslName)) {
                processedDsls.add(dslName)
                val categories = allowedCategories.categories

                // 適切なベースDSLクラスを選択
                val baseDsl = when {
                    categories.contains("FlowContent") -> "FlowContentDsl"
                    categories.contains("PhrasingContent") -> "PhrasingContentDsl"
                    categories.contains("MetadataContent") -> "MetadataContentDsl"
                    categories.contains("EmbeddedContent") -> "EmbeddedContentDsl"
                    categories.contains("InteractiveContent") -> "InteractiveContentDsl"
                    categories.contains("PalpableContent") -> "PalpableContentDsl"
                    categories.contains("FormAssociatedContent") -> "FormAssociatedContentDsl"
                    else -> "ContentDsl"
                }

                val imports = mutableListOf<String>()
                imports.add("import net.kigawa.renlin.w3c.category.${baseDsl}")
                categories.forEach { category ->
                    if (category != baseDsl.replace("Dsl", "")) {
                        imports.add("import net.kigawa.renlin.w3c.category.${category}Dsl")
                    }
                }

                val fileContent = """
                package net.kigawa.renlin.w3c.category.dsl

                ${imports.distinct().joinToString("\n                ")}
                import net.kigawa.renlin.w3c.category.integration.${
                    allowedCategories.connectedStr("Integration")
                }

                /**
                 * DSL for ${categories.joinToString(", ")}
                 */
                interface ${dslName}<CATEGORY_DSL : ${allowedCategories.connectedStr("Integration")}> :
                    ${baseDsl}<CATEGORY_DSL>${
                    categories.filter { it != baseDsl.replace("Dsl", "") }.joinToString(
                        ""
                    ) { ",\n                    ${it}Dsl<CATEGORY_DSL>" }
                }
            """.trimIndent()

                val file = File("$categoryDslOutputDir/${dslName}.kt")
                file.writeText(fileContent)
                println("Generated DSL: ${dslName}.kt")
            }
        }
    }
}