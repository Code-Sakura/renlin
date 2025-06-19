package net.kigawa.renlin.dsl.state

import net.kigawa.hakate.api.state.StateContext
import net.kigawa.renlin.dsl.RegisteredDslData
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.tag.Tag

class RootDslStateBase(
    override val ownElement: TagNode, stateContext: StateContext,
) : BasicDslStateBase(stateContext) {

    override fun newElement(tag: Tag<*>): TagNode {
        return ownElement.newNode(tag)
    }

    override fun setElements(
        index: Int, elements: List<TagNode>,
    ) {
        ownElement.setNodes(index, elements)
    }

    override val latestRegisteredDslData: RegisteredDslData?
        get() = null
}