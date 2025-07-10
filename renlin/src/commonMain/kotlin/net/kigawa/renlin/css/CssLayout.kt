package net.kigawa.renlin.css

/**
 * Display プロパティ
 */
@Suppress("unused")
enum class Display(private val value: String) : CssValue {
    BLOCK("block"),
    INLINE("inline"),
    INLINE_BLOCK("inline-block"),
    FLEX("flex"),
    INLINE_FLEX("inline-flex"),
    GRID("grid"),
    INLINE_GRID("inline-grid"),
    TABLE("table"),
    TABLE_CELL("table-cell"),
    TABLE_ROW("table-row"),
    NONE("none");

    override fun toCssString(): String = value
}

/**
 * Position プロパティ
 */
@Suppress("unused")
enum class Position(private val value: String) : CssValue {
    STATIC("static"),
    RELATIVE("relative"),
    ABSOLUTE("absolute"),
    FIXED("fixed"),
    STICKY("sticky");

    override fun toCssString(): String = value
}

/**
 * Overflow プロパティ
 */
@Suppress("unused")
enum class Overflow(private val value: String) : CssValue {
    VISIBLE("visible"),
    HIDDEN("hidden"),
    SCROLL("scroll"),
    AUTO("auto");

    override fun toCssString(): String = value
}

/**
 * Float プロパティ
 */
@Suppress("unused")
enum class Float(private val value: String) : CssValue {
    NONE("none"),
    LEFT("left"),
    RIGHT("right");

    override fun toCssString(): String = value
}

/**
 * Clear プロパティ
 */
@Suppress("unused")
enum class Clear(private val value: String) : CssValue {
    NONE("none"),
    LEFT("left"),
    RIGHT("right"),
    BOTH("both");

    override fun toCssString(): String = value
}

/**
 * Visibility プロパティ
 */
@Suppress("unused")
enum class Visibility(private val value: String) : CssValue {
    VISIBLE("visible"),
    HIDDEN("hidden"),
    COLLAPSE("collapse");

    override fun toCssString(): String = value
}