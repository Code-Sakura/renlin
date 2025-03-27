package net.kigawa.renlin.dsl.category

import net.kigawa.renlin.Html
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.tag.component.Component0
import net.kigawa.renlin.tag.component.Component1
import net.kigawa.renlin.tag.item.FlowContentItem

@Html
interface FlowContentDsl : Dsl {
    operator fun <TAG : FlowContentItem<*>, DSL : Dsl> Component0<TAG, DSL>.invoke(block: DSL.() -> Unit) =
        this.render(this@FlowContentDsl, block)

    operator fun <TAG : FlowContentItem<*>, DSL : Dsl, T> Component1<TAG, DSL, T>.invoke(
        arg1: T, block: DSL.(arg1: T) -> Unit,
    ) =
        this.render(arg1, block)
}