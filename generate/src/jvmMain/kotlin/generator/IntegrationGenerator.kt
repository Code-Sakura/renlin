package generator

import tagCategories
import java.io.File

class IntegrationGenerator(
    val categoryIntegrationOutputDir: String,
) {
    val processedIntegrations = mutableSetOf<String>()
    val nativeCategories = mutableMapOf<String, MutableSet<String>>()
    fun generate() {
        // First collect all possible integrations
        val allIntegrations = mutableMapOf<String, Set<String>>()
        
        tagCategories
            .map { it.tagCategories }
            .filter { it.categories.size > 1 }
            .toSet()
            .forEach { tagCategories ->
                val integrationName = tagCategories.connectedStr("Integration")
                if (!processedIntegrations.contains(integrationName)) {
                    processedIntegrations.add(integrationName)
                    allIntegrations[integrationName] = tagCategories.categories.toSet()

                    tagCategories.categories.forEach {
                        nativeCategories.getOrPut(it) { mutableSetOf() }.add(integrationName)
                    }
                }
            }
        
        // Generate each integration with inheritance from subset integrations
        allIntegrations.forEach { (integrationName, categories) ->
            // Find other integrations that are subsets of this integration
            val subsetIntegrations = allIntegrations.filter { (otherName, otherCategories) ->
                otherName != integrationName && 
                otherCategories.isNotEmpty() && 
                otherCategories.all { it in categories } &&
                otherCategories.size < categories.size
            }.keys
            
            // Generate imports for categories and subset integrations
            val categoryImports = categories.map { category ->
                "import net.kigawa.renlin.w3c.category.native.$category"
            }
            
            val integrationImports = subsetIntegrations.map { subsetIntegration ->
                "import net.kigawa.renlin.w3c.category.integration.$subsetIntegration"
            }
            
            val allImports = (categoryImports + integrationImports).joinToString("\n                        ")
            
            // Generate inheritance list including categories and subset integrations
            val inheritance = (categories + subsetIntegrations + "ContentCategory").joinToString(", ")
            
            val fileContent = """
                package net.kigawa.renlin.w3c.category.integration

                import net.kigawa.renlin.w3c.category.ContentCategory
                $allImports

                /**
                 * Integration of ${categories.joinToString(", ")}
                 */
                interface $integrationName: $inheritance
            """.trimIndent()

            val file = File("$categoryIntegrationOutputDir/${integrationName}.kt")
            file.writeText(fileContent)
            println("Generated integration: ${integrationName}.kt")
        }
    }
}