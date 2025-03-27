package net.kigawa.renlin

import net.kigawa.renlin.dsl.EmptyDsl
import net.kigawa.renlin.tag.component.Component0
import org.w3c.dom.HTMLElement

class Entrypoint(
    val element: HTMLElement,
) {
    fun render(component: Component0<*, EmptyDsl>) {
        val dsl = DomDsl(element)
        component.render(dsl) {}
    }
}