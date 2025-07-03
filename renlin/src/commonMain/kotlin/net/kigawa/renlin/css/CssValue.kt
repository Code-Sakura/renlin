package net.kigawa.renlin.css

/**
 * CSS値の基底インターフェース
 */
sealed interface CssValue {
    fun toCssString(): String
}

/**
 * 文字列値
 */
data class CssString(val value: String) : CssValue {
    override fun toCssString(): String = value
}