package net.kigawa.renlin.tag

import java.io.File

fun main() {
    // タグ名とカテゴリのマッピング
    val tagCategories = mapOf(
        // Main root
        "html" to "FlowContent",

        // Document metadata
        "base" to "FlowContent",
        "head" to "FlowContent",
        "link" to "FlowContent",
        "meta" to "FlowContent",
        "style" to "FlowContent",
        "title" to "FlowContent",

        //Sectioning root
        "body" to "FlowContent",

        // Content sectioning
        "address" to "FlowContent",
        "article" to "FlowContent",
        "aside" to "FlowContent",
        "footer" to "FlowContent",
        "header" to "FlowContent",
        "h1" to "FlowContent",
        "h2" to "FlowContent",
        "h3" to "FlowContent",
        "h4" to "FlowContent",
        "h5" to "FlowContent",
        "h6" to "FlowContent",
        "hgroup" to "FlowContent",
        "main" to "FlowContent",
        "nav" to "FlowContent",
        "section" to "FlowContent",
        "search" to "FlowContent",

        // Text content
        "blockquote" to "FlowContent",
        "dd" to "FlowContent",
        "div" to "FlowContent",
        "dl" to "FlowContent",
        "dt" to "FlowContent",
        "figcaption" to "FlowContent",
        "figure" to "FlowContent",
        "hr" to "FlowContent",
        "li" to "FlowContent",
        "menu" to "FlowContent",
        "ol" to "FlowContent",
        "p" to "FlowContent",
        "pre" to "FlowContent",
        "ul" to "FlowContent",

        // Inline text semantics
        "a" to "FlowPhrasingIntersection",
        "abbr" to "FlowPhrasingIntersection",
        "b" to "FlowPhrasingIntersection",
        "bdi" to "FlowPhrasingIntersection",
        "bdo" to "FlowPhrasingIntersection",
        "br" to "FlowPhrasingIntersection",
        "cite" to "FlowPhrasingIntersection",
        "code" to "FlowPhrasingIntersection",
        "data" to "FlowPhrasingIntersection",
        "dfn" to "FlowPhrasingIntersection",
        "em" to "FlowPhrasingIntersection",
        "i" to "FlowPhrasingIntersection",
        "kbd" to "FlowPhrasingIntersection",
        "mark" to "FlowPhrasingIntersection",
        "q" to "FlowPhrasingIntersection",
        "rp" to "FlowPhrasingIntersection",
        "rt" to "FlowPhrasingIntersection",
        "ruby" to "FlowPhrasingIntersection",
        "s" to "FlowPhrasingIntersection",
        "samp" to "FlowPhrasingIntersection",
        "small" to "FlowPhrasingIntersection",
        "span" to "FlowPhrasingIntersection",
        "strong" to "FlowPhrasingIntersection",
        "sub" to "FlowPhrasingIntersection",
        "sup" to "FlowPhrasingIntersection",
        "time" to "FlowPhrasingIntersection",
        "u" to "FlowPhrasingIntersection",
        "var" to "FlowPhrasingIntersection",
        "wbr" to "FlowPhrasingIntersection",

        // Image and multimedia
        "area" to "FlowPhrasingIntersection",
        "audio" to "FlowPhrasingIntersection",
        "img" to "FlowPhrasingIntersection",
        "map" to "FlowPhrasingIntersection",
        "track" to "FlowPhrasingIntersection",
        "video" to "FlowPhrasingIntersection",

        // Embedded content
        "embed" to "FlowPhrasingIntersection",
        "fencedframe" to "FlowContent",
        "iframe" to "FlowPhrasingIntersection",
        "object" to "FlowPhrasingIntersection",
        "picture" to "FlowPhrasingIntersection",
        "source" to "FlowPhrasingIntersection",

        // SVG and MathML
        "svg" to "FlowPhrasingIntersection",
        "math" to "FlowPhrasingIntersection",

        // Scripting
        "canvas" to "FlowPhrasingIntersection",
        "noscript" to "FlowContent",
        "script" to "FlowPhrasingIntersection",

        // Demarcating edits
        "del" to "FlowPhrasingIntersection",
        "ins" to "FlowPhrasingIntersection",

        // Table content
        "caption" to "FlowContent",
        "col" to "FlowContent",
        "colgroup" to "FlowContent",
        "table" to "FlowContent",
        "tbody" to "FlowContent",
        "td" to "FlowContent",
        "tfoot" to "FlowContent",
        "th" to "FlowContent",
        "thead" to "FlowContent",
        "tr" to "FlowContent",

        // Forms
        "button" to "FlowPhrasingIntersection",
        "datalist" to "FlowPhrasingIntersection",
        "fieldset" to "FlowContent",
        "form" to "FlowContent",
        "input" to "FlowPhrasingIntersection",
        "label" to "FlowPhrasingIntersection",
        "legend" to "FlowContent",
        "meter" to "FlowPhrasingIntersection",
        "optgroup" to "FlowContent",
        "option" to "FlowContent",
        "output" to "FlowPhrasingIntersection",
        "progress" to "FlowPhrasingIntersection",
        "select" to "FlowPhrasingIntersection",
        "selectedcontent" to "FlowContent",
        "textarea" to "FlowPhrasingIntersection",

        // Interactive elements
        "details" to "FlowContent",
        "dialog" to "FlowContent",
        "summary" to "FlowContent",

        // Web Components
        "slot" to "FlowPhrasingIntersection",
        "template" to "FlowContent"
    )

    // 出力先ディレクトリ
    val outputDir = "src/commonMain/kotlin/net/kigawa/renlin/tag"

    tagCategories.forEach { (tag, category) ->
        val className = tag.replaceFirstChar { it.uppercase() }
        // タグ名が Kotlin の予約語の場合はエスケープする
        val escapement = when (tag) {
            "object" -> "`object`"
            "var" -> "`var`"
            else -> tag
        }
        // カテゴリに応じたインターフェースとDSLクラスの選択
        val categoryInterface = category
        val dslInterface = when (category) {
            "FlowPhrasingIntersection" -> "FlowPhrasingDsl"
            "FlowContent" -> "FlowContentDsl"
            "PhrasingContent" -> "PhrasingContentDsl"
            else -> "Dsl"
        }

        val fileContent = """
            package net.kigawa.renlin.tag

            import net.kigawa.renlin.category.$categoryInterface
            import net.kigawa.renlin.category.$dslInterface
            import net.kigawa.renlin.dsl.DslBase
            import net.kigawa.renlin.dsl.Dsl
            import net.kigawa.renlin.element.TagNode
            import net.kigawa.renlin.tag.component.TagComponent1

            class ${className}Dsl :
                DslBase<$categoryInterface>(), Dsl<$categoryInterface>, $dslInterface<$categoryInterface> {
                override fun applyElement(element: TagNode) {
                }
            }

            val $escapement = TagComponent1<$className, ${className}Dsl>($className, ::${className}Dsl)

            object $className : Tag<$categoryInterface> {
                override val name: String
                    get() = "$tag"
            }
        """.trimIndent()

        // ファイルに書き込む
        val file = File("$outputDir/${className}.kt")
        file.writeText(fileContent)
    }

    println("タグのコード生成が完了しました。")
}