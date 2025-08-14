package net.kigawa.renlin.component

import net.kigawa.renlin.dsl.RegisteredDslData
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.tag.Tag
import net.kigawa.renlin.w3c.category.ContentCategory
import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid

interface StructuredComponent<
    TAG: Tag<CONTENT_CATEGORY>, CONTENT_CATEGORY: ContentCategory,
    DSL: StatedDsl<*>,
    >: Component1<TAG, CONTENT_CATEGORY, DSL.() -> Unit> {
  fun newDsl(dslState: DslState): DSL
  @OptIn(ExperimentalUuidApi::class)
  override fun render(parentDsl: StatedDsl<out CONTENT_CATEGORY>, arg1: DSL.() -> Unit, key: String?) {
    val nonNullKey = key ?: Uuid.random().toString()
    val dslState = parentDsl.dslState.getOrCreateSubDslState(nonNullKey, this)
    val dsl = newDsl(dslState)
    dsl.arg1()
    parentDsl.registerSubDsl(
      RegisteredDslData(
        dsl,
        this,
        { render(parentDsl, arg1, key) },
        nonNullKey
      )
    )
  }
}
