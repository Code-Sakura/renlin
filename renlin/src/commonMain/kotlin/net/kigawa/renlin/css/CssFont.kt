package net.kigawa.renlin.css

/**
 * フォントウェイト
 */
@Suppress("unused")
enum class FontWeight(private val value: String) : CssValue {
    NORMAL("normal"),
    BOLD("bold"),
    BOLDER("bolder"),
    LIGHTER("lighter"),
    W100("100"),
    W200("200"),
    W300("300"),
    W400("400"),
    W500("500"),
    W600("600"),
    W700("700"),
    W800("800"),
    W900("900");

    override fun toCssString(): String = value
}

/**
 * フォントスタイル
 */
@Suppress("unused")
enum class FontStyle(private val value: String) : CssValue {
    NORMAL("normal"),
    ITALIC("italic"),
    OBLIQUE("oblique");

    override fun toCssString(): String = value
}

/**
 * フォントバリアント
 */
@Suppress("unused")
enum class FontVariant(private val value: String) : CssValue {
    NORMAL("normal"),
    SMALLCAPS("small-caps");

    override fun toCssString(): String = value
}