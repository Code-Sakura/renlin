package net.kigawa.renlin.tag.group

import net.kigawa.renlin.Html

/**
 * FlowContentable インターフェースは、フローコンテンツ要素をコンテナとして扱うための基盤を提供します。
 * このインターフェースは HTML タグ生成の DSL において、フローコンテンツおよび感覚可能なコンテンツを効果的に
 * 操作および管理するためのメソッドと拡張性を持つ構造を定義します。
 *
 * 特徴:
 * 1. DSL マーカー @Html を活用して明確なスコープ管理を行います。
 * 2. タグを追加するための演算子のオーバーロード (invoke, plus, unaryPlus) により、
 *    柔軟な構築メカニズムを提供します。
 * 3. タグをネスト可能で、構造化された HTML ビルディングを支援します。
 *
 * 使用例として、宣言的な方法で HTML 構造を定義するための基礎として利用することが可能です。
 */
@Html
interface FlowContentable : TagContainer<PalpableContent, FlowContentable> {

    /**
     * タグ要素をクラスおよびブロックとともに使用するメソッドです。
     *
     * @param classes クラス名を指定するオプションの文字列です。
     * @param block タグ要素に対して実行されるラムダブロックです。
     */
    operator fun <T : FlowContent> T.invoke(classes: String? = null, block: T.() -> Unit) {
    }

    /**
     * テキストを現在のフローコンテンツに追加するためのメソッドです。
     *
     * @param txt 追加するテキストの文字列です。
     */
    operator fun plus(txt: String) {}

    /**
     * 現在のフローコンテンツに文字列を直接追加するためのメソッドです。
     */
    operator fun String.unaryPlus() {

    }
}