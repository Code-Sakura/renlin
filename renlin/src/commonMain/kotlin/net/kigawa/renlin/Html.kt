package net.kigawa.renlin

/**
 * `Html` アノテーションは、DSL (Domain Specific Language) スタイルで
 * HTML を構築するためのマーカーとして使用されます。
 *
 * このアノテーションを使用することにより、HTML 構造をDSL形式で定義する際の
 * 関連性を明確にし、ネストされたスコープ管理を容易にします。
 *
 * 主な目的:
 * - DSL 内で使用される HTML 要素やタグの定義を明確にする。
 * - スコープの乱用を防ぎ、構造的な設計を可能にする。
 *
 * 使用場所:
 * - HTML タグやコンテナを表現するインターフェース、クラス、オブジェクトなど。
 * - DSL を活用した柔軟な HTML 構築ロジックの中。
 */
@DslMarker
annotation class Html()