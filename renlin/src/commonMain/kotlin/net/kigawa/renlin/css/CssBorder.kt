package net.kigawa.renlin.css

/**
 * Border Style プロパティ
 */
@Suppress("unused")
enum class BorderStyle(private val value: String) : CssValue {
    NONE("none"),
    HIDDEN("hidden"),
    DOTTED("dotted"),
    DASHED("dashed"),
    SOLID("solid"),
    DOUBLE("double"),
    GROOVE("groove"),
    RIDGE("ridge"),
    INSET("inset"),
    OUTSET("outset");

    override fun toCssString(): String = value
}

/**
 * Box Sizing プロパティ
 */
@Suppress("unused")
enum class BoxSizing(private val value: String) : CssValue {
    CONTENT_BOX("content-box"),
    BORDER_BOX("border-box");

    override fun toCssString(): String = value
}