package net.kigawa.renlin.tag.group

import net.kigawa.renlin.Component0
import net.kigawa.renlin.Component1

/**
 * `Tag` インターフェースは、タグ構築のための基盤を提供します。このインターフェースは柔軟なタグ階層を
 * サポートし、関連する親コンテナおよび自身の型に基づく動作を定義します。
 *
 * @param PARENT 親コンテナの型。この型は `TagContainer` で定義されます。
 * @param OWN 自身の型を指定します。この型は現在のタグを参照します。
 */
interface Tag<PARENT : TagContainer<in OWN, PARENT>, OWN : Tag<PARENT, OWN>> {

    /**
     * 引数なしのタグ操作をサポートする `component` メソッド。
     * このメソッドは引数を伴わないカスタムタグの動作を簡略化するために使用されます。
     *
     * @param func タグの操作を行う関数。
     * @return `Component0` のインスタンスとしてタグ操作を提供します。
     */
    fun component(func: OWN.() -> Unit): Component0<PARENT, Tag<PARENT, OWN>> {
        return object : Component0<PARENT, Tag<PARENT, OWN>> {
            override fun PARENT.call() {
                @Suppress("UNCHECKED_CAST")
                (this@Tag as OWN).invoke { func() }
            }
        }
    }

    /**
     * 引数ありのタグ操作をサポートする `component` メソッド。
     * このメソッドは一つの引数を伴うカスタムタグの動作を簡略化するために使用されます。
     *
     * @param func タグの操作を行う関数。
     * @param T 関数に渡される引数の型。
     * @return `Component1` のインスタンスとしてタグ操作を提供します。
     */
    fun <T> component(func: OWN.(T) -> Unit): Component1<PARENT, Tag<PARENT, OWN>, T> {
        return object : Component1<PARENT, Tag<PARENT, OWN>, T> {
            override fun PARENT.call(t: T) {
                @Suppress("UNCHECKED_CAST")
                (this@Tag as OWN){ func(t) }
            }
        }
    }

}