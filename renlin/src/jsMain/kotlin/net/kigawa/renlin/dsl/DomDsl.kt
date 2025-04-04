package net.kigawa.renlin.dsl

import net.kigawa.renlin.category.AllContentCategory
import net.kigawa.renlin.dsl.state.RootDslStateBase
import net.kigawa.renlin.element.DomTagElement
import net.kigawa.renlin.element.TagNode
import org.w3c.dom.Element

class DomDsl(element: Element) : DslBase<AllContentCategory>(), Dsl<AllContentCategory> {
    init {
        dslState = RootDslStateBase(DomTagElement(element, null))
    }

    override fun applyElement(element: TagNode) {
    }
}