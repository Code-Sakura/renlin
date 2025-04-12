package net.kigawa.renlin

import net.kigawa.hakate.api.state.StateDispatcher
import net.kigawa.renlin.dsl.DomDsl
import net.kigawa.renlin.dsl.EmptyDsl
import net.kigawa.renlin.tag.component.SubComponent
import org.w3c.dom.Element

class Entrypoint(
    val element: Element,
) {
    fun render(component: SubComponent<*, EmptyDsl>, dispatcher: StateDispatcher) {
        val dsl = DomDsl(element, dispatcher)
        component.render(dsl) {
            key = "root"
        }
    }
}