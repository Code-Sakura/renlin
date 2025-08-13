package net.kigawa.renlin.state

import net.kigawa.hakate.api.state.StateContext
import net.kigawa.renlin.dsl.RegisteredDslData
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.tag.Tag
/**
 * ルートDSL状態管理クラス
 *
 * DSL状態の階層構造における最上位（ルート）の状態を管理するクラスです。
 * このクラスは、アプリケーションの最上位DOM要素を保持し、
 * 全体のCSS管理インスタンスを初期化します。
 *
 * 主な特徴：
 * - ルートレベルでのCSS管理の初期化
 * - 最上位DOM要素の管理
 * - 子DSL状態の要素配置の起点
 *
 * @param ownElement このルート状態が管理する最上位DOM要素
 * @param stateContext 状態管理のコンテキスト
 */
class RootDslStateBase(
    /** このルート状態が管理する最上位DOM要素 */
    override val ownElement: TagNode, stateContext: StateContext,
) : BasicDslStateBase(stateContext) {

    init {
        // ルートではCssManagerを初期化
        initializeCssManager()
    }
    /**
     * 新しい要素を作成します。
     *
     * ルート要素の子要素として新しいDOM要素を作成します。
     *
     * @param tag 作成する要素のタグ情報
     * @return 作成された要素のノード
     */
    override fun newElement(tag: Tag<*>): TagNode {
        return ownElement.newNode(tag)
    }
    /**
     * 指定されたインデックスに要素を設定します。
     *
     * ルート要素の子要素として、指定されたインデックス位置に要素を配置します。
     *
     * @param index 要素を設定するインデックス位置
     * @param elements 設定する要素のリスト
     */
    override fun setElements(
        index: Int, elements: List<TagNode>,
    ) {
        ownElement.setNodes(index, elements)
    }
    /**
     * 最新の登録されたDSLデータを取得します。
     *
     * ルート状態では登録されたDSLデータを持たないため、常にnullを返します。
     *
     * @return 常にnull
     */
    override val latestRegisteredDslData: RegisteredDslData?
        get() = null
    /**
     * DSL状態データを取得します。
     *
     * ルート状態では独自の状態データを持たないため、常にnullを返します。
     *
     * @return 常にnull
     */
    override fun dslStateData(): DslStateData? {
       return null
    }
}