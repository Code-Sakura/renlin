package net.kigawa.renlin.dsl

import net.kigawa.hakate.api.state.State
import net.kigawa.renlin.category.ContentCategory
import net.kigawa.renlin.state.DslState

abstract class DslBase<CONTENT_CATEGORY : ContentCategory> (
    override val dslState: DslState
): StatedDsl<CONTENT_CATEGORY> {
    private val subDsls = mutableListOf<RegisteredDslData>()
    override val states = mutableSetOf<State<*>>()

    override fun subDsl(registeredDslData: RegisteredDslData) {

        val i = subDsls.indexOfFirst { it.key == registeredDslData.key }
        if (i == -1) subDsls.add(registeredDslData)
        else subDsls[i] = registeredDslData

        dslState.let {
            registeredDslData.dsl.mountDslState(
                it.getOrCreateSubDslState(registeredDslData.key, registeredDslData.component), registeredDslData
            )
        }
    }

    override fun mountDslState(state: DslState, registeredDslData: RegisteredDslData) {
        subDsls.forEach {
            it.dsl.mountDslState(
                state.getOrCreateSubDslState(it.key, it.component), it
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


