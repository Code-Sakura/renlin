package net.kigawa.renlin.css

/**
 * Text Align プロパティ
 */
@Suppress("unused")
enum class TextAlign(private val value: String) : CssValue {
    LEFT("left"),
    RIGHT("right"),
    CENTER("center"),
    JUSTIFY("justify"),
    START("start"),
    END("end");

    override fun toCssString(): String = value
}

/**
 * Text Decoration プロパティ
 */
@Suppress("unused")
enum class TextDecoration(private val value: String) : CssValue {
    NONE("none"),
    UNDERLINE("underline"),
    OVERLINE("overline"),
    LINE_THROUGH("line-through");

    override fun toCssString(): String = value
}

/**
 * Text Transform プロパティ
 */
@Suppress("unused")
enum class TextTransform(private val value: String) : CssValue {
    NONE("none"),
    UPPERCASE("uppercase"),
    LOWERCASE("lowercase"),
    CAPITALIZE("capitalize");

    override fun toCssString(): String = value
}

/**
 * White Space プロパティ
 */
@Suppress("unused")
enum class WhiteSpace(private val value: String) : CssValue {
    NORMAL("normal"),
    NOWRAP("nowrap"),
    PRE("pre"),
    PRE_LINE("pre-line"),
    PRE_WRAP("pre-wrap");

    override fun toCssString(): String = value
}

/**
 * Word Break プロパティ
 */
@Suppress("unused")
enum class WordBreak(private val value: String) : CssValue {
    NORMAL("normal"),
    BREAK_ALL("break-all"),
    KEEP_ALL("keep-all"),
    BREAK_WORD("break-word");

    override fun toCssString(): String = value
}

/**
 * Text Overflow プロパティ
 */
@Suppress("unused")
enum class TextOverflow(private val value: String) : CssValue {
    CLIP("clip"),
    ELLIPSIS("ellipsis");

    override fun toCssString(): String = value
}