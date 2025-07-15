package net.kigawa.renlin.state

import kotlin.reflect.KClass
import kotlin.reflect.KType

/**
 * 追加のDSLのデータを表すクラス。
 *
 * このクラスは、特定のコンテキストクラスに関連付けられた追加のデータを保持します。
 * 追加データは、キーと値のペアとして格納され、値の型はジェネリック型パラメータ `T` で指定されます。
 *
 * @param T この追加データの値の型
 *
 * @property contextClass この追加データが関連付けられているコンテキストクラス
 * @property valueType この追加データの値の型
 * @property key この追加データの一意のキー
 * @property value 実際に追加される値
 */
data class AdditionalDslStateData<T : Any>(
    /**
     * この追加データが関連付けられているコンテキストクラス
     */
    val contextClass: KClass<*>,
    /**
     * この追加データの値の型
     */
    val valueType: KType,
    /**
     * この追加データの一意のキー
     *
     * `null`の場合、キーは使用されません。
     */
    val key: String?,
    /**
     * 実際に追加される値
     */
    val value: T,
)
