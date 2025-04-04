package net.kigawa.renlin.dsl

import net.kigawa.renlin.Html
import net.kigawa.renlin.category.ContentCategory
import net.kigawa.renlin.dsl.state.DslState
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.Tag
import net.kigawa.renlin.tag.component.Component
import net.kigawa.renlin.tag.component.Component1

@Html
interface Dsl<CONTENT_CATEGORY : ContentCategory> {
    var key: String?
    var dslState: DslState?
    fun subDsl(subDsl: Dsl<*>, component0: Component)
    fun mountDslState(state: DslState)
    fun applyElement(element: TagNode)
    operator fun <TAG : Tag<in CONTENT_CATEGORY>,DSL: Dsl<*>> Component1<TAG, DSL>.invoke(block: DSL.() -> Unit) =
        this.render(this@Dsl, block)
}