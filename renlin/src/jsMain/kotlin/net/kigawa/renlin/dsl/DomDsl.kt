package net.kigawa.renlin.dsl

import net.kigawa.renlin.dsl.state.RootDslStateBase
import net.kigawa.renlin.element.DomTagElement
import net.kigawa.renlin.element.TagElement
import org.w3c.dom.Element

class DomDsl(element: Element) : DslBase(), Dsl {
    init {
        println("init DomDsl")
        dslState = RootDslStateBase(DomTagElement(element))
    }

    override fun applyElement(element: TagElement) {
    }
}