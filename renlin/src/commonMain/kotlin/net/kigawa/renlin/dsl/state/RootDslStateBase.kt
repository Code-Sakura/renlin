package net.kigawa.renlin.dsl.state

import net.kigawa.renlin.element.TagElement
import net.kigawa.renlin.tag.Tag

class RootDslStateBase(
    override val ownElement: TagElement,
) : BasicDslStateBase() {

    override fun newElement(tag: Tag<*>): TagElement {
        return ownElement.newElement(tag)
    }

    override fun setElements(
        index: Int, elements: List<TagElement>,
    ) {
        ownElement.setElements(index, elements)
    }
}