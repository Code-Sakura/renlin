package net.kigawa.renlin.component

import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.RegisteredDslData
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.Tag
import net.kigawa.renlin.w3c.category.ContentCategory
import net.kigawa.renlin.w3c.element.TagNode
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
      // Create a concrete implementation of DslBase instead of using delegation
      val newDsl = object: DslBase<CONTENT_CATEGORY>(state) {
        override fun applyElement(element: TagNode): () -> Unit {
          return parentDsl.applyElement(element)
        }
      }
      println("component newDsl")
      newDsl.block()
      println("component end")
      parentDsl.registerSubDsl(
        RegisteredDslData(
          newDsl,
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
      // Create a concrete implementation of DslBase instead of using delegation
      val newDsl = object: DslBase<CONTENT_CATEGORY>(state) {
        override fun applyElement(element: TagNode): () -> Unit {
          return parentDsl.applyElement(element)
        }
      }
      newDsl.block(arg1)
      parentDsl.registerSubDsl(
        RegisteredDslData(
          newDsl,
          this,
          { render(parentDsl, arg1, key) },
          nonNullKey
        )
      )
    }
  }
}

fun <CONTENT_CATEGORY: ContentCategory, ARG1, ARG2> component(
  block: StatedDsl<CONTENT_CATEGORY>.(ARG1, ARG2) -> Unit,
): Component2<Tag<CONTENT_CATEGORY>, CONTENT_CATEGORY, ARG1, ARG2> {
  return object: Component2<Tag<CONTENT_CATEGORY>, CONTENT_CATEGORY, ARG1, ARG2> {
    override fun render(parentDsl: StatedDsl<out CONTENT_CATEGORY>, arg1: ARG1, arg2: ARG2, key: String?) {
      @OptIn(ExperimentalUuidApi::class)
      val nonNullKey = key ?: Uuid.random().toString()
      val state = parentDsl.dslState.getOrCreateSubDslState(nonNullKey, this)
      // Create a concrete implementation of DslBase instead of using delegation
      val newDsl = object: DslBase<CONTENT_CATEGORY>(state) {
        override fun applyElement(element: TagNode): () -> Unit {
          return parentDsl.applyElement(element)
        }
      }
      newDsl.block(arg1, arg2)
      parentDsl.registerSubDsl(
        RegisteredDslData(
          newDsl,
          this,
          { render(parentDsl, arg1, arg2, key) },
          nonNullKey
        )
      )
    }
  }
}

fun <CONTENT_CATEGORY: ContentCategory, ARG1, ARG2, ARG3> component(
  block: StatedDsl<CONTENT_CATEGORY>.(ARG1, ARG2, ARG3) -> Unit,
): Component3<Tag<CONTENT_CATEGORY>, CONTENT_CATEGORY, ARG1, ARG2, ARG3> {
  return object: Component3<Tag<CONTENT_CATEGORY>, CONTENT_CATEGORY, ARG1, ARG2, ARG3> {
    override fun render(parentDsl: StatedDsl<out CONTENT_CATEGORY>, arg1: ARG1, arg2: ARG2, arg3: ARG3, key: String?) {
      @OptIn(ExperimentalUuidApi::class)
      val nonNullKey = key ?: Uuid.random().toString()
      val state = parentDsl.dslState.getOrCreateSubDslState(nonNullKey, this)
      // Create a concrete implementation of DslBase instead of using delegation
      val newDsl = object: DslBase<CONTENT_CATEGORY>(state) {
        override fun applyElement(element: TagNode): () -> Unit {
          return parentDsl.applyElement(element)
        }
      }
      newDsl.block(arg1, arg2, arg3)
      parentDsl.registerSubDsl(
        RegisteredDslData(
          newDsl,
          this,
          { render(parentDsl, arg1, arg2, arg3, key) },
          nonNullKey
        )
      )
    }
  }
}

fun <CONTENT_CATEGORY: ContentCategory, ARG1, ARG2, ARG3, ARG4> component(
  block: StatedDsl<CONTENT_CATEGORY>.(ARG1, ARG2, ARG3, ARG4) -> Unit,
): Component4<Tag<CONTENT_CATEGORY>, CONTENT_CATEGORY, ARG1, ARG2, ARG3, ARG4> {
  return object: Component4<Tag<CONTENT_CATEGORY>, CONTENT_CATEGORY, ARG1, ARG2, ARG3, ARG4> {
    override fun render(parentDsl: StatedDsl<out CONTENT_CATEGORY>, arg1: ARG1, arg2: ARG2, arg3: ARG3, arg4: ARG4, key: String?) {
      @OptIn(ExperimentalUuidApi::class)
      val nonNullKey = key ?: Uuid.random().toString()
      val state = parentDsl.dslState.getOrCreateSubDslState(nonNullKey, this)
      // Create a concrete implementation of DslBase instead of using delegation
      val newDsl = object: DslBase<CONTENT_CATEGORY>(state) {
        override fun applyElement(element: TagNode): () -> Unit {
          return parentDsl.applyElement(element)
        }
      }
      newDsl.block(arg1, arg2, arg3, arg4)
      parentDsl.registerSubDsl(
        RegisteredDslData(
          newDsl,
          this,
          { render(parentDsl, arg1, arg2, arg3, arg4, key) },
          nonNullKey
        )
      )
    }
  }
}
