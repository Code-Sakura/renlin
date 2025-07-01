import model.AllowedCategories
import model.TagCategories
import model.TagInfo

// カテゴリーの親子関係を定義
val categoryParents = mapOf(
    "PhrasingContent" to "FlowContent",
    "HeadingContent" to "FlowContent",
    "SectioningContent" to "FlowContent",
    "EmbeddedContent" to "PhrasingContent",
    "InteractiveContent" to "PhrasingContent",
    "FlowContent" to "EventTarget",
    "MetaDataContent" to "FlowContent",
    "PhrasingPhrasingContent" to "PhrasingContent",
    "FlowPhrasingContent" to "FlowContent",
    "MetaDataPhrasingContent" to "MetaDataContent",
    "FlowMetaDataContent" to "FlowContent",
    "HeadingPhrasingContent" to "HeadingContent",
    "SectioningRoot" to "Any",
    "SectioningHeadings" to "HeadingContent",
    "FlowSectioningContent" to "FlowContent",
)

// 元のコードの並び順を維持するためのタグリスト
val tagCategories = setOf(
    // Main root
    TagInfo("html", TagCategories("FlowContent"), AllowedCategories("FlowContent")),

    // Document metadata
    TagInfo("base", TagCategories("MetadataContent"), AllowedCategories("MetadataContent")),
    TagInfo("head", TagCategories("FlowContent"), AllowedCategories("FlowContent")),
    TagInfo(
        "link", TagCategories("MetadataContent", "FlowContent", "PhrasingContent"),
        AllowedCategories("MetadataContent", "FlowContent", "PhrasingContent")
    ),
    TagInfo(
        "meta", TagCategories(setOf("MetadataContent", "FlowContent", "PhrasingContent")),
        AllowedCategories(setOf("MetadataContent", "FlowContent", "PhrasingContent"))
    ),
    TagInfo("style", TagCategories("MetadataContent"), AllowedCategories("MetadataContent")),
    TagInfo("title", TagCategories("MetadataContent"), AllowedCategories("MetadataContent")),

    //Sectioning root
    TagInfo("body", TagCategories("FlowContent"), AllowedCategories("FlowContent")),

    // Content sectioning
    TagInfo(
        "address", TagCategories(setOf("FlowContent", "PalpableContent")),
        AllowedCategories(setOf("FlowContent", "PalpableContent"))
    ),
    TagInfo(
        "article", TagCategories(setOf("FlowContent", "SectioningContent", "PalpableContent")), AllowedCategories()
    ),
    TagInfo(
        "aside", TagCategories(setOf("FlowContent", "SectioningContent", "PalpableContent")), AllowedCategories()
    ),
    TagInfo("footer", TagCategories(setOf("FlowContent", "PalpableContent")), AllowedCategories()),
    TagInfo("header", TagCategories(setOf("FlowContent", "PalpableContent")), AllowedCategories()),
    TagInfo("h1", TagCategories(setOf("FlowContent", "HeadingContent", "PalpableContent")), AllowedCategories()),
    TagInfo("h2", TagCategories(setOf("FlowContent", "HeadingContent", "PalpableContent")), AllowedCategories()),
    TagInfo("h3", TagCategories(setOf("FlowContent", "HeadingContent", "PalpableContent")), AllowedCategories()),
    TagInfo("h4", TagCategories(setOf("FlowContent", "HeadingContent", "PalpableContent")), AllowedCategories()),
    TagInfo("h5", TagCategories(setOf("FlowContent", "HeadingContent", "PalpableContent")), AllowedCategories()),
    TagInfo("h6", TagCategories(setOf("FlowContent", "HeadingContent", "PalpableContent")), AllowedCategories()),
    TagInfo("hgroup", TagCategories(setOf("FlowContent", "HeadingContent")), AllowedCategories()),
    TagInfo("main", TagCategories(setOf("FlowContent", "PalpableContent")), AllowedCategories()),
    TagInfo(
        "nav", TagCategories(setOf("FlowContent", "SectioningContent", "PalpableContent")), AllowedCategories()
    ),
    TagInfo(
        "section", TagCategories(setOf("FlowContent", "SectioningContent", "PalpableContent")), AllowedCategories()
    ),
    TagInfo("search", TagCategories(setOf("FlowContent", "PalpableContent")), AllowedCategories()),

    // Text content
    TagInfo("blockquote", TagCategories(setOf("FlowContent", "PalpableContent")), AllowedCategories()),
    TagInfo("dd", TagCategories("FlowContent"), AllowedCategories()),
    TagInfo(
        "div", TagCategories(setOf("FlowContent", "PalpableContent")),
        AllowedCategories(setOf("FlowContent", "PalpableContent", "PhrasingContent"))
    ),
    TagInfo("dl", TagCategories(setOf("FlowContent", "PalpableContent")), AllowedCategories()),
    TagInfo("dt", TagCategories("FlowContent"), AllowedCategories()),
    TagInfo("figcaption", TagCategories("FlowContent"), AllowedCategories()),
    TagInfo("figure", TagCategories(setOf("FlowContent", "PalpableContent")), AllowedCategories()),
    TagInfo("hr", TagCategories("FlowContent"), AllowedCategories()),
    TagInfo("li", TagCategories("FlowContent"), AllowedCategories()),
    TagInfo("menu", TagCategories("FlowContent"), AllowedCategories()),
    TagInfo("ol", TagCategories(setOf("FlowContent", "PalpableContent")), AllowedCategories()),
    TagInfo("p", TagCategories(setOf("FlowContent", "PalpableContent")), AllowedCategories("PhrasingContent")),
    TagInfo("pre", TagCategories(setOf("FlowContent", "PalpableContent")), AllowedCategories()),
    TagInfo("ul", TagCategories(setOf("FlowContent", "PalpableContent")), AllowedCategories()),

    // Inline text semantics
    TagInfo(
        "a", TagCategories(setOf("FlowContent", "PhrasingContent", "PalpableContent", "InteractiveContent")),
        AllowedCategories(setOf("FlowContent", "PhrasingContent", "PalpableContent", "InteractiveContent"))
    ),
    TagInfo(
        "abbr", TagCategories(setOf("FlowContent", "PhrasingContent", "PalpableContent")), AllowedCategories()
    ),
    TagInfo("b", TagCategories(setOf("FlowContent", "PhrasingContent", "PalpableContent")), AllowedCategories()),
    TagInfo("bdi", TagCategories(setOf("FlowContent", "PhrasingContent", "PalpableContent")), AllowedCategories()),
    TagInfo("bdo", TagCategories(setOf("FlowContent", "PhrasingContent", "PalpableContent")), AllowedCategories()),
    TagInfo("br", TagCategories(setOf("FlowContent", "PhrasingContent")), AllowedCategories()),
    TagInfo(
        "cite", TagCategories(setOf("FlowContent", "PhrasingContent", "PalpableContent")), AllowedCategories()
    ),
    TagInfo(
        "code", TagCategories(setOf("FlowContent", "PhrasingContent", "PalpableContent")), AllowedCategories()
    ),
    TagInfo(
        "data", TagCategories(setOf("FlowContent", "PhrasingContent", "PalpableContent")), AllowedCategories()
    ),
    TagInfo("dfn", TagCategories(setOf("FlowContent", "PhrasingContent", "PalpableContent")), AllowedCategories()),
    TagInfo("em", TagCategories(setOf("FlowContent", "PhrasingContent", "PalpableContent")), AllowedCategories()),
    TagInfo("i", TagCategories(setOf("FlowContent", "PhrasingContent", "PalpableContent")), AllowedCategories()),
    TagInfo("kbd", TagCategories(setOf("FlowContent", "PhrasingContent", "PalpableContent")), AllowedCategories()),
    TagInfo(
        "mark", TagCategories(setOf("FlowContent", "PhrasingContent", "PalpableContent")), AllowedCategories()
    ),
    TagInfo("q", TagCategories(setOf("FlowContent", "PhrasingContent", "PalpableContent")), AllowedCategories()),
    TagInfo("rp", TagCategories(setOf("FlowContent", "PhrasingContent")), AllowedCategories()),
    TagInfo("rt", TagCategories(setOf("FlowContent", "PhrasingContent")), AllowedCategories()),
    TagInfo(
        "ruby", TagCategories(setOf("FlowContent", "PhrasingContent", "PalpableContent")), AllowedCategories()
    ),
    TagInfo("s", TagCategories(setOf("FlowContent", "PhrasingContent", "PalpableContent")), AllowedCategories()),
    TagInfo(
        "samp", TagCategories(setOf("FlowContent", "PhrasingContent", "PalpableContent")), AllowedCategories()
    ),
    TagInfo(
        "small", TagCategories(setOf("FlowContent", "PhrasingContent", "PalpableContent")), AllowedCategories()
    ),
    TagInfo(
        "span", TagCategories(setOf("FlowContent", "PhrasingContent", "PalpableContent")), AllowedCategories()
    ),
    TagInfo(
        "strong", TagCategories(setOf("FlowContent", "PhrasingContent", "PalpableContent")), AllowedCategories()
    ),
    TagInfo("sub", TagCategories(setOf("FlowContent", "PhrasingContent", "PalpableContent")), AllowedCategories()),
    TagInfo("sup", TagCategories(setOf("FlowContent", "PhrasingContent", "PalpableContent")), AllowedCategories()),
    TagInfo(
        "time", TagCategories(setOf("FlowContent", "PhrasingContent", "PalpableContent")), AllowedCategories()
    ),
    TagInfo("u", TagCategories(setOf("FlowContent", "PhrasingContent", "PalpableContent")), AllowedCategories()),
    TagInfo("var", TagCategories(setOf("FlowContent", "PhrasingContent", "PalpableContent")), AllowedCategories()),
    TagInfo("wbr", TagCategories(setOf("FlowContent", "PhrasingContent")), AllowedCategories()),

    // Image and multimedia
    TagInfo("area", TagCategories(setOf("FlowContent", "PhrasingContent")), AllowedCategories()),
    TagInfo(
        "audio", TagCategories(
            setOf("FlowContent", "PhrasingContent", "EmbeddedContent", "PalpableContent", "InteractiveContent")
        ), AllowedCategories()
    ),
    TagInfo(
        "img", TagCategories(
            setOf(
                "FlowContent", "PhrasingContent", "EmbeddedContent", "PalpableContent", "FormAssociatedContent",
                "InteractiveContent"
            )
        ), AllowedCategories()
    ),
    TagInfo("map", TagCategories(setOf("FlowContent", "PhrasingContent", "PalpableContent")), AllowedCategories()),
    TagInfo("track", TagCategories("FlowContent"), AllowedCategories()),
    TagInfo(
        "video", TagCategories(
            setOf("FlowContent", "PhrasingContent", "EmbeddedContent", "PalpableContent", "InteractiveContent")
        ), AllowedCategories()
    ),

    // Embedded content
    TagInfo(
        "embed", TagCategories(
            setOf("FlowContent", "PhrasingContent", "EmbeddedContent", "InteractiveContent", "PalpableContent")
        ), AllowedCategories()
    ),
    TagInfo("fencedframe", TagCategories("FlowContent"), AllowedCategories()),
    TagInfo(
        "iframe", TagCategories(
            setOf("FlowContent", "PhrasingContent", "EmbeddedContent", "InteractiveContent", "PalpableContent")
        ), AllowedCategories()
    ),
    TagInfo(
        "object", TagCategories(
            setOf(
                "FlowContent", "PhrasingContent", "EmbeddedContent", "PalpableContent", "FormAssociatedContent",
                "InteractiveContent"
            )
        ), AllowedCategories()
    ),
    TagInfo(
        "picture", TagCategories(setOf("FlowContent", "PhrasingContent", "EmbeddedContent", "PalpableContent")),
        AllowedCategories(setOf("FlowContent", "PhrasingContent", "EmbeddedContent", "PalpableContent"))
    ),
    TagInfo("source", TagCategories("FlowContent"), AllowedCategories("FlowContent")),

    // SVG and MathML
    TagInfo(
        "svg", TagCategories(setOf("FlowContent", "PhrasingContent", "EmbeddedContent", "PalpableContent")),
        AllowedCategories(setOf("FlowContent", "PhrasingContent", "EmbeddedContent", "PalpableContent"))
    ),
    TagInfo(
        "math", TagCategories(setOf("FlowContent", "PhrasingContent", "EmbeddedContent", "PalpableContent")),
        AllowedCategories(setOf("FlowContent", "PhrasingContent", "EmbeddedContent", "PalpableContent"))
    ),

    // Scripting
    TagInfo(
        "canvas", TagCategories(setOf("FlowContent", "PhrasingContent", "EmbeddedContent", "PalpableContent")),
        AllowedCategories(setOf("FlowContent", "PhrasingContent", "EmbeddedContent", "PalpableContent"))
    ),
    TagInfo(
        "noscript", TagCategories(setOf("MetadataContent", "FlowContent", "PhrasingContent")),
        AllowedCategories(setOf("MetadataContent", "FlowContent", "PhrasingContent"))
    ),
    TagInfo(
        "script",
        TagCategories(setOf("MetadataContent", "FlowContent", "PhrasingContent", "ScriptSupportingContent")),
        AllowedCategories(setOf("MetadataContent", "FlowContent", "PhrasingContent", "ScriptSupportingContent"))
    ),

    // Demarcating edits
    TagInfo(
        "del", TagCategories(setOf("FlowContent", "PhrasingContent", "PalpableContent")),
        AllowedCategories(setOf("FlowContent", "PhrasingContent", "PalpableContent"))
    ),
    TagInfo(
        "ins", TagCategories(setOf("FlowContent", "PhrasingContent", "PalpableContent")),
        AllowedCategories(setOf("FlowContent", "PhrasingContent", "PalpableContent"))
    ),

    // Table content
    TagInfo("caption", TagCategories("FlowContent"), AllowedCategories("FlowContent")),
    TagInfo("col", TagCategories("FlowContent"), AllowedCategories("FlowContent")),
    TagInfo("colgroup", TagCategories("FlowContent"), AllowedCategories("FlowContent")),
    TagInfo(
        "table", TagCategories(setOf("FlowContent", "PalpableContent")),
        AllowedCategories(setOf("FlowContent", "PalpableContent"))
    ),
    TagInfo("tbody", TagCategories("FlowContent"), AllowedCategories("FlowContent")),
    TagInfo("td", TagCategories("FlowContent"), AllowedCategories("FlowContent")),
    TagInfo("tfoot", TagCategories("FlowContent"), AllowedCategories("FlowContent")),
    TagInfo("th", TagCategories("FlowContent"), AllowedCategories("FlowContent")),
    TagInfo("thead", TagCategories("FlowContent"), AllowedCategories("FlowContent")),
    TagInfo("tr", TagCategories("FlowContent"), AllowedCategories("FlowContent")),

    // Forms
    TagInfo(
        "button", TagCategories(
            setOf(
                "FlowContent", "PhrasingContent", "InteractiveContent", "PalpableContent", "FormAssociatedContent"
            )
        ), AllowedCategories(
            setOf(
                "FlowContent", "PhrasingContent", "InteractiveContent", "PalpableContent", "FormAssociatedContent"
            )
        )
    ),
    TagInfo(
        "datalist", TagCategories(setOf("FlowContent", "PhrasingContent")),
        AllowedCategories(setOf("FlowContent", "PhrasingContent"))
    ),
    TagInfo(
        "fieldset", TagCategories(
            setOf("FlowContent", "PalpableContent", "FormAssociatedContent", "AutocapitalizeInheritingFormContent")
        ), AllowedCategories(
            setOf("FlowContent", "PalpableContent", "FormAssociatedContent", "AutocapitalizeInheritingFormContent")
        )
    ),
    TagInfo(
        "form", TagCategories(setOf("FlowContent", "PalpableContent")),
        AllowedCategories(setOf("FlowContent", "PalpableContent"))
    ),
    TagInfo(
        "input", TagCategories(
            setOf(
                "FlowContent", "PhrasingContent", "PalpableContent", "InteractiveContent", "FormAssociatedContent"
            )
        ), AllowedCategories(
            setOf(
                "FlowContent", "PhrasingContent", "PalpableContent", "InteractiveContent", "FormAssociatedContent"
            )
        )
    ),
    TagInfo(
        "label", TagCategories(setOf("FlowContent", "PhrasingContent", "InteractiveContent", "PalpableContent")),
        AllowedCategories()
    ),
    TagInfo("legend", TagCategories("FlowContent"), AllowedCategories()),
    TagInfo(
        "meter", TagCategories(setOf("FlowContent", "PhrasingContent", "PalpableContent")), AllowedCategories()
    ),
    TagInfo("optgroup", TagCategories("FlowContent"), AllowedCategories()),
    TagInfo("option", TagCategories("FlowContent"), AllowedCategories()),
    TagInfo(
        "output",
        TagCategories(setOf("FlowContent", "PhrasingContent", "PalpableContent", "FormAssociatedContent")),
        AllowedCategories()
    ),
    TagInfo(
        "progress", TagCategories(setOf("FlowContent", "PhrasingContent", "PalpableContent")), AllowedCategories()
    ),
    TagInfo(
        "select", TagCategories(
            setOf(
                "FlowContent", "PhrasingContent", "InteractiveContent", "PalpableContent", "FormAssociatedContent"
            )
        ), AllowedCategories()
    ),
    TagInfo("selectedcontent", TagCategories("FlowContent"), AllowedCategories()),
    TagInfo(
        "textarea", TagCategories(
            setOf(
                "FlowContent", "PhrasingContent", "InteractiveContent", "PalpableContent", "FormAssociatedContent"
            )
        ), AllowedCategories()
    ),

    // Interactive elements
    TagInfo(
        "details", TagCategories(setOf("FlowContent", "InteractiveContent", "PalpableContent")),
        AllowedCategories()
    ),
    TagInfo("dialog", TagCategories("FlowContent"), AllowedCategories()),
    TagInfo("summary", TagCategories("FlowContent"), AllowedCategories()),

    // Web Components
    TagInfo("slot", TagCategories(setOf("FlowContent", "PhrasingContent")), AllowedCategories()),
    TagInfo(
        "template",
        TagCategories(
            setOf("MetadataContent", "FlowContent", "PhrasingContent", "ScriptSupportingContent")
        ),
        AllowedCategories()
    )
)
