package net.kigawa.renlin.dsl.state

import net.kigawa.hakate.api.multi.mergeState
import net.kigawa.hakate.api.state.State
import net.kigawa.hakate.api.state.StateContext
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.dsl.RegisteredDslData
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.tag.Tag
import net.kigawa.renlin.tag.component.Component
import net.kigawa.renlin.tag.component.TagComponent

class SubBasicDslState(
    val key: String,
    private val parent: BasicDslStateBase,
    component: Component,
    stateContext: StateContext,
) : BasicDslStateBase(stateContext), DslState {
    override val ownElement = if (component is TagComponent<*>) {
        parent.newElement(component.tag)
    } else null
    override var latestRegisteredDslData: RegisteredDslData? = null
    var latestStateContext: StateContext? = null

    override fun applyDsl(dsl: Dsl<*>, registeredDslData: RegisteredDslData) {
        latestRegisteredDslData = registeredDslData
        val index = parent.getIndex(this)
        if (ownElement != null) {
            dsl.applyElement(ownElement)
            parent.setElements(index, listOf(ownElement))
        } else {
            parent.setElements(index, subStates.flatMap { it.getElements() })
        }
        latestStateContext?.cancel()
        stateContext.dispatch {
            latestStateContext = this@dispatch
            var result: State<*>? = null
            dsl.states.forEach {
                if (result == null) {
                    result = it
                    return@forEach
                }
                result = mergeState(result, it)
            }
            var first = true
            result?.collect {
                if (first) {
                    first = false
                    return@collect
                }
                registeredDslData.reload()
            }
        }
    }

    override fun setElements(index: Int, elements: List<TagNode>) {
        if (ownElement == null) {
            val ownIndex = parent.getIndex(this)
            parent.setElements(index + ownIndex, elements)
        } else ownElement.setNodes(index, elements)
    }

    override fun newElement(tag: Tag<*>): TagNode {
        return ownElement?.newNode(tag) ?: parent.newElement(tag)
    }
}