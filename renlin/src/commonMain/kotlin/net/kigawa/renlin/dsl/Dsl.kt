package net.kigawa.renlin.dsl

import net.kigawa.hakate.api.state.State
import net.kigawa.renlin.Html

@Html
interface Dsl {
    /**
     * このDSLで使用されているすべての状態のセット。
     */
    val states: Set<State<*>>
}