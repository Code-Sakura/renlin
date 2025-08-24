package net.kigawa.renlin.state

import net.kigawa.renlin.AutoFill
import net.kigawa.renlin.w3c.event.WebPointerEvent
import kotlin.reflect.KClass
import kotlin.reflect.typeOf

/**
 * DSLの状態に関するデータとイベントハンドラーを保持するデータクラス
 *
 * このクラスは、DSL要素の状態管理において、基本的なイベントハンドラー(クリックイベント)と
 * 型安全な追加データの管理機能を提供します。
 * 追加データは、コンテキストクラス、型、キーによって識別され、型安全にアクセスできます)
 *
 * @property key DSLの状態データの一意のキー
 * @property onClick クリックイベントのハンドラー
 * @property additionalData 追加データのリスト
 *
 * @see AdditionalDslStateData
 */

data class DslStateData(
    /** DSLの状態データの一意の識別子 */
    val key: String,
    /** クリックイベントのハンドラー */
    var onClick: ((WebPointerEvent) -> Unit)? = null,
    /** href属性の値 */
    var href: String? = null,
    /**
     * 追加データのリスト
     *
     * 各追加データは、特定のコンテキストクラスに関連付けられ、値の型とキーを持ちます。
     */
    var additionalData: List<AdditionalDslStateData<*>> = listOf()
) {
    /**
     * 指定されたコンテキストクラスに対して型安全に追加データを設定します。
     *
     * 同じコンテキストクラス、型、キーの組み合わせで既存のデータがある場合は置き換えられます。
     *
     * @param contextClass 追加データが関連付けられたコンテキストクラス
     * @param value 追加する値
     * @param T 追加データの値の型
     * @param key 追加データの一意のキー
     */
    inline fun <reified T : Any> setAdditionalData(contextClass: KClass<*>, value: T,  @AutoFill key: String? = null) {
        removeAdditionalData<T>(contextClass)
        additionalData = additionalData + AdditionalDslStateData(
            contextClass, typeOf<T>(), key, value
        )
    }
    /**
     *  指定されたコンテキストクラス、型、キーに一致する追加データを削除します。
     *
     *  @param contextClass 追加データが関連付けられたコンテキストクラス
     *  @param T 追加データの値の型
     *  @param key 追加データの一意のキー
     */
    inline fun <reified T : Any> removeAdditionalData(contextClass: KClass<*>, @AutoFill key: String? = null) {
        additionalData = additionalData.filter {
            it.contextClass != contextClass || it.valueType != typeOf<T>() || it.key != key
        }
    }
    /**
     * 指定されたコンテキストクラス、型、キーに一致する追加データを取得します。
     *
     * このメソッドは、型安全に追加データを取得するために使用されます。
     *
     * @param contextClass 追加データが関連付けられたコンテキストクラス
     * @param key 追加データの一意のキー
     * @param T 追加データの値の型
     * @return 一致するデータが見つかった場合はその値、見つからない場合はnul
     *
     */
    inline fun <reified T : Any> getAdditionalData(contextClass: KClass<*>,  @AutoFill key: String? = null): T? {
        @Suppress("UNCHECKED_CAST")
        return additionalData
            .firstOrNull {
                it.contextClass == contextClass &&
                        it.valueType == typeOf<T>() &&
                        it.key == key
            }?.value as? T?
    }
}
