package net.kigawa.renlin

import net.kigawa.renlin.tag.Div
import net.kigawa.renlin.tag.P


/**
 * `Tags` オブジェクトは、HTML 構造を構築する際に利用可能な基本的なタグ (`div`, `p`) を提供します。
 *
 * このオブジェクトのフィールドを使用して、DSL スタイルで柔軟な構築を実現することができます。
 */
object Tags {
    /**
     * HTML の `<div>` タグを表します。
     */
    val div = Div

    /**
     * HTML の `<p>` タグを表します。
     */
    val p = P
}