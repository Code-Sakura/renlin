package net.kigawa.renlin.dsl

import net.kigawa.hakate.api.state.StateDispatcher
import net.kigawa.renlin.category.AllContentCategory
import net.kigawa.renlin.dsl.state.RootDslStateBase
import net.kigawa.renlin.w3c.element.DomTagElement
import net.kigawa.renlin.w3c.element.TagNode
import org.w3c.dom.Element

class DomDsl(element: Element, dispatcher: StateDispatcher) : DslBase<AllContentCategory>(), Dsl<AllContentCategory> {
    init {
        dslState = RootDslStateBase(DomTagElement(element, null), dispatcher.newStateContext())
    }

    override fun applyElement(element: TagNode) {
    }
}