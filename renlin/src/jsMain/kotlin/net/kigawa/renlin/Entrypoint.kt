package net.kigawa.renlin

import net.kigawa.renlin.dsl.EmptyDsl
import net.kigawa.renlin.tag.component.Component0
import org.w3c.dom.Element

class Entrypoint(
    val element: Element,
) {
    fun render(component: Component0<*, EmptyDsl>) {
        val dsl = DomDsl().apply {
        }
        component.render(dsl) {}
    }
}