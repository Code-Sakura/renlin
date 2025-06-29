package generator

import tagCategories
import java.io.File

class TagGenerator(
    val outputDir: String,
) {
    fun generate() {
        // 各タグのクラスを生成
        tagCategories.forEach { tagInfo ->

            val fileContent = """
            package net.kigawa.renlin.tag

            import net.kigawa.renlin.w3c.category.native.${tagInfo.tagCategories.connectedStr("Union")}
            import net.kigawa.renlin.w3c.category.integration.${tagInfo.allowedCategories.connectedStr("Integration")}
            import net.kigawa.renlin.dsl.DslBase
            import net.kigawa.renlin.dsl.StatedDsl
            import net.kigawa.renlin.tag.component.TagComponent1
            import net.kigawa.renlin.w3c.element.TagNode
            import net.kigawa.renlin.state.DslState
            ${
                if (tagInfo.allowedCategories.categories.isEmpty()) ""
                else "import net.kigawa.renlin.w3c.category.dsl.${tagInfo.allowedCategories.connectedStr()}Dsl\n"
            }
            
            /**
             * HTML <${tagInfo.name}> element
             * 
             * model.Categories: ${tagInfo.tagCategories.categories.joinToString(", ")}
             */
            class ${tagInfo.className}Dsl(dslState: DslState): 
                DslBase<${tagInfo.allowedCategories.connectedStr("Integration")}>(dslState),
                StatedDsl<${tagInfo.allowedCategories.connectedStr("Integration")}>${
                if (tagInfo.allowedCategories.categories.isEmpty()) ""
                else ",\n                ${tagInfo.allowedCategories.connectedStr()}" +
                        "Dsl<${tagInfo.allowedCategories.connectedStr("Integration")}>"
            } {
                override fun applyElement(element: TagNode): ()->Unit {
                    return {}
                }
            }

            val ${tagInfo.escapement} = TagComponent1<${tagInfo.className}, ${tagInfo.className}Dsl>(${tagInfo.className}, ::${tagInfo.className}Dsl)

            object ${tagInfo.className} : Tag<${tagInfo.tagCategories.connectedStr("Union")}> {
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