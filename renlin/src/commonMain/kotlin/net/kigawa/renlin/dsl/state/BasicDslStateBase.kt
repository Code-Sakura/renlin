package net.kigawa.renlin.dsl.state

import net.kigawa.renlin.dsl.TagDsl
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.Tag
import net.kigawa.renlin.tag.component.Component

abstract class BasicDslStateBase : DslState {
    protected var subStates = mutableListOf<SubBasicDslState>()
    abstract override val ownElement: TagNode?

    override fun subDslState(key: String, component: Component): DslState {
//        debug("subDslState", key)
        return subStates.firstOrNull { it.key == key } ?: SubBasicDslState(key, this, component).also {
            subStates.add(
                it
            )
        }
    }

    override fun setSubDsls(dsls: List<Pair<TagDsl<*>, Component>>) {
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
            relativeIndex += it.getElements().size
            false
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


    override fun applyDsl(dsl: TagDsl<*>) {
        throw NotImplementedError("BasicDslState not implemented.")
    }

    abstract fun newElement(tag: Tag<*>): TagNode

}