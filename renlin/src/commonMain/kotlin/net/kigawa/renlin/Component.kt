package net.kigawa.renlin

import net.kigawa.renlin.tag.group.Tag
import net.kigawa.renlin.tag.group.TagContainer

/**
 * `Component0` インターフェースは、HTML や DSL (Domain Specific Language) 構築において、
 * 柔軟なコンポーネント設計をサポートするために使用されます。
 *
 * このインターフェースは、指定された親コンテキスト (`PARENT`) の中で、
 * 対応するタグ (`TAG`) を用いて構造や振る舞いを定義する機能を提供します。
 *
 * `Component0` は、引数なしの呼び出し構文をサポートしており、
 * PARENT のコンテキスト中でタグを効果的に利用することができます。
 *
 * @param PARENT 親コンテキストとなる型。この型は DSL コンテキストで操作されます。
 * @param TAG 対応するタグ型。このタグを使用して構造や振る舞いを定義します。
 */
@Html
interface Component0<PARENT : TagContainer<*, PARENT>, TAG : Tag<PARENT, *>> {

    /**
     * 親コンテキストにおいて、この関数は特定のタグを用いた構造または振る舞いを定義します。
     */
    fun PARENT.call()
}

/**
 * `Component1` インターフェースは、親コンテキスト `PARENT`, 対応するタグ `TAG`,
 * そして値 `T` を使用して柔軟なコンポーネント設計をサポートするために利用されます。
 *
 * このインターフェースは、指定された親要素 (`PARENT`) に対してタグ (`TAG`) を使用し、
 * さらに値 `T` を渡すことで構造や振る舞いを定義するための DSL (Domain Specific Language) スタイルの
 * 呼び出しを提供します。
 *
 * 引数の数に基づいて Component0, Component1 などのコンポーネントが存在します。
 *
 * @param PARENT 親コンテキストとなる型。この型は DSL コンテキストで利用されます。
 * @param TAG 対応するタグ型。このタグを使用して適切な HTML または DSL 構築を行います。
 * @param T 呼び出し時に渡される値の型を指定します。
 */
@Html
interface Component1<PARENT : TagContainer<*, PARENT>, TAG : Tag<PARENT, *>, T> {
    /**
     * 親コンテキストにおいて、この関数は指定された値 `t` を用いて動的に構造または振る舞いを定義します。
     *
     * @param t 呼び出し時に渡される値
     */
    fun PARENT.call(t: T)
}