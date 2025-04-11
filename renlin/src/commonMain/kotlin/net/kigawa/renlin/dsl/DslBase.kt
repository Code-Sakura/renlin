package net.kigawa.renlin.dsl

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update
import net.kigawa.hakate.api.state.State
import net.kigawa.renlin.category.ContentCategory
import net.kigawa.renlin.dsl.state.DslState
import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid

abstract class DslBase<CONTENT_CATEGORY : ContentCategory> : Dsl<CONTENT_CATEGORY> {
    override var dslState: DslState? = null
    override var key: String? = null
    private val subDsls = MutableStateFlow(listOf<RegisteredDslData>())
    override val states = mutableSetOf<State<*>>()

    @OptIn(ExperimentalUuidApi::class)
    override fun subDsl(registeredDslData: RegisteredDslData) {
        if (registeredDslData.dsl.key == null) registeredDslData.dsl.key = Uuid.random().toString()
        subDsls.update { list ->
            val newList = list.firstOrNull { it.dsl.key == registeredDslData.dsl.key }?.let { list - it } ?: list
            newList + registeredDslData
        }
        dslState?.let {
            registeredDslData.dsl.mountDslState(
                it.subDslState(registeredDslData.dsl.key!!, registeredDslData.component), registeredDslData
            )
        }
    }

    override fun mountDslState(state: DslState, registeredDslData: RegisteredDslData) {
        dslState = state
        subDsls.value.also {
            it.forEach {
                it.dsl.mountDslState(
                    state.subDslState(it.dsl.key!!, it.component), registeredDslData
                )
            }
        }
        state.setSubDsls(subDsls.value)
        state.applyDsl(this, registeredDslData)
    }

    override fun <T> State<T>.useValue(): T {
        states.add(this)
        return this.currentValue()
    }
}