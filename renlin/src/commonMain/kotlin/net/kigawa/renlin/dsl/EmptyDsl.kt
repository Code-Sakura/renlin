package net.kigawa.renlin.dsl

import net.kigawa.hakate.api.state.State

class EmptyDsl : Dsl {
    override val states = mutableSetOf<State<*>>()
}