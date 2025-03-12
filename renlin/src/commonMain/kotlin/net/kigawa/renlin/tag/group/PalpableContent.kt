package net.kigawa.renlin.tag.group

import net.kigawa.renlin.Html

/**
 * PalpableContent インターフェースは、HTML における「感覚可能なコンテンツ」を表現する要素を定義します。
 * 感覚可能なコンテンツは、視覚的に認識され、かつユーザーと相互作用可能な要素です。
 *
 * 主に FlowContent に含まれる要素として構成可能であり、Web ページの構造設計において
 * 重要な役割を担います。このインターフェースを使用して、感覚可能なコンテンツを DSL による
 * 宣言的な形式で構築および管理することができます。
 */
@Html
interface PalpableContent {
}