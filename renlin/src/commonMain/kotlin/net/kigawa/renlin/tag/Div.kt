package net.kigawa.renlin.tag

import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.tag.component.TagComponent1
import net.kigawa.renlin.w3c.category.FlowContent
import net.kigawa.renlin.w3c.category.FlowContentDsl
import net.kigawa.renlin.w3c.category.FlowPhrasingIntersection
import net.kigawa.renlin.w3c.element.TagNode

class DivDsl(dslState: DslState) :
    DslBase<FlowPhrasingIntersection>(dslState), StatedDsl<FlowPhrasingIntersection>,
    FlowContentDsl<FlowPhrasingIntersection> {
    override fun applyElement(element: TagNode): () -> Unit {
        return {}
    }
}

val div = TagComponent1<Div, DivDsl>(Div, ::DivDsl)

object Div : Tag<FlowContent> {
    override val name: String
        get() = "div"
}