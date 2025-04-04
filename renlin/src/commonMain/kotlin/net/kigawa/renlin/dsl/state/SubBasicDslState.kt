package net.kigawa.renlin.dsl.state

import net.kigawa.renlin.dsl.TagDsl
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.Tag
import net.kigawa.renlin.tag.component.Component
import net.kigawa.renlin.tag.component.TagComponent
import net.kigawa.renlin.util.debug

class SubBasicDslState(
    val key: String,
    private val parent: BasicDslStateBase,
    component: Component,
) : BasicDslStateBase(), DslState {
    override val ownElement = if (component is TagComponent<*>) {
        parent.newElement(component.tag)
    } else null

    override fun applyDsl(dsl: TagDsl<*>) {
//        debug("applyDsl", subStates.map { it.key })
        val index = parent.getIndex(this)
//        debug("index", index, key)
        if (ownElement != null) {
            dsl.applyElement(ownElement)
            parent.setElements(index, listOf(ownElement))
            return
        }
        parent.setElements(index, subStates.flatMap { it.getElements() })
    }

    override fun setElements(index: Int, elements: List<TagNode>) {
        debug("setElements ddd", ownElement, index)
        ownElement?.setNodes(index, elements) ?: let {
            val ownIndex = parent.getIndex(this)
            debug("setElements index", ownIndex, index)
            parent.setElements(index + ownIndex, elements)
        }
    }

    override fun newElement(tag: Tag<*>): TagNode {
        return ownElement?.newNode(tag) ?: parent.newElement(tag)
    }
}