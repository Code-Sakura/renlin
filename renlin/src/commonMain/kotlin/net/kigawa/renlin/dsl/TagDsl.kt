package net.kigawa.renlin.dsl

import net.kigawa.renlin.Html
import net.kigawa.renlin.category.ContentCategory
import net.kigawa.renlin.dsl.state.DslState
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.Tag
import net.kigawa.renlin.tag.component.Component
import net.kigawa.renlin.tag.component.Component1
import net.kigawa.renlin.tag.component.StructuredComponent

@Html
interface TagDsl<CONTENT_CATEGORY : ContentCategory> : Dsl {
    var key: String?
    var dslState: DslState?
    fun subDsl(subDsl: TagDsl<*>, component0: Component)
    fun mountDslState(state: DslState)
    fun applyElement(element: TagNode)
    operator fun <TAG : Tag<in CONTENT_CATEGORY>, DSL : TagDsl<*>> Component1<TAG, DSL>.invoke(block: DSL.() -> Unit) =
        this.render(this@TagDsl, block)

    val fragment: Component1<Tag<CONTENT_CATEGORY>, out TagDsl<CONTENT_CATEGORY>>
        get() = object : StructuredComponent<Tag<CONTENT_CATEGORY>, TagDsl<CONTENT_CATEGORY>> {
            override val tag: Tag<CONTENT_CATEGORY>
                get() = object : Tag<CONTENT_CATEGORY> {
                    override val name: String
                        get() = "fragment"
                }

            override fun newDsl(): TagDsl<CONTENT_CATEGORY> {
                return object : DslBase<CONTENT_CATEGORY>() {
                    override fun applyElement(element: TagNode) {
                    }
                }
            }
        }
}