package net.kigawa.renlin.tag

import net.kigawa.renlin.category.ContentCategory
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.TagDsl
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.component.Component1
import net.kigawa.renlin.tag.component.StructuredComponent

object Fragment {


    //fun <CONTENT_CATEGORY : ContentCategory,NEW_DSL : TagDsl<*>> KClass<CONTENT_CATEGORY>.component(
//    newDsl: () -> NEW_DSL,
//    block: DSL.() -> Unit,
//): Component1<TAG, NEW_DSL> {
//    return object : Component1<TAG, NEW_DSL> {
//        override val tag: TAG
//            get() = tag
//
//        override fun newDsl(): NEW_DSL {
//            return newDsl()
//        }
//
//        override fun render(parentDsl: TagDsl<*>, block: NEW_DSL.() -> Unit) {
//            val newDsl = newDsl()
//            newDsl.block()
//            val baseDsl = this@Component1.newDsl()
//            baseDsl.block()
//            baseDsl.key = newDsl.key
//            parentDsl.subDsl(baseDsl, this@Component1)
//        }
//    }
//}
//
//fun component(block: DSL.() -> Unit) = component(::EmptyDsl, block)
    fun <CONTENT_CATEGORY : ContentCategory> create() =
        object : StructuredComponent<Tag<CONTENT_CATEGORY>, TagDsl<CONTENT_CATEGORY>> {
            override fun newDsl(): TagDsl<CONTENT_CATEGORY> {
                return object : DslBase<CONTENT_CATEGORY>() {
                    override fun applyElement(element: TagNode) {
                    }
                }
            }
        }

}

fun <CONTENT_CATEGORY : ContentCategory> fragment(): Component1<Tag<CONTENT_CATEGORY>, TagDsl<CONTENT_CATEGORY>> {
    return Fragment.create<CONTENT_CATEGORY>()
}
