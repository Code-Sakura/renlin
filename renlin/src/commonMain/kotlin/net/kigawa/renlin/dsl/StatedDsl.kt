package net.kigawa.renlin.dsl

import net.kigawa.hakate.api.state.State
import net.kigawa.renlin.Html
import net.kigawa.renlin.category.ContentCategory
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.tag.Fragment
import net.kigawa.renlin.tag.Tag
import net.kigawa.renlin.tag.component.Component1
import net.kigawa.renlin.w3c.element.TagNode

/**
 * `Dsl` インターフェースは、HTML構造を構築するためのDSL（ドメイン特化言語）の基本機能を定義します。
 * このインターフェースは、コンテンツカテゴリに基づいたHTML要素の構築と状態管理を提供します。
 *
 * 主な機能:
 * - HTML要素の構築と管理
 * - コンポーネントの描画と状態管理
 * - サブDSLの管理とマウント
 * - 状態値の使用と追跡
 *
 * 使用場所:
 * - HTML構造を構築するDSLの実装
 * - コンポーネントベースのUI構築
 * - 状態管理を伴うHTML生成
 *
 * @param CONTENT_CATEGORY このDSLが生成できるHTMLコンテンツのカテゴリ
 */
@Html
interface StatedDsl<CONTENT_CATEGORY : ContentCategory>: Dsl {
    /**
     * 現在のDSLに関連付けられた状態。
     * この状態はDSLの動作と描画を制御します。
     */
    val dslState: DslState

    /**
     * サブDSLを現在のDSLに登録します。
     * 
     * @param registeredDslData 登録するDSLのデータ
     */
    fun subDsl(registeredDslData: RegisteredDslData)

    /**
     * 指定された状態をDSLにマウントします。
     * これにより、DSLの状態が更新され、関連するサブDSLも更新されます。
     * 
     * @param state マウントする状態
     * @param registeredDslData 関連するDSLデータ
     */
    fun mountDslState(state: DslState, registeredDslData: RegisteredDslData)

    /**
     * 指定された要素をDSLに適用します。
     * 
     * @param element 適用するHTML要素
     * @return 要素の適用を取り消すための関数
     */
    fun applyElement(element: TagNode): ()->Unit


    /**
     * コンポーネントを呼び出し、レンダリングするための演算子オーバーロード。
     * 
     * @param key コンポーネントの一意のキー（オプション）
     * @param block コンポーネントの内容を定義するブロック
     * @return コンポーネントのレンダリング結果
     */
    operator fun <TAG : Tag<in CONTENT_CATEGORY>, DSL : StatedDsl<*>> Component1<TAG, DSL>.invoke(
        key: String? = null, block: DSL.() -> Unit,
    ) = this.render(this@StatedDsl, block, key)

    /**
     * フラグメントコンポーネント。
     * これは、複数の要素をグループ化するためのコンテナとして機能します。
     */
    val fragment: Component1<Tag<CONTENT_CATEGORY>, out StatedDsl<CONTENT_CATEGORY>>
        get() = Fragment.create<CONTENT_CATEGORY>()

    /**
     * 状態の現在の値を取得し、この状態をDSLの状態セットに追加します。
     * 
     * @return 状態の現在の値
     */
    fun <T> State<T>.useValue(): T
}
