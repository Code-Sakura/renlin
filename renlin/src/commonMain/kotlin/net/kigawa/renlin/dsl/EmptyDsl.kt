package net.kigawa.renlin.dsl

import net.kigawa.hakate.api.state.State
import net.kigawa.renlin.state.DslStateData

class EmptyDsl : Dsl {
    override val states = mutableSetOf<State<*>>()
    override val dslStateData: DslStateData = DslStateData("empty dsl")
}