package net.kigawa.renlin.dsl

import net.kigawa.hakate.api.state.State
import net.kigawa.renlin.category.ContentCategory
import net.kigawa.renlin.dsl.state.DslState
import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid

abstract class DslBase<CONTENT_CATEGORY : ContentCategory> : Dsl<CONTENT_CATEGORY> {
    override var dslState: DslState? = null
    override var key: String? = null
    private val subDsls = mutableListOf<RegisteredDslData>()
    override val states = mutableSetOf<State<*>>()

    @OptIn(ExperimentalUuidApi::class)
    override fun subDsl(registeredDslData: RegisteredDslData) {
        if (registeredDslData.dsl.key == null) registeredDslData.dsl.key = Uuid.random().toString()

        val i = subDsls.indexOfFirst { it.dsl.key == registeredDslData.dsl.key }
        if (i == -1) subDsls.add(registeredDslData)
        else subDsls[i] = registeredDslData

        dslState?.let {
            registeredDslData.dsl.mountDslState(
                it.subDslState(registeredDslData.dsl.key!!, registeredDslData.component), registeredDslData
            )
        }
    }

    override fun mountDslState(state: DslState, registeredDslData: RegisteredDslData) {
        dslState = state
        subDsls.forEach {
            it.dsl.mountDslState(
                state.subDslState(it.dsl.key!!, it.component), it
            )
        }
        state.setSubDsls(subDsls)
        state.applyDsl(this, registeredDslData)
    }

    override fun <T> State<T>.useValue(): T {
        states.add(this)
        return this.currentValue()
    }
}