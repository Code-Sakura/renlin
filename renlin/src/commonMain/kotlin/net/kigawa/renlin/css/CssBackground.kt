package net.kigawa.renlin.css

/**
 * Background Repeat プロパティ
 */
@Suppress("unused")
enum class BackgroundRepeat(private val value: String) : CssValue {
    REPEAT("repeat"),
    REPEAT_X("repeat-x"),
    REPEAT_Y("repeat-y"),
    NO_REPEAT("no-repeat"),
    SPACE("space"),
    ROUND("round");

    override fun toCssString(): String = value
}

/**
 * Background Position プロパティ
 */
@Suppress("unused")
enum class BackgroundPosition(private val value: String) : CssValue {
    LEFT("left"),
    CENTER("center"),
    RIGHT("right"),
    TOP("top"),
    BOTTOM("bottom"),
    LEFT_TOP("left top"),
    LEFT_CENTER("left center"),
    LEFT_BOTTOM("left bottom"),
    CENTER_TOP("center top"),
    CENTER_CENTER("center center"),
    CENTER_BOTTOM("center bottom"),
    RIGHT_TOP("right top"),
    RIGHT_CENTER("right center"),
    RIGHT_BOTTOM("right bottom");

    override fun toCssString(): String = value
}

/**
 * Background Size プロパティ
 */
@Suppress("unused")
enum class BackgroundSize(private val value: String) : CssValue {
    AUTO("auto"),
    COVER("cover"),
    CONTAIN("contain");

    override fun toCssString(): String = value
}

/**
 * Background Attachment プロパティ
 */
@Suppress("unused")
enum class BackgroundAttachment(private val value: String) : CssValue {
    SCROLL("scroll"),
    FIXED("fixed"),
    LOCAL("local");

    override fun toCssString(): String = value
}