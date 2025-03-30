package net.kigawa.renlin.dsl

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update
import net.kigawa.renlin.dsl.state.DslState

abstract class DslBase : Dsl {
    var dslState: DslState? = null
        private set
    override var key: String? = null
    private val subDsls = MutableStateFlow(listOf<Dsl>())
    override fun subDsl(subDsl: Dsl) {
        subDsls.update { list ->
            val newList = list.firstOrNull { it.key == subDsl.key }?.let { list - it } ?: list
            newList + subDsl
        }
        dslState?.let { subDsl.mountDslState(it.subDslState(subDsl.key)) }
    }

    override fun mountDslState(state: DslState) {
        dslState = state
        state.setDsls(subDsls.value)
        reflect()
    }

    open fun reflect() {}
}