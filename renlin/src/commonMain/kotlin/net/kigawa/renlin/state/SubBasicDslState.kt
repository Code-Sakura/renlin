package net.kigawa.renlin.state

import net.kigawa.hakate.api.multi.mergeState
import net.kigawa.hakate.api.state.State
import net.kigawa.hakate.api.state.StateContext
import net.kigawa.renlin.css.CssCapable
import net.kigawa.renlin.css.CssManager
import net.kigawa.renlin.dsl.RegisteredDslData
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.Tag
import net.kigawa.renlin.component.Component
import net.kigawa.renlin.component.TagComponent
import net.kigawa.renlin.w3c.element.TagNode

/**
 * 子DSLの状態クラス
 *
 * 親DSL状態に属する子状態を表すクラスです。
 * タグコンポーネントの場合は独自の要素を持ち、そうでない場合は親の要素を利用します。
 *
 * @property key 子DSLの状態を識別するキー
 * @property parent 親のDSL
 * @property component 子DSLのコンポーネント情報
 * @property stateContext 状態管理のコンテキスト
 */

class SubBasicDslState(
    /** 子DSLの状態を識別するキー */
    val key: String,
    /** 親のDSL状態 */
    private val parent: BasicDslStateBase,
    /** 子DSLのコンポーネント情報 */
    component: Component<*>,
    /** 状態管理のコンテキスト */
    stateContext: StateContext,
) : BasicDslStateBase(stateContext), DslState {
    /**
     * この子DSLが所有するDOM要素
     * TagComponentの場合は新しい要素を作成し、そうでない場合はnull
     */
    override val ownElement = if (component is TagComponent<*>) {
        parent.newElement(component.tag)
    } else null

    /** 最新の登録されたDSLデータ */
    override var latestRegisteredDslData: RegisteredDslData? = null
    /** 最新のDSL状態データ */
    private var latestDslStateData: DslStateData? = DslStateData(key)
    /** CSS管理インスタンス（親から取得） */

    override val cssManager: CssManager?
        get() = parent. cssManager
    /** 最新の状態コンテキスト */
    var latestStateContext: StateContext? = null
    /**
     * DSLを適用します。
     *
     * DSLをこの子状態に適用し、状態の変更を監視します。
     * CSS処理、要素の更新、状態の監視を行います。
     *
     * @param dsl 適用するDSL
     * @param registeredDslData 登録されたDSLデータ
     */
    override fun applyDsl(dsl: StatedDsl<*>, registeredDslData: RegisteredDslData) {
        latestRegisteredDslData = registeredDslData
        val index = parent.getIndex(this)

        // CSS適用処理を追加
        if (dsl is CssCapable && dsl.cssClassName != null) {
            ownElement?.setClassName(dsl.cssClassName!!)
        }

        if (ownElement != null) {
            dsl.applyElement(ownElement)
            ownElement.setDslStateData(latestDslStateData, dsl.dslStateData)
            latestDslStateData = dsl.dslStateData
            parent.setElements(index, listOf(ownElement))
        } else {
            parent.setElements(index, subStates.flatMap { it.getElements() })
        }
        latestStateContext?.cancel()
        stateContext.dispatch {
            latestStateContext = this@dispatch
            var result: State<*>? = null
            dsl.states.forEach {
                if (result == null) {
                    result = it
                    return@forEach
                }
                result = mergeState(result, it)
            }
            var first = true
            result?.collect {
                if (first) {
                    first = false
                    return@collect
                }
                registeredDslData.reload()
            }
        }
    }
    /**
     * DSL状態データを取得します。
     *
     * @return 最新のDSL状態データのコピー
     */
    override fun dslStateData(): DslStateData? {
        return latestDslStateData?.copy()
    }
    /**
     * 指定されたインデックスに要素を設定します。
     *
     * 独自の要素を持つ場合は子要素として設定し、
     * そうでない場合は親の要素に設定します。
     *
     * @param index 要素を設定するインデックス
     * @param elements 設定する要素のリスト
     */
    override fun setElements(index: Int, elements: List<TagNode>) {
        if (ownElement == null) {
            val ownIndex = parent.getIndex(this)
            parent.setElements(index + ownIndex, elements)
        } else ownElement.setNodes(index, elements)
    }
    /**
     * 新しい要素を作成します。
     *
     * 独自の要素を持つ場合はその子要素として作成し、
     * そうでない場合は親を通じて作成します。
     *
     * @param tag タグ情報
     * @return 作成された要素
     */
    override fun newElement(tag: Tag<*>): TagNode {
        return ownElement?.newNode(tag) ?: parent.newElement(tag)
    }
}