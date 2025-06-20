package net.kigawa.renlin.dsl

import net.kigawa.hakate.api.state.State
import net.kigawa.renlin.Html
import net.kigawa.renlin.category.ContentCategory
import net.kigawa.renlin.dsl.state.DslState
import net.kigawa.renlin.tag.Fragment
import net.kigawa.renlin.tag.Tag
import net.kigawa.renlin.tag.component.Component1
import net.kigawa.renlin.w3c.element.TagNode

@Html
interface Dsl<CONTENT_CATEGORY : ContentCategory> {
    var dslState: DslState?
    fun subDsl(registeredDslData: RegisteredDslData)
    fun mountDslState(state: DslState, registeredDslData: RegisteredDslData)
    fun applyElement(element: TagNode)
    val states: Set<State<*>>
    operator fun <TAG : Tag<in CONTENT_CATEGORY>, DSL : Dsl<*>> Component1<TAG, DSL>.invoke(
        key: String? = null, block: DSL.() -> Unit,
    ) = this.render(this@Dsl, block, key)

    val fragment: Component1<Tag<CONTENT_CATEGORY>, out Dsl<CONTENT_CATEGORY>>
        get() = Fragment.create<CONTENT_CATEGORY>()

    fun <T> State<T>.useValue(): T
}
