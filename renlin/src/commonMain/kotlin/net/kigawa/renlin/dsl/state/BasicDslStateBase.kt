package net.kigawa.renlin.dsl.state

import net.kigawa.hakate.api.state.StateContext
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.dsl.RegisteredDslData
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.Tag
import net.kigawa.renlin.tag.component.SubComponent

abstract class BasicDslStateBase(
    protected val stateContext: StateContext,
) : DslState {
    protected var subStates = mutableListOf<SubBasicDslState>()
    abstract override val ownElement: TagNode?

    override fun subDslState(key: String, component: SubComponent<*, *>): DslState {
        return subStates.firstOrNull { it.key == key } ?: SubBasicDslState(
            key, this, component, stateContext.newStateContext()
        ).also {
            subStates.add(it)
        }
    }

    override fun setSubDsls(dsls: List<RegisteredDslData>) {
        val newList = mutableListOf<SubBasicDslState>()

        dsls.forEach { registeredData ->
            val newState = subStates.first { it.key == registeredData.dsl.key }
            subStates.remove(newState)
            newList.add(newState)
        }
        subStates.forEach {
            it.remove()
        }
        subStates = newList
    }

    fun getIndex(basicDslState: SubBasicDslState): Int {
        var relativeIndex = 0
        for (subState in subStates) {
            if (subState == basicDslState) break
            relativeIndex += subState.getElements().size
        }
        return relativeIndex
    }

    abstract fun setElements(index: Int, elements: List<TagNode>)
    fun getElements(): List<TagNode> {
        return ownElement?.let {
            if (it.isEmpty) listOf()
            else listOf(it)
        } ?: subStates.flatMap { it.getElements() }
    }

    fun remove() {
        ownElement?.remove()
        subStates.forEach { it.remove() }
    }


    override fun applyDsl(dsl: Dsl<*>, registeredDslData: RegisteredDslData) {
        throw NotImplementedError("BasicDslState not implemented.")
    }

    abstract fun newElement(tag: Tag<*>): TagNode

}