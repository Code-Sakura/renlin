package net.kigawa.renlin.tag.group

import net.kigawa.renlin.tag.P

/**
 * PhrasingContentable インターフェースは、`TagContainer` を拡張し、フレージングコンテンツ要素を操作するための機能を提供します。
 * このインターフェースを実装することにより、フレージングコンテンツに対するカスタムロジックや構文を定義できます。
 *
 * フレージングコンテンツは特定の文脈で使用されるコンテンツ要素を表し、追加のテキスト操作も可能です。
 */
interface PhrasingContentable : TagContainer<PalpableContent, P> {

    /**
     * プラス演算子を使用して、フレージングコンテンツにテキストを追加します。
     *
     * @param txt 追加するテキスト
     */
    operator fun <T : PhrasingContent> T.plus(txt: String) {}
}