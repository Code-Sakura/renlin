package net.kigawa.renlin.dsl

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update
import net.kigawa.renlin.dsl.state.DslState
import net.kigawa.renlin.tag.component.Component
import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid

abstract class DslBase : Dsl {
    var dslState: DslState? = null
        private set
    override var key: String? = null
    private val subDsls = MutableStateFlow(listOf<Pair<Dsl, Component>>())

    @OptIn(ExperimentalUuidApi::class)
    override fun subDsl(subDsl: Dsl, component: Component) {
        if (subDsl.key == null) subDsl.key = Uuid.random().toString()
        subDsls.update { list ->
            val newList = list.firstOrNull { it.first.key == subDsl.key }?.let { list - it } ?: list
            newList + subDsl.to(component)
        }
        dslState?.let { subDsl.mountDslState(it.subDslState(subDsl.key!!, component)) }
    }

    override fun mountDslState(state: DslState) {
        dslState = state
        subDsls.value.also { it.forEach { it.first.mountDslState(state.subDslState(it.first.key!!, it.second)) } }
        state.setSubDsls(subDsls.value)
        state.applyDsl(this)
    }
}