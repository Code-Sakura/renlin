package net.kigawa.renlin.tag.group

import net.kigawa.renlin.Component0
import net.kigawa.renlin.Component1

/**
 * `TagContainer` インターフェースは、タグベースの DSL (Domain Specific Language) の設計をサポートするために使用されます。
 * このインターフェースは、特定のタグ構造や動作を定義する際の基盤を提供します。
 *
 * ALLOWED 型の要素と、特定のコンテナ自身 (OWN 型) を基に柔軟な操作が可能です。
 *
 * @param ALLOWED 許可されたタグ要素の型。この型は DSL において操作対象となります。
 * @param OWN 自身の型を指定します。この型は `TagContainer` 自体を参照します。
 */
interface TagContainer<ALLOWED, OWN : TagContainer<ALLOWED, OWN>> {

    /**
     * `ALLOWED.invoke` 演算子は、タグのプロパティや要素を定義するために使用されます。
     * @param classes クラス属性を指定するためのオプション文字列。
     * @param block タグに関連するプロパティや操作を定義するラムダ式。
     */
    operator fun ALLOWED.invoke(classes: String? = null, block: ALLOWED.() -> Unit) {
    }


    /**
     * `Component0.invoke` 演算子は、コンポーネントを呼び出し、関連付けられたタグの標準動作を起動します。
     */
    operator fun Component0<OWN, *>.invoke() {
        @Suppress("UNCHECKED_CAST")
        (this@TagContainer as OWN).call()
    }

    /**
     * `Component1.invoke` 演算子は、渡された値 `t` を利用し、関連付けられたタグにアクションを適用します。
     * @param t この操作に必要な値。
     */
    operator fun <T> Component1<OWN, Tag<OWN, *>, T>.invoke(t: T) {
        @Suppress("UNCHECKED_CAST")
        (this@TagContainer as OWN).call(t)
    }

}