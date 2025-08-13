package net.kigawa.renlin.dsl

import net.kigawa.hakate.api.state.State
import net.kigawa.renlin.state.DslStateData

/**
 * `EmptyDsl`は、空のDslクラスです
 *
 * 主な用途:
 * - 空のDSLの表現
 */
class EmptyDsl : Dsl {
    /**
     * 状態オブジェクトを格納する可変セット
     *
     * このセットは任意の型の[State]オブジェクトを保持できます。
     * 初期状態では空のセットとして初期化されます。
     */
    override val states = mutableSetOf<State<*>>()

    /**
     * EmptyDslの識別情報を含む状態データオブジェクトです。
     *
     * @see DslStateData
     */
    override val dslStateData: DslStateData = DslStateData("empty dsl")
}