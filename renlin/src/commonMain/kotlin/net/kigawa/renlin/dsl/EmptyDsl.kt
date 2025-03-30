package net.kigawa.renlin.dsl

import net.kigawa.renlin.dsl.state.DslState

class EmptyDsl : Dsl {
    override var key: String? = null
    override fun subDsl(subDsl: Dsl) {
        throw IllegalArgumentException("EmptyDsl")
    }

    override fun mountDslState(state: DslState) {
        throw IllegalArgumentException("EmptyDsl")
    }
}