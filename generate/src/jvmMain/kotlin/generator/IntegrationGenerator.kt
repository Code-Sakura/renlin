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
                val integrationName = tagCategories.connectedStr()
                if (!processedIntegrations.contains(integrationName)) {
                    processedIntegrations.add(integrationName)
                    allIntegrations[integrationName] = tagCategories.categories.toSet()

                    tagCategories.categories.forEach {
                        nativeCategories.getOrPut(it) { mutableSetOf() }.add(integrationName)
                    }
                }
            }
        
        // タグのCategoryインターフェースを生成対象に含める
        val tagCategoryMap = mutableMapOf<String, Set<String>>()
        tagCategories.forEach { tagInfo ->
            val tagCategoryName = "${tagInfo.className}Category"
            tagCategoryMap[tagCategoryName] = setOf(tagInfo.tagCategories.connectedStr())
        }
        
        // Generate each integration with inheritance from tag categories
        allIntegrations.forEach { (integrationName, categories) ->
            // Find tag categories that match this integration
            val matchingTagCategories = tagCategoryMap.filter { (_, integrationSet) ->
                integrationSet.contains(integrationName)
            }.keys
            
            // Find other integrations that are subsets of this integration
            val subsetIntegrations = allIntegrations.filter { (otherName, otherCategories) ->
                otherName != integrationName && 
                otherCategories.isNotEmpty() && 
                otherCategories.all { it in categories } &&
                otherCategories.size < categories.size
            }.keys
            
            // Generate imports for categories, subset integrations, and tag categories
            val categoryImports = categories.map { category ->
                "import net.kigawa.renlin.w3c.category.native.$category"
            }
            
            val integrationImports = subsetIntegrations.map { subsetIntegration ->
                "import net.kigawa.renlin.w3c.category.integration.$subsetIntegration"
            }
            
            val tagCategoryImports = matchingTagCategories.map { tagCategory ->
                "import net.kigawa.renlin.w3c.category.native.$tagCategory"
            }
            
            val allImports = (categoryImports + integrationImports + tagCategoryImports).joinToString("\n                        ")
            
            // Generate inheritance list including categories, subset integrations, and tag categories
            val inheritance = (categories + subsetIntegrations + matchingTagCategories + "ContentCategory").joinToString(", ")
            
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