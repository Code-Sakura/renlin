package generator

import tagCategories
import java.io.File

class UnionGenerator(
    val categoryUnionOutputDir: String,
) {
    val processedUnions = mutableSetOf<String>()
    val nativeCategories = mutableMapOf<String, MutableSet<String>>()
    fun generate() {
        // Unionクラスの生成
        tagCategories
            .map { it.tagCategories }
            .filter { it.categories.size > 1 }
            .toSet()
            .forEach { tagCategories ->
                val unionName = tagCategories.connectedStr("Union")
                if (!processedUnions.contains(unionName)) {
                    processedUnions.add(unionName)

                    tagCategories.categories.forEach {
                        nativeCategories.getOrPut(it) { mutableSetOf() }.add(unionName)
                    }

                    val categories = tagCategories.categories

                    val fileContent = """
                        package net.kigawa.renlin.w3c.category.native
        
                        import net.kigawa.renlin.w3c.category.ContentCategory
        
                        /**
                         * Union of ${categories.joinToString(", ")}
                         */
                        sealed interface $unionName: ContentCategory
                    """.trimIndent()

                    val file = File("$categoryUnionOutputDir/${unionName}.kt")
                    file.writeText(fileContent)
                    println("Generated union: ${unionName}.kt")
                }
            }
    }
}