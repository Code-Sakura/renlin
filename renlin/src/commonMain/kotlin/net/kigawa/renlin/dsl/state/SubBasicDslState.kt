package net.kigawa.renlin.dsl.state

import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.element.TagElement
import net.kigawa.renlin.tag.component.Component

class SubBasicDslState(
    val key: String,
    private val parent: BasicDslStateBase,
    component: Component,
) : BasicDslStateBase(), DslState {
    override val ownElement = if (component is TagElement) {
        parent.newElement()
    } else null

    override fun applyDsl(dsl: Dsl) {
        val index = parent.getIndex(this)
        if (ownElement != null) {
            dsl.applyElement(ownElement)
            parent.setElements(index, listOf(ownElement))
            return
        }
        parent.setElements(index, subStates.flatMap { it.getElements() })
    }

    override fun setElementsToParent(index: Int, elements: List<TagElement>) {
        val ownIndex = parent.getIndex(this)
        parent.setElements(index + ownIndex, elements)
    }

    override fun newElement(): TagElement {
        return ownElement?.newElement() ?: parent.newElement()
    }
}