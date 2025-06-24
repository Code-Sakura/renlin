package net.kigawa.renlin.dsl

import net.kigawa.hakate.api.state.State

interface Dsl {
    /**
     * このDSLで使用されているすべての状態のセット。
     */
    val states: Set<State<*>>
}