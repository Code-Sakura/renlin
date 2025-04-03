package net.kigawa.renlin.category

import net.kigawa.renlin.Html
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.tag.FragmentComponent
import net.kigawa.renlin.tag.FragmentDsl
import net.kigawa.renlin.tag.Tag
import net.kigawa.renlin.tag.component.Component0
import net.kigawa.renlin.tag.component.Component1


object FlowContent : ContentCategory<FlowContentDsl> {
    override fun newContentDsl(): FlowContentDsl {
        return FragmentDsl()
    }
}

@Html
interface FlowContentDsl : Dsl, DslContentCategory {
    operator fun <TAG : FlowContentItem<*>, DSL : Dsl> Component0<TAG, DSL>.invoke(block: DSL.() -> Unit) =
        this.render(this@FlowContentDsl, block)

    operator fun <TAG : FlowContentItem<*>, DSL : Dsl, T> Component1<TAG, DSL, T>.invoke(
        arg1: T, block: DSL.(arg1: T) -> Unit,
    ) =
        this.render(arg1, block)

    fun fragment(block: FlowContentDsl.() -> Unit) {
        object : FragmentComponent<FlowContentDsl>() {
            override fun newDsl(): FlowContentDsl {
                return FragmentDsl()
            }
        }.render(this, block)
    }
}

interface FlowContentItem<DSL : Dsl> : Tag<DSL> {
}