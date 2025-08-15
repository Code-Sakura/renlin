package generator

import model.AllowedCategories
import tagCategories
import java.io.File

class DslGenerator(
    val categoryDslOutputDir: String,
) {
    val processedDsls = mutableSetOf<String>()
    fun generate() {
        // DSLクラスの生成
        (tagCategories.map { it.allowedCategories } +
                tagCategories.flatMap { it.allowedCategories.categories }.map { AllowedCategories(it) })
            .filter { it.categories.isNotEmpty() }
            .forEach { allowedCategories ->
                val dslName = allowedCategories.connectedStr() + "Dsl"
                if (!processedDsls.contains(dslName)) {
                    processedDsls.add(dslName)
                    val categories = allowedCategories.categories


                    val imports = mutableListOf<String>()

                    val fileContent = """
                package net.kigawa.renlin.w3c.category.dsl

                ${imports.distinct().joinToString("\n                ")}
                ${
                        if (allowedCategories.categories.size > 1)
                            "import net.kigawa.renlin.w3c.category.integration.${
                                allowedCategories.connectedStr()
                            }"
                        else "import net.kigawa.renlin.w3c.category.native.${
                            allowedCategories.connectedStr()
                        }"
                    }
                

                /**
                 * DSL for ${categories.joinToString(", ")}
                 */
                interface ${dslName}<CATEGORY_DSL : ${allowedCategories.connectedStr()}>${
                        if (categories.size <= 1) ""
                        else (categories.filter { it.trim() != dslName.trim() }
                            .joinToString(separator = ",", prefix = ":")
                            { "\n                    ${it}Dsl<CATEGORY_DSL>" })
                    }
            """.trimIndent()

                    val file = File("$categoryDslOutputDir/${dslName}.kt")
                    file.writeText(fileContent)
                    println("Generated DSL: ${dslName}.kt")
                }
            }
    }
}