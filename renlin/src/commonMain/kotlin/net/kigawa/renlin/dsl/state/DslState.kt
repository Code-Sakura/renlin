package net.kigawa.renlin.dsl.state

import net.kigawa.renlin.dsl.Dsl

interface DslState {
    fun subDslState(key: String?): DslState
    fun setDsls(dsls: List<Dsl>)
}