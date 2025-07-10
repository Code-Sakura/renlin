package generator

import tagCategories
import java.io.File

class IntegrationGenerator(
    val categoryIntegrationOutputDir: String,
) {
    val processedIntegrations = mutableSetOf<String>()
    fun generate() {
        // Integrationクラスの生成
        tagCategories
            .map { it.allowedCategories }
            .filter { it.categories.size > 1 }
            .forEach { allowedCategories ->
                val integrationName = allowedCategories.connectedStr("Integration")
                if (!processedIntegrations.contains(integrationName)) {
                    processedIntegrations.add(integrationName)
                    val categories = allowedCategories.categories

                    val fileContent = """
                package net.kigawa.renlin.w3c.category.integration

                import net.kigawa.renlin.w3c.category.ContentCategory
                ${
                        categories.joinToString("\n                ")
                        { "import net.kigawa.renlin.w3c.category.native.$it" }
                    }

                /**
                 * Integration of ${categories.joinToString(", ")}
                 */
                interface $integrationName : ${(categories + "ContentCategory").joinToString(", ")}
            """.trimIndent()

                    val file = File("$categoryIntegrationOutputDir/${integrationName}.kt")
                    file.writeText(fileContent)
                    println("Generated integration: ${integrationName}.kt")
                }
            }
    }
}