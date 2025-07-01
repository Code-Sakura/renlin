package net.kigawa.renlin.dsl

import net.kigawa.hakate.api.state.State
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.state.DslStateData
import net.kigawa.renlin.w3c.category.ContentCategory

abstract class DslBase<CONTENT_CATEGORY : ContentCategory>(
    override val dslState: DslState,
) : StatedDsl<CONTENT_CATEGORY> {
    private val subDsls = mutableListOf<RegisteredDslData>()
    override val states = mutableSetOf<State<*>>()
    override val dslStateData: DslStateData? = dslState.dslStateData()

    override fun registerSubDsl(registeredDslData: RegisteredDslData) {

        val i = subDsls.indexOfFirst { it.key == registeredDslData.key }
        if (i == -1) subDsls.add(registeredDslData)
        else subDsls[i] = registeredDslData

        dslState.let {
            registeredDslData.dsl.applyToDslState(
                it.getOrCreateSubDslState(registeredDslData.key, registeredDslData.component), registeredDslData
            )
        }
    }

    override fun applyToDslState(state: DslState, registeredDslData: RegisteredDslData) {
        subDsls.forEach {
            it.dsl.applyToDslState(
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


