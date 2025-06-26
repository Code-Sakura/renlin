package net.kigawa.renlin.css

/**
 * Cursor プロパティ
 */
@Suppress("unused")
enum class Cursor(private val value: String) : CssValue {
    AUTO("auto"),
    DEFAULT("default"),
    POINTER("pointer"),
    TEXT("text"),
    WAIT("wait"),
    HELP("help"),
    CROSSHAIR("crosshair"),
    MOVE("move"),
    NOT_ALLOWED("not-allowed"),
    GRAB("grab"),
    GRABBING("grabbing"),
    RESIZE_E("e-resize"),
    RESIZE_N("n-resize"),
    RESIZE_NE("ne-resize"),
    RESIZE_NW("nw-resize"),
    RESIZE_S("s-resize"),
    RESIZE_SE("se-resize"),
    RESIZE_SW("sw-resize"),
    RESIZE_W("w-resize");

    override fun toCssString(): String = value
}

/**
 * User Select プロパティ
 */
@Suppress("unused")
enum class UserSelect(private val value: String) : CssValue {
    AUTO("auto"),
    NONE("none"),
    TEXT("text"),
    ALL("all");

    override fun toCssString(): String = value
}

/**
 * Pointer Events プロパティ
 */
@Suppress("unused")
enum class PointerEvents(private val value: String) : CssValue {
    AUTO("auto"),
    NONE("none");

    override fun toCssString(): String = value
}

/**
 * Object Fit プロパティ
 */
@Suppress("unused")
enum class ObjectFit(private val value: String) : CssValue {
    FILL("fill"),
    CONTAIN("contain"),
    COVER("cover"),
    NONE("none"),
    SCALE_DOWN("scale-down");

    override fun toCssString(): String = value
}

/**
 * Vertical Align プロパティ
 */
@Suppress("unused")
enum class VerticalAlign(private val value: String) : CssValue {
    BASELINE("baseline"),
    TOP("top"),
    MIDDLE("middle"),
    BOTTOM("bottom"),
    TEXT_TOP("text-top"),
    TEXT_BOTTOM("text-bottom"),
    SUB("sub"),
    SUPER("super");

    override fun toCssString(): String = value
}