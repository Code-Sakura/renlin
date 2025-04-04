package net.kigawa.renlin

import net.kigawa.renlin.dsl.DomDsl
import net.kigawa.renlin.dsl.EmptyDsl
import net.kigawa.renlin.tag.component.Component1
import org.w3c.dom.Element

class Entrypoint(
    val element: Element,
) {
    fun render(component: Component1<*, EmptyDsl>) {
        val dsl = DomDsl(element)
        component.render(dsl) {}
    }
}