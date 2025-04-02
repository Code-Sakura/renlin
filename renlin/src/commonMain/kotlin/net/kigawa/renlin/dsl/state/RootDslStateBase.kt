package net.kigawa.renlin.dsl.state

import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.Tag

class RootDslStateBase(
    override val ownElement: TagNode,
) : BasicDslStateBase() {

    override fun newElement(tag: Tag<*>): TagNode {
        return ownElement.newNode(tag)
    }

    override fun setElements(
        index: Int, elements: List<TagNode>,
    ) {
        ownElement.setNodes(index, elements)
    }
}