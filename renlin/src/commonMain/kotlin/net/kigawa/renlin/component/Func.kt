package net.kigawa.renlin.component

import net.kigawa.hakate.api.state.State
import net.kigawa.renlin.dsl.RegisteredDslData
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.Tag
import net.kigawa.renlin.w3c.category.ContentCategory
import kotlin.reflect.KClass
import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid

fun <CONTENT_CATEGORY: ContentCategory> KClass<CONTENT_CATEGORY>.component(
  block: StatedDsl<CONTENT_CATEGORY>.() -> Unit,
) = net.kigawa.renlin.component.component(block)

fun <CONTENT_CATEGORY: ContentCategory, TAG: Tag<CONTENT_CATEGORY>> Component<TAG>.component(
  block: StatedDsl<CONTENT_CATEGORY>.() -> Unit,
) = net.kigawa.renlin.component.component(block)

fun <CONTENT_CATEGORY: ContentCategory> component(
  block: StatedDsl<CONTENT_CATEGORY>.() -> Unit,
): Component0<Tag<in CONTENT_CATEGORY>, in CONTENT_CATEGORY> {
  println("component start $block")
  return object: Component0<Tag<CONTENT_CATEGORY>, CONTENT_CATEGORY> {
    override fun render(
      parentDsl: StatedDsl<out
      CONTENT_CATEGORY>,
      key: String?,
    ) {
      println("component")
      @OptIn(ExperimentalUuidApi::class)
      val nonNullKey = key ?: Uuid.random().toString()
      val state = parentDsl.dslState.getOrCreateSubDslState(nonNullKey, this)
      val newDsl = object: StatedDsl<CONTENT_CATEGORY> by state {
      }
      println("component newDsl")
      newDsl.block()
      println("component end")
      parentDsl.registerSubDsl(
        RegisteredDslData(
          object: StatedDsl<ContentCategory> by newDsl {
            override val states: Set<State<*>>
              get() = newDsl.states
          },
          this,
          { render(parentDsl, key) },
          nonNullKey
        )
      )
    }
  }
}


fun <CONTENT_CATEGORY: ContentCategory, ARG1> component(
  block: StatedDsl<CONTENT_CATEGORY>.(ARG1) -> Unit,
): Component1<Tag<CONTENT_CATEGORY>, CONTENT_CATEGORY, ARG1> {
  return object: Component1<Tag<CONTENT_CATEGORY>, CONTENT_CATEGORY, ARG1> {
    override fun render(parentDsl: StatedDsl<out CONTENT_CATEGORY>, arg1: ARG1, key: String?) {
      @OptIn(ExperimentalUuidApi::class)
      val nonNullKey = key ?: Uuid.random().toString()
      val state = parentDsl.dslState.getOrCreateSubDslState(nonNullKey, this)
      val newDsl = object: StatedDsl<CONTENT_CATEGORY> by state {
      }
      newDsl.block(arg1)
      parentDsl.registerSubDsl(
        RegisteredDslData(
          object: StatedDsl<ContentCategory> by newDsl {
            override val states: Set<State<*>>
              get() = newDsl.states
          },
          this,
          { render(parentDsl, arg1, key) },
          nonNullKey
        )
      )
    }
  }
}