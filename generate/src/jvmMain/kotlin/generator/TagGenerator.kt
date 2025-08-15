package generator

import tagCategories
import java.io.File

class TagGenerator(
    val outputDir: String,
) {
    fun generate() {
        // 各タグのクラスを生成
        tagCategories.forEach { tagInfo ->

            val imports = mutableSetOf<String>()

            if (tagInfo.tagCategories.categories.size > 1)
                imports.add(
                    "import net.kigawa.renlin.w3c.category.integration.${
                        tagInfo.tagCategories.connectedStr()
                    }"
                )
            else imports.add("import net.kigawa.renlin.w3c.category.native.${tagInfo.tagCategories.connectedStr()}")
            if (tagInfo.allowedCategories.categories.size > 1)
                imports.add(
                    "import net.kigawa.renlin.w3c.category.integration.${
                        tagInfo.allowedCategories.connectedStr()
                    }"
                )
            else if (
                tagInfo.allowedCategories.categories.isNotEmpty() &&
                tagInfo.tagCategories.connectedStr() !=
                tagInfo.allowedCategories.connectedStr()
            ) imports.add(
                "import net.kigawa.renlin.w3c.category.native.${
                    tagInfo.allowedCategories.connectedStr()
                }"
            )
            val fileContent = """
            package net.kigawa.renlin.tag
 
            ${imports.distinct().joinToString("\n                ")}
            import net.kigawa.renlin.dsl.DslBase
            import net.kigawa.renlin.dsl.StatedDsl
            import net.kigawa.renlin.component.TagComponent1
            import net.kigawa.renlin.component.Component
            import net.kigawa.renlin.w3c.element.TagNode
            import net.kigawa.renlin.state.DslState
            import net.kigawa.renlin.w3c.category.native.${tagInfo.className}Category
            ${
                if (tagInfo.allowedCategories.categories.isEmpty())
                    "import net.kigawa.renlin.w3c.category.ContentCategory"
                else "import net.kigawa.renlin.w3c.category.dsl.${tagInfo.allowedCategories.connectedStr()}Dsl\n"
            }
            
            /**
             * HTML <${tagInfo.name}> element
             * 
             * model.Categories: ${tagInfo.tagCategories.categories.joinToString(", ")}
             */
            class ${tagInfo.className}Dsl(dslState: DslState): 
                DslBase<${tagInfo.allowedCategories.connectedStr()}>(dslState),
                StatedDsl<${tagInfo.allowedCategories.connectedStr()}>${
                if (tagInfo.allowedCategories.categories.isEmpty()) ""
                else ",\n                ${tagInfo.allowedCategories.connectedStr()}" +
                    "Dsl<${tagInfo.allowedCategories.connectedStr()}>"
            } {
                override fun applyElement(element: TagNode): ()->Unit {
                    return {}
                }
            }

            val ${tagInfo.escapement} = TagComponent1(${tagInfo.className}, ::${tagInfo.className}Dsl)

            object ${tagInfo.className} : Tag<${tagInfo.className}Category> {
                override val name: String
                    get() = "${tagInfo.name}"
            }
        """.trimIndent()

            // ファイルに書き込む
            val file = File("$outputDir/${tagInfo.className}.kt")
            file.writeText(fileContent)
            println("Generated: ${tagInfo.className}.kt")
        }
    }
}