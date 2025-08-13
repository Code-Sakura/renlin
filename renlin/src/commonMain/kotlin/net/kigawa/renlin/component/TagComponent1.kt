package net.kigawa.renlin.component

import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.tag.Tag
import net.kigawa.renlin.w3c.category.ContentCategory

class TagComponent1<TAG: Tag<CONTENT_CATEGORY>, CONTENT_CATEGORY: ContentCategory, DSL: StatedDsl<*>>(
  override val tag: TAG,
  private val newDslFunc: (DslState) -> DSL,
): TagComponent<TAG>, StructuredComponent<TAG, CONTENT_CATEGORY, DSL> {
  override fun newDsl(dslState: DslState): DSL {
    return newDslFunc(dslState)
  }

}