package net.kigawa.renlin.tag

import net.kigawa.renlin.Html
import net.kigawa.renlin.tag.group.*


/**
 * `Div` オブジェクトは、HTML の `<div>` タグを表現するための要素です。
 *
 * このオブジェクトは以下のインターフェースを実装しています:
 * - `FlowContent`: 文書のフローに関連するコンテンツを定義するためのインターフェース。
 * - `PalpableContent`: 視覚的に意味のあるコンテンツを表現するためのインターフェース。
 * - `FlowContentable`: `FlowContent` としての動作を持つ要素を拡張するためのインターフェース。
 *
 * 主な特徴:
 * - HTML の基本的なブロックコンテナとして機能し、内容やその他のタグをラップする役割を担います。
 * - DSL スタイルの HTML 構築を容易にするために利用されます。
 * - ネストされたスコープ管理やカスタムロジック構築の基盤を提供します。
 */
@Html
object Div : FlowContent, PalpableContent, FlowContentable, Tag<FlowContentable, Div> {
}