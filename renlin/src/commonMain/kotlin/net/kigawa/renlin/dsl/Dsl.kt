package net.kigawa.renlin.dsl

import net.kigawa.hakate.api.state.State
import net.kigawa.renlin.Html
import net.kigawa.renlin.state.DslStateData

@Html
interface Dsl {
    /**
     * このDSLで使用されているすべての状態のセット。
     */
    val states: Set<State<*>>
    val dslStateData: DslStateData?
}