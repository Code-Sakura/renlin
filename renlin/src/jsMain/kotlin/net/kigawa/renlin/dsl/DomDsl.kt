package net.kigawa.renlin.dsl

import net.kigawa.hakate.api.state.StateDispatcher
import net.kigawa.renlin.category.AllContentCategory
import net.kigawa.renlin.state.RootDslStateBase
import net.kigawa.renlin.w3c.element.DomTagElement
import net.kigawa.renlin.w3c.element.TagNode
import org.w3c.dom.Element

class DomDsl(element: Element, dispatcher: StateDispatcher) : DslBase<AllContentCategory>(
    RootDslStateBase(DomTagElement(element, null), dispatcher.newStateContext())
), StatedDsl<AllContentCategory> {

    override fun applyElement(element: TagNode): () -> Unit {
        return {}
    }
}
