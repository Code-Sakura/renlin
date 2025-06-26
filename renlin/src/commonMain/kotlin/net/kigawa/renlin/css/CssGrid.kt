package net.kigawa.renlin.css

/**
 * Grid Auto Flow プロパティ
 */
@Suppress("unused")
enum class GridAutoFlow(private val value: String) : CssValue {
    ROW("row"),
    COLUMN("column"),
    ROW_DENSE("row dense"),
    COLUMN_DENSE("column dense");

    override fun toCssString(): String = value
}

/**
 * Justify Items プロパティ
 */
@Suppress("unused")
enum class JustifyItems(private val value: String) : CssValue {
    START("start"),
    END("end"),
    CENTER("center"),
    STRETCH("stretch");

    override fun toCssString(): String = value
}

/**
 * Justify Self プロパティ
 */
@Suppress("unused")
enum class JustifySelf(private val value: String) : CssValue {
    AUTO("auto"),
    START("start"),
    END("end"),
    CENTER("center"),
    STRETCH("stretch");

    override fun toCssString(): String = value
}

/**
 * Place Items プロパティ
 */
@Suppress("unused")
enum class PlaceItems(private val value: String) : CssValue {
    START("start"),
    END("end"),
    CENTER("center"),
    STRETCH("stretch");

    override fun toCssString(): String = value
}

/**
 * Place Self プロパティ
 */
@Suppress("unused")
enum class PlaceSelf(private val value: String) : CssValue {
    AUTO("auto"),
    START("start"),
    END("end"),
    CENTER("center"),
    STRETCH("stretch");

    override fun toCssString(): String = value
}