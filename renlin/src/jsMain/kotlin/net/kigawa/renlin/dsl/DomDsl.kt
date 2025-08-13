package net.kigawa.renlin.dsl

import net.kigawa.hakate.api.state.StateDispatcher
import net.kigawa.renlin.state.RootDslStateBase
import net.kigawa.renlin.w3c.category.ContentCategory
import net.kigawa.renlin.w3c.element.DomTagElement
import net.kigawa.renlin.w3c.element.TagNode
import org.w3c.dom.Element

class DomDsl<CONTENT_CATEGORY: ContentCategory>(
  element: Element, dispatcher: StateDispatcher,
): DslBase<CONTENT_CATEGORY>(
  RootDslStateBase(DomTagElement(element, null), dispatcher.newStateContext())
), StatedDsl<CONTENT_CATEGORY> {

  override fun applyElement(element: TagNode): () -> Unit {
    return {}
  }
}
