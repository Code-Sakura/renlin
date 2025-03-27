package net.kigawa.renlin

import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.element.TagElement
import org.w3c.dom.HTMLElement

class DomDsl(htmlElement: HTMLElement) : DslBase(TagElement(htmlElement)), Dsl {
}