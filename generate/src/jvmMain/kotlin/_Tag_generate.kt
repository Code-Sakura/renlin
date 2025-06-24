import java.io.File

fun main() {
    // 元のコードの並び順を維持するためのタグリスト
    val tagCategories = mapOf(
        // Main root
        "html" to "FlowContent",

        // Document metadata
        "base" to "MetadataContent",
        "head" to "FlowContent",
        "link" to listOf("MetadataContent", "FlowContent", "PhrasingContent"),
        "meta" to listOf("MetadataContent", "FlowContent", "PhrasingContent"),
        "style" to "MetadataContent",
        "title" to "MetadataContent",

        //Sectioning root
        "body" to "FlowContent",

        // Content sectioning
        "address" to listOf("FlowContent", "PalpableContent"),
        "article" to listOf("FlowContent", "SectioningContent", "PalpableContent"),
        "aside" to listOf("FlowContent", "SectioningContent", "PalpableContent"),
        "footer" to listOf("FlowContent", "PalpableContent"),
        "header" to listOf("FlowContent", "PalpableContent"),
        "h1" to listOf("FlowContent", "HeadingContent", "PalpableContent"),
        "h2" to listOf("FlowContent", "HeadingContent", "PalpableContent"),
        "h3" to listOf("FlowContent", "HeadingContent", "PalpableContent"),
        "h4" to listOf("FlowContent", "HeadingContent", "PalpableContent"),
        "h5" to listOf("FlowContent", "HeadingContent", "PalpableContent"),
        "h6" to listOf("FlowContent", "HeadingContent", "PalpableContent"),
        "hgroup" to listOf("FlowContent", "HeadingContent"),
        "main" to listOf("FlowContent", "PalpableContent"),
        "nav" to listOf("FlowContent", "SectioningContent", "PalpableContent"),
        "section" to listOf("FlowContent", "SectioningContent", "PalpableContent"),
        "search" to listOf("FlowContent", "PalpableContent"),

        // Text content
        "blockquote" to listOf("FlowContent", "PalpableContent"),
        "dd" to "FlowContent",
        "div" to listOf("FlowContent", "PalpableContent"),
        "dl" to listOf("FlowContent", "PalpableContent"),
        "dt" to "FlowContent",
        "figcaption" to "FlowContent",
        "figure" to listOf("FlowContent", "PalpableContent"),
        "hr" to "FlowContent",
        "li" to "FlowContent",
        "menu" to "FlowContent",
        "ol" to listOf("FlowContent", "PalpableContent"),
        "p" to listOf("FlowContent", "PalpableContent"),
        "pre" to listOf("FlowContent", "PalpableContent"),
        "ul" to listOf("FlowContent", "PalpableContent"),

        // Inline text semantics
        "a" to listOf("FlowContent", "PhrasingContent", "PalpableContent", "InteractiveContent"),
        "abbr" to listOf("FlowContent", "PhrasingContent", "PalpableContent"),
        "b" to listOf("FlowContent", "PhrasingContent", "PalpableContent"),
        "bdi" to listOf("FlowContent", "PhrasingContent", "PalpableContent"),
        "bdo" to listOf("FlowContent", "PhrasingContent", "PalpableContent"),
        "br" to listOf("FlowContent", "PhrasingContent"),
        "cite" to listOf("FlowContent", "PhrasingContent", "PalpableContent"),
        "code" to listOf("FlowContent", "PhrasingContent", "PalpableContent"),
        "data" to listOf("FlowContent", "PhrasingContent", "PalpableContent"),
        "dfn" to listOf("FlowContent", "PhrasingContent", "PalpableContent"),
        "em" to listOf("FlowContent", "PhrasingContent", "PalpableContent"),
        "i" to listOf("FlowContent", "PhrasingContent", "PalpableContent"),
        "kbd" to listOf("FlowContent", "PhrasingContent", "PalpableContent"),
        "mark" to listOf("FlowContent", "PhrasingContent", "PalpableContent"),
        "q" to listOf("FlowContent", "PhrasingContent", "PalpableContent"),
        "rp" to listOf("FlowContent", "PhrasingContent"),
        "rt" to listOf("FlowContent", "PhrasingContent"),
        "ruby" to listOf("FlowContent", "PhrasingContent", "PalpableContent"),
        "s" to listOf("FlowContent", "PhrasingContent", "PalpableContent"),
        "samp" to listOf("FlowContent", "PhrasingContent", "PalpableContent"),
        "small" to listOf("FlowContent", "PhrasingContent", "PalpableContent"),
        "span" to listOf("FlowContent", "PhrasingContent", "PalpableContent"),
        "strong" to listOf("FlowContent", "PhrasingContent", "PalpableContent"),
        "sub" to listOf("FlowContent", "PhrasingContent", "PalpableContent"),
        "sup" to listOf("FlowContent", "PhrasingContent", "PalpableContent"),
        "time" to listOf("FlowContent", "PhrasingContent", "PalpableContent"),
        "u" to listOf("FlowContent", "PhrasingContent", "PalpableContent"),
        "var" to listOf("FlowContent", "PhrasingContent", "PalpableContent"),
        "wbr" to listOf("FlowContent", "PhrasingContent"),

        // Image and multimedia
        "area" to listOf("FlowContent", "PhrasingContent"),
        "audio" to listOf("FlowContent", "PhrasingContent", "EmbeddedContent", "PalpableContent", "InteractiveContent"),
        "img" to listOf("FlowContent", "PhrasingContent", "EmbeddedContent", "PalpableContent", "FormAssociatedContent", "InteractiveContent"),
        "map" to listOf("FlowContent", "PhrasingContent", "PalpableContent"),
        "track" to "FlowContent",
        "video" to listOf("FlowContent", "PhrasingContent", "EmbeddedContent", "PalpableContent", "InteractiveContent"),

        // Embedded content
        "embed" to listOf("FlowContent", "PhrasingContent", "EmbeddedContent", "InteractiveContent", "PalpableContent"),
        "fencedframe" to "FlowContent",
        "iframe" to listOf("FlowContent", "PhrasingContent", "EmbeddedContent", "InteractiveContent", "PalpableContent"),
        "object" to listOf("FlowContent", "PhrasingContent", "EmbeddedContent", "PalpableContent", "FormAssociatedContent", "InteractiveContent"),
        "picture" to listOf("FlowContent", "PhrasingContent", "EmbeddedContent", "PalpableContent"),
        "source" to "FlowContent",

        // SVG and MathML
        "svg" to listOf("FlowContent", "PhrasingContent", "EmbeddedContent", "PalpableContent"),
        "math" to listOf("FlowContent", "PhrasingContent", "EmbeddedContent", "PalpableContent"),

        // Scripting
        "canvas" to listOf("FlowContent", "PhrasingContent", "EmbeddedContent", "PalpableContent"),
        "noscript" to listOf("MetadataContent", "FlowContent", "PhrasingContent"),
        "script" to listOf("MetadataContent", "FlowContent", "PhrasingContent", "ScriptSupportingContent"),

        // Demarcating edits
        "del" to listOf("FlowContent", "PhrasingContent", "PalpableContent"),
        "ins" to listOf("FlowContent", "PhrasingContent", "PalpableContent"),

        // Table content
        "caption" to "FlowContent",
        "col" to "FlowContent",
        "colgroup" to "FlowContent",
        "table" to listOf("FlowContent", "PalpableContent"),
        "tbody" to "FlowContent",
        "td" to "FlowContent",
        "tfoot" to "FlowContent",
        "th" to "FlowContent",
        "thead" to "FlowContent",
        "tr" to "FlowContent",

        // Forms
        "button" to listOf("FlowContent", "PhrasingContent", "InteractiveContent", "PalpableContent", "FormAssociatedContent"),
        "datalist" to listOf("FlowContent", "PhrasingContent"),
        "fieldset" to listOf("FlowContent", "PalpableContent", "FormAssociatedContent", "AutocapitalizeInheritingFormContent"),
        "form" to listOf("FlowContent", "PalpableContent"),
        "input" to listOf("FlowContent", "PhrasingContent", "PalpableContent", "InteractiveContent", "FormAssociatedContent"),
        "label" to listOf("FlowContent", "PhrasingContent", "InteractiveContent", "PalpableContent"),
        "legend" to "FlowContent",
        "meter" to listOf("FlowContent", "PhrasingContent", "PalpableContent"),
        "optgroup" to "FlowContent",
        "option" to "FlowContent",
        "output" to listOf("FlowContent", "PhrasingContent", "PalpableContent", "FormAssociatedContent"),
        "progress" to listOf("FlowContent", "PhrasingContent", "PalpableContent"),
        "select" to listOf("FlowContent", "PhrasingContent", "InteractiveContent", "PalpableContent", "FormAssociatedContent"),
        "selectedcontent" to "FlowContent",
        "textarea" to listOf("FlowContent", "PhrasingContent", "InteractiveContent", "PalpableContent", "FormAssociatedContent"),

        // Interactive elements
        "details" to listOf("FlowContent", "InteractiveContent", "PalpableContent"),
        "dialog" to "FlowContent",
        "summary" to "FlowContent",

        // Web Components
        "slot" to listOf("FlowContent", "PhrasingContent"),
        "template" to listOf("MetadataContent", "FlowContent", "PhrasingContent", "ScriptSupportingContent")
    )

    // 生成されるインターフェース名の組み合わせを追跡するSet
    val generatedInterfaces = mutableSetOf<String>()

    // カテゴリーセットからインターフェース名を決定する関数
    fun determineInterface(categories: List<String>): String {
        // 複数のカテゴリーがある場合、交差インターフェース名を生成
        if (categories.size > 1) {
            val sortedCategories = categories.sorted()
            val interfaceName = sortedCategories.joinToString("") { it.replace("Content", "") } + "Intersection"
            generatedInterfaces.add(interfaceName)
            return interfaceName
        }

        // 单一カテゴリーの場合
        return categories.firstOrNull() ?: "ContentCategory"
    }

    // カテゴリーに応じたDSLインターフェースを決定する関数
    fun determineDslInterface(interfaceName: String, categories: List<String>): String {
        // 交差インターフェースの場合、対応するDSLインターフェースを生成
        if (interfaceName.endsWith("Intersection")) {
            val dslName = interfaceName.replace("Intersection", "Dsl")
            generatedInterfaces.add("${dslName}_DSL") // DSLインターフェースも追跡
            return dslName
        }

        // 単一インターフェースの場合の従来のロジック
        return when (interfaceName) {
            "FlowContent" -> "FlowContentDsl"
            "PhrasingContent" -> "PhrasingContentDsl"
            "MetadataContent" -> "MetadataContentDsl"
            "EmbeddedContent" -> "EmbeddedContentDsl"
            "InteractiveContent" -> "InteractiveContentDsl"
            "PalpableContent" -> "PalpableContentDsl"
            "ScriptSupportingContent" -> "ScriptSupportingContentDsl"
            "SectioningContent" -> "SectioningContentDsl"
            "HeadingContent" -> "HeadingContentDsl"
            "FormAssociatedContent" -> "FormAssociatedContentDsl"
            "AutocapitalizeInheritingFormContent" -> "AutocapitalizeInheritingFormContentDsl"
            else -> "ContentDsl"
        }
    }

    // 出力先ディレクトリ
    val outputDir = "../renlin/src/commonMain/kotlin/net/kigawa/renlin/tag"
    val categoryOutputDir = "../renlin/src/commonMain/kotlin/net/kigawa/renlin/category"
    File(outputDir).mkdirs()
    File(categoryOutputDir).mkdirs()

    // 各タグのクラスを生成
    tagCategories.forEach { (tag, categoriesValue) ->
        // String または List<String> をリストに統一
        val categories = when (categoriesValue) {
            is String -> listOf(categoriesValue)
            is List<*> -> categoriesValue as List<String>
            else -> emptyList<String>()
        }

        val className = tag.replaceFirstChar { it.uppercase() }
        // タグ名が Kotlin の予約語の場合はエスケープする
        val escapement = when (tag) {
            "object" -> "`object`"
            "var" -> "`var`"
            else -> tag
        }

        // カテゴリに応じたインターフェースとDSLクラスの選択
        val categoryInterface = determineInterface(categories)
        val dslInterface = determineDslInterface(categoryInterface, categories)

        val fileContent = """
            package net.kigawa.renlin.tag

            import net.kigawa.renlin.category.$categoryInterface
            import net.kigawa.renlin.category.$dslInterface
            import net.kigawa.renlin.dsl.DslBase
            import net.kigawa.renlin.dsl.Dsl
            import net.kigawa.renlin.element.TagNode
            import net.kigawa.renlin.tag.component.TagComponent1

            /**
             * HTML <$tag> element
             * 
             * Categories: ${categories.joinToString(", ")}
             */
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
        println("Generated: ${className}.kt")
    }

    // 交差インターフェースとDSLを同じファイルに生成
    generatedInterfaces.forEach { interfaceName ->
        if (interfaceName.endsWith("_DSL")) return@forEach // DSLマーカーはスキップ

        // インターフェース名から元のカテゴリーを復元
        val originalCategories = mutableListOf<String>()

        // 実際に使用されているカテゴリーの組み合わせを探す
        tagCategories.values.forEach { categoriesValue ->
            val categories = when (categoriesValue) {
                is String -> listOf(categoriesValue)
                is List<*> -> categoriesValue as List<String>
                else -> emptyList<String>()
            }

            if (categories.size > 1) {
                val sortedCategories = categories.sorted()
                val testInterfaceName = sortedCategories.joinToString("") { it.replace("Content", "") } + "Intersection"
                if (testInterfaceName == interfaceName && originalCategories.isEmpty()) {
                    originalCategories.addAll(sortedCategories)
                }
            }
        }

        if (originalCategories.isNotEmpty()) {
            val dslName = interfaceName.replace("Intersection", "Dsl")

            // 最初のカテゴリーのDSLを基底として使用
            val baseDsl = when {
                originalCategories.contains("FlowContent") -> "FlowContentDsl"
                originalCategories.contains("PhrasingContent") -> "PhrasingContentDsl"
                originalCategories.contains("MetadataContent") -> "MetadataContentDsl"
                originalCategories.contains("EmbeddedContent") -> "EmbeddedContentDsl"
                originalCategories.contains("InteractiveContent") -> "InteractiveContentDsl"
                originalCategories.contains("PalpableContent") -> "PalpableContentDsl"
                originalCategories.contains("FormAssociatedContent") -> "FormAssociatedContentDsl"
                else -> "ContentDsl"
            }

            // インターフェースとDSLを同じファイルに生成
            val fileContent = """
                package net.kigawa.renlin.category

                interface $interfaceName : ${originalCategories.joinToString(", ")}
                interface $dslName<CATEGORY_DSL : $interfaceName> :
                    $baseDsl<CATEGORY_DSL>
            """.trimIndent()

            val interfaceName = interfaceName.replace("Intersection", "")
            val file = File("$categoryOutputDir/${interfaceName}.kt")
            file.writeText(fileContent)
            println("Generated intersection interface and DSL: ${interfaceName}.kt")
        }
    }

    println("タグのコード生成が完了しました。")
    println("生成された交差インターフェース: ${generatedInterfaces.joinToString(", ")}")
}