package net.kigawa.renlin.dsl

import net.kigawa.renlin.tag.component.Component

/**
 * `RegisteredDslData` は、DSLの登録情報を保持するデータクラスです。
 * このクラスは、DSLインスタンス、関連するコンポーネント、再読み込み関数、および一意のキーを含みます。
 *
 * 主な用途:
 * - DSLインスタンスの追跡と管理
 * - コンポーネントとDSLの関連付け
 * - DSLの再読み込み機能の提供
 */
data class RegisteredDslData(
    /**
     * 登録されたDSLインスタンス
     */
    val dsl: StatedDsl<*>,

    /**
     * DSLに関連付けられたコンポーネント
     */
    val component: Component,

    /**
     * DSLを再読み込みするための関数
     */
    val reload: () -> Unit,

    /**
     * DSLの一意の識別キー
     */
    val key: String,
) {
}
