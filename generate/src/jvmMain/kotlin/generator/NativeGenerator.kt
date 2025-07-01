package generator

import java.io.File

class NativeGenerator(val categoryNativeOutputDir: String) {
    fun generate(categories: Map<String, Set<String>>) {

        // Unionクラスの生成
        categories.forEach { (name, deps) ->
            val categoryName = name


            val fileContent = """
                package net.kigawa.renlin.w3c.category.native

                import net.kigawa.renlin.w3c.category.ContentCategory

                /**
                 * Union to ${deps.joinToString(", ")}
                 */
                interface $categoryName :  ${(deps + "ContentCategory").joinToString(", ")}
            """.trimIndent()

            val file = File("$categoryNativeOutputDir/${categoryName}.kt")
            file.writeText(fileContent)
            println("Generated native: ${categoryName}.kt")
        }

    }
}