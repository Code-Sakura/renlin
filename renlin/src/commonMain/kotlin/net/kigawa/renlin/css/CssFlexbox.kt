package net.kigawa.renlin.css

/**
 * Flex Direction プロパティ
 */
@Suppress("unused")
enum class FlexDirection(private val value: String) : CssValue {
    ROW("row"),
    ROW_REVERSE("row-reverse"),
    COLUMN("column"),
    COLUMN_REVERSE("column-reverse");

    override fun toCssString(): String = value
}

/**
 * Flex Wrap プロパティ
 */
@Suppress("unused")
enum class FlexWrap(private val value: String) : CssValue {
    NOWRAP("nowrap"),
    WRAP("wrap"),
    WRAP_REVERSE("wrap-reverse");

    override fun toCssString(): String = value
}

/**
 * Justify Content プロパティ
 */
@Suppress("unused")
enum class JustifyContent(private val value: String) : CssValue {
    FLEX_START("flex-start"),
    FLEX_END("flex-end"),
    CENTER("center"),
    SPACE_BETWEEN("space-between"),
    SPACE_AROUND("space-around"),
    SPACE_EVENLY("space-evenly");

    override fun toCssString(): String = value
}

/**
 * Align Items プロパティ
 */
@Suppress("unused")
enum class AlignItems(private val value: String) : CssValue {
    STRETCH("stretch"),
    FLEX_START("flex-start"),
    FLEX_END("flex-end"),
    CENTER("center"),
    BASELINE("baseline");

    override fun toCssString(): String = value
}

/**
 * Align Content プロパティ
 */
@Suppress("unused")
enum class AlignContent(private val value: String) : CssValue {
    STRETCH("stretch"),
    FLEX_START("flex-start"),
    FLEX_END("flex-end"),
    CENTER("center"),
    SPACE_BETWEEN("space-between"),
    SPACE_AROUND("space-around");

    override fun toCssString(): String = value
}

/**
 * Align Self プロパティ
 */
@Suppress("unused")
enum class AlignSelf(private val value: String) : CssValue {
    AUTO("auto"),
    STRETCH("stretch"),
    FLEX_START("flex-start"),
    FLEX_END("flex-end"),
    CENTER("center"),
    BASELINE("baseline");

    override fun toCssString(): String = value
}