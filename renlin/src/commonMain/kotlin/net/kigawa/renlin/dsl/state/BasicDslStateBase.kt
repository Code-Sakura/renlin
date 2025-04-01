package net.kigawa.renlin.dsl.state

import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.element.TagElement
import net.kigawa.renlin.tag.Tag
import net.kigawa.renlin.tag.component.Component

abstract class BasicDslStateBase : DslState {
    protected var subStates = mutableListOf<SubBasicDslState>()
    protected abstract val ownElement: TagElement?

    override fun subDslState(key: String, component: Component): DslState {
//        debug("subDslState", key)
        return subStates.firstOrNull { it.key == key } ?: SubBasicDslState(key, this, component).also {
            subStates.add(
                it
            )
        }
    }

    override fun setSubDsls(dsls: List<Pair<Dsl, Component>>) {
//        debug("setSubDsls",subStates)
        val newList = mutableListOf<SubBasicDslState>()
        dsls.forEach { dsl ->
            val newState = subStates.first { it.key == dsl.first.key }
            subStates.remove(newState)
            newList.add(newState)
        }
        subStates.forEach {
            it.remove()
        }
        subStates = newList
//        debug("setSubDsls end",subStates)
    }

    fun getIndex(basicDslState: SubBasicDslState): Int {
        var relativeIndex = 0
        subStates.firstOrNull {
            if (it == basicDslState) true
            relativeIndex += it.getElements().size -1
            false
        }
        return relativeIndex
    }

    abstract fun setElements(index: Int, elements: List<TagElement>)
    fun getElements(): List<TagElement> {
        return ownElement?.let { listOf(it) }
            ?: subStates.flatMap { it.getElements() }
    }

    fun remove() {
        ownElement?.remove()
        subStates.forEach { it.remove() }
    }


    override fun applyDsl(dsl: Dsl) {
        throw NotImplementedError("BasicDslState not implemented.")
    }

    abstract fun newElement(tag: Tag<*>): TagElement

}