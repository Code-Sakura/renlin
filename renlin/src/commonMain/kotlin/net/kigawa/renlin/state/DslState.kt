package net.kigawa.renlin.state

import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.dsl.RegisteredDslData
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.tag.component.Component

/**
 * `DslState` インターフェースは、DSLの状態を管理するための機能を定義します。
 * このインターフェースは、DSLの要素、サブDSL、および状態の適用を管理します。
 *
 * 主な機能:
 * - DSLに関連付けられた要素の管理
 * - サブDSLの状態管理
 * - DSL状態の適用と更新
 *
 * 使用場所:
 * - DSLの状態管理システム
 * - コンポーネントの再描画と更新メカニズム
 */
interface DslState {
    /**
     * このDSL状態に関連付けられた要素
     */
    val ownElement: TagNode?

    /**
     * 最後に登録されたDSLデータ
     */
    val latestRegisteredDslData: RegisteredDslData?

    /**
     * 指定されたキーとコンポーネントに基づいてサブDSLの状態を取得または作成します
     *
     * @param key サブDSLの一意のキー
     * @param second 関連するコンポーネント
     * @return サブDSLの状態
     */
    fun getOrCreateSubDslState(key: String, second: Component): DslState

    /**
     * このDSL状態に関連するサブDSLのリストを設定します
     *
     * @param dsls 設定するサブDSLのリスト
     */
    fun setSubDsls(dsls: List<RegisteredDslData>)

    /**
     * 指定されたDSLにこの状態を適用します
     *
     * @param dsl 状態を適用するDSL
     * @param registeredDslData 関連するDSLデータ
     */
    fun applyDsl(dsl: StatedDsl<*>, registeredDslData: RegisteredDslData)
}
