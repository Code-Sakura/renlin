package net.kigawa.renlin.dsl

import net.kigawa.hakate.api.state.State
import net.kigawa.renlin.category.ContentCategory
import net.kigawa.renlin.dsl.state.DslState

abstract class DslBase<CONTENT_CATEGORY : ContentCategory> : Dsl<CONTENT_CATEGORY> {
    override var dslState: DslState? = null
    private val subDsls = mutableListOf<RegisteredDslData>()
    override val states = mutableSetOf<State<*>>()

    override fun subDsl(registeredDslData: RegisteredDslData) {

        val i = subDsls.indexOfFirst { it.key == registeredDslData.key }
        if (i == -1) subDsls.add(registeredDslData)
        else subDsls[i] = registeredDslData

        dslState?.let {
            registeredDslData.dsl.mountDslState(
                it.subDslState(registeredDslData.key, registeredDslData.component), registeredDslData
            )
        }
    }

    override fun mountDslState(state: DslState, registeredDslData: RegisteredDslData) {
        dslState = state
        subDsls.forEach {
            it.dsl.mountDslState(
                state.subDslState(it.key, it.component), it
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


