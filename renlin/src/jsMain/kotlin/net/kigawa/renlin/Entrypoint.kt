package net.kigawa.renlin

import net.kigawa.hakate.api.state.StateDispatcher
import net.kigawa.renlin.dsl.DomDsl
import net.kigawa.renlin.component.Component1
import org.w3c.dom.Element

class Entrypoint(
    val element: Element,
) {
    fun render(component: Component1<*, *>, dispatcher: StateDispatcher) {
        val dsl = DomDsl(element, dispatcher)
        component.render(dsl, {}, "root")
    }
}
