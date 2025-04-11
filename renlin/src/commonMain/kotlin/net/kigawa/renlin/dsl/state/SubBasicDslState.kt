package net.kigawa.renlin.dsl.state

import net.kigawa.hakate.api.multi.mergeState
import net.kigawa.hakate.api.state.State
import net.kigawa.hakate.api.state.StateContext
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.dsl.RegisteredDslData
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.Tag
import net.kigawa.renlin.tag.component.Component
import net.kigawa.renlin.tag.component.TagComponent
import net.kigawa.renlin.util.debug

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
        } else parent.setElements(index, subStates.flatMap { it.getElements() })

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
//            debug("dispatch", result)
            var first = true
            result?.collect {
                if (first) {
                    first = false
                    return@collect
                }
                debug("result collected: $it", key)
                registeredDslData.reload()
            }
        }
    }

    override fun setElements(index: Int, elements: List<TagNode>) {
//        debug("setElements ddd", ownElement, index)
        ownElement?.setNodes(index, elements) ?: let {
            val ownIndex = parent.getIndex(this)
//            debug("setElements index", ownIndex, index)
            parent.setElements(index + ownIndex, elements)
        }
    }

    override fun newElement(tag: Tag<*>): TagNode {
        return ownElement?.newNode(tag) ?: parent.newElement(tag)
    }
}