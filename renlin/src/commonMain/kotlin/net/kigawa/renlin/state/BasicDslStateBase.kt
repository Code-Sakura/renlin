package net.kigawa.renlin.state

import net.kigawa.hakate.api.state.StateContext
import net.kigawa.renlin.css.CssCapable
import net.kigawa.renlin.css.CssManager
import net.kigawa.renlin.css.createCssManager
import net.kigawa.renlin.dsl.RegisteredDslData
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.Tag
import net.kigawa.renlin.tag.component.Component
import net.kigawa.renlin.w3c.element.TagNode

/**
 * このクラスは、DSLの状態管理を行う基底クラスです。
 *
 * 主な機能
 * - 子DSLの状態を保持し、取得または作成する機能
 * - CSSクラスの管理
 * - 要素の配置
 *
 * @param stateContext 状態管理のコンテキスト
 */
abstract class BasicDslStateBase(
    protected val stateContext: StateContext,
) : DslState {
    /** 子DSLの状態を保持するリスト */
    protected var subStates = mutableListOf<SubBasicDslState>()
    /** このDSL状態が保有するDOM要素 */
    abstract override val ownElement: TagNode?
    /** CSSクラス管理インスタンス */
    protected var internalCssManager: CssManager? = null
    /** CSSクラス管理インスタンスを取得します。 */
    override val cssManager: CssManager?
        get() = internalCssManager
    /**
     * 子DSLの状態を取得または作成する
     *
     * 指定されたキーに対応する子DSL要素の状態を取得します。
     * 存在しない場合は新たに作成します。
     *
     * @param key 子DSLの状態のキー
     * @param second 子DSL要素のコンポーネント情報
     * @return 子DSLの状態
     *
     *
     */
    override fun getOrCreateSubDslState(key: String, second: Component): DslState {
        return subStates.firstOrNull { it.key == key } ?: SubBasicDslState(
            key, this, second, stateContext.newStateContext()
        ).also {
            subStates.add(it)
        }
    }
    /**
     * 子DSLの状態のリストを設定します。
     *
     * 指定されたDSLデータのリストに基づいて、現在の子DSL要素の状態を更新します。
     *
     * 処理の流れ：
     * 1. 新しいリストに対応する既存の状態を再利用
     * 2. 使用されなくなった状態を削除
     * 3. 子DSLの状態リストを更新
     *
     * @param dsls DSLのデータのリスト
     */
    override fun setSubDsls(dsls: List<RegisteredDslData>) {
        val newList = mutableListOf<SubBasicDslState>()

        dsls.forEach { registeredData ->
            val newState = subStates.first { it.key == registeredData.key }
            subStates.remove(newState)
            newList.add(newState)
        }
        subStates.forEach {
            it.remove()
        }
        subStates = newList
    }
    /**
     * 指定された子DSLの状態のインデックスを取得します。
     *
     * このメソッドは、子DSLの状態のリスト内で、指定された状態がどの位置にあるかを計算します。
     * 各子DSLの状態が持つ要素の数を考慮して、相対的なインデックスを返します。
     *
     * @param basicDslState インデックスを取得する子DSL要素の状態
     * @return 相対的なインデックス
     */
    fun getIndex(basicDslState: SubBasicDslState): Int {
        var relativeIndex = 0
        for (subState in subStates) {
            if (subState == basicDslState) break
            relativeIndex += subState.getElements().size
        }
        return relativeIndex
    }
    /**
     * 指定されたインデックスに要素を設定します。
     *
     * @param index 要素を設定するインデックス
     * @param elements 設定する要素のリスト
     */
    abstract fun setElements(index: Int, elements: List<TagNode>)

    /**
     * 現在のDSL状態に関連付けられた要素のリストを取得します。
     *
     * このメソッドは、現在のDSL状態が持つ要素を取得し、
     * 子状態の要素も含めて、すべての要素をリストとして返します。
     *
     * @return 関連付けられた要素のリスト
     */
    fun getElements(): List<TagNode> {
        return ownElement?.let {
            if (it.isEmpty) listOf()
            else listOf(it)
        } ?: subStates.flatMap { it.getElements() }
    }
    /**
     * このDSL状態とその子要素の状態を削除します。
     * このメソッドは、現在のDSL状態に関連付けられた要素を削除し、
     * すべての子要素の状態も削除します。
     */
    fun remove() {
        ownElement?.remove()
        subStates.forEach { it.remove() }
    }
    /**
     * DSLを適用します。
     *
     * DSLをこの状態に適用し、必要な要素の更新やCSSの適用を行います。
     *
     * @param dsl 適用するDSL
     * @param registeredDslData 登録されたDSLデータ
     */
    override fun applyDsl(dsl: StatedDsl<*>, registeredDslData: RegisteredDslData) {
        // CSS適用処理を追加
        if (dsl is CssCapable && dsl.cssClassName != null) {
            ownElement?.setClassName(dsl.cssClassName!!)
        }
        throw NotImplementedError("BasicDslState not implemented.")
    }
    /**
     * 新しい要素を作成します。
     *
     * @param tag 作成する要素のタグ
     * @return 作成された要素のノード
     */
    abstract fun newElement(tag: Tag<*>): TagNode
    /**
     * CSS管理インスタンスを初期化します。
     *
     * まだ作成されていない場合にのみCSS管理インスタンスを作成します
     */
    protected fun initializeCssManager() {
        if (internalCssManager == null) {
            internalCssManager = createCssManager()
        }
    }
}