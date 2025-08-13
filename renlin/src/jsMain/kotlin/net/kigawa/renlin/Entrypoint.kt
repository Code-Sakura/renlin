package net.kigawa.renlin

import net.kigawa.hakate.api.state.StateDispatcher
import net.kigawa.renlin.component.Component0
import net.kigawa.renlin.dsl.DomDsl
import net.kigawa.renlin.w3c.category.ContentCategory
import org.w3c.dom.Element

class Entrypoint(
  val element: Element,
) {
  fun <CONTENT_CATEGORY: ContentCategory> render(
    component: Component0<*, CONTENT_CATEGORY>, dispatcher: StateDispatcher,
  ) {
    val dsl = DomDsl<CONTENT_CATEGORY>(element, dispatcher)
    component.render(dsl, "root")
  }
}
