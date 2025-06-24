package net.kigawa.renlin.css

/**
 * CSS色の基底インターフェース
 */
sealed interface CssColor : CssValue

/**
 * 名前付きの色
 */
enum class NamedColor(private val colorName: String) : CssColor {
    RED("red"),
    GREEN("green"),
    BLUE("blue"),
    BLACK("black"),
    WHITE("white"),
    TRANSPARENT("transparent"),
    GRAY("gray"),
    LIGHTGRAY("lightgray"),
    DARKGRAY("darkgray"),
    YELLOW("yellow"),
    ORANGE("orange"),
    PURPLE("purple"),
    PINK("pink"),
    BROWN("brown"),
    CYAN("cyan"),
    MAGENTA("magenta");

    override fun toCssString(): String = colorName
}

/**
 * 16進数表記
 */
data class HexColor(val hex: String) : CssColor {
    init {
        require(hex.matches(Regex("^#[0-9A-Fa-f]{3}$|^#[0-9A-Fa-f]{6}$"))) {
            "Invalid hex color format: $hex"
        }
    }

    override fun toCssString(): String = hex
}

/**
 * RGB表記
 */
data class RgbColor(val r: Int, val g: Int, val b: Int) : CssColor {
    init {
        require(r in 0..255 && g in 0..255 && b in 0..255) {
            "RGB values must be between 0 and 255"
        }
    }

    override fun toCssString(): String = "rgb($r, $g, $b)"
}

/**
 * RGBA表記（透明度付き）
 */
data class RgbaColor(val r: Int, val g: Int, val b: Int, val a: Double) : CssColor {
    init {
        require(r in 0..255 && g in 0..255 && b in 0..255) {
            "RGB values must be between 0 and 255"
        }
        require(a in 0.0..1.0) {
            "Alpha value must be between 0.0 and 1.0"
        }
    }

    override fun toCssString(): String = "rgba($r, $g, $b, $a)"
}

/**
 * 色のファクトリオブジェクト
 */
@Suppress("unused")
object Color {
    // よく使う色の定数
    val RED = NamedColor.RED
    val GREEN = NamedColor.GREEN
    val BLUE = NamedColor.BLUE
    val BLACK = NamedColor.BLACK
    val WHITE = NamedColor.WHITE
    val TRANSPARENT = NamedColor.TRANSPARENT
    val GRAY = NamedColor.GRAY
    val LIGHTGRAY = NamedColor.LIGHTGRAY
    val DARKGRAY = NamedColor.DARKGRAY
    val YELLOW = NamedColor.YELLOW
    val ORANGE = NamedColor.ORANGE
    val PURPLE = NamedColor.PURPLE
    val PINK = NamedColor.PINK
    val BROWN = NamedColor.BROWN
    val CYAN = NamedColor.CYAN
    val MAGENTA = NamedColor.MAGENTA

    // ファクトリメソッド
    fun hex(hex: String): HexColor = HexColor(hex)
    fun rgb(r: Int, g: Int, b: Int): RgbColor = RgbColor(r, g, b)
    fun rgba(r: Int, g: Int, b: Int, a: Double): RgbaColor = RgbaColor(r, g, b, a)
}

// 文字列からの便利な変換
val String.color: HexColor
    get() = HexColor(if (startsWith("#")) this else "#$this")