package net.kigawa.renlin.dsl.state

import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.tag.component.Component

interface DslState {
    fun subDslState(key: String, second: Component): DslState
    fun setSubDsls(dsls: List<Pair<Dsl, Component>>)
    fun applyDsl(dsl: Dsl)
}