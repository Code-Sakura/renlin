package net.kigawa.renlin.css

/**
 * 単位付きの値
 */
data class CssUnit(val value: Number, val unit: String) : CssValue {
    override fun toCssString(): String = "$value$unit"
}

// 便利な拡張プロパティ
@Suppress("unused")
val Int.px: CssUnit get() = CssUnit(this, "px")
@Suppress("unused")
val Double.px: CssUnit get() = CssUnit(this, "px")
@Suppress("unused")
val Int.em: CssUnit get() = CssUnit(this, "em")
@Suppress("unused")
val Double.em: CssUnit get() = CssUnit(this, "em")
@Suppress("unused")
val Int.rem: CssUnit get() = CssUnit(this, "rem")
@Suppress("unused")
val Double.rem: CssUnit get() = CssUnit(this, "rem")
@Suppress("unused")
val Int.percent: CssUnit get() = CssUnit(this, "%")
@Suppress("unused")
val Double.percent: CssUnit get() = CssUnit(this, "%")