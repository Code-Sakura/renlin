package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowContent
import net.kigawa.renlin.category.FlowPhrasingDsl
import net.kigawa.renlin.category.FlowPhrasingIntersection
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.TagDsl
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent1

class DivDsl :
    DslBase<FlowPhrasingIntersection>(), TagDsl<FlowPhrasingIntersection>, FlowPhrasingDsl<FlowPhrasingIntersection> {
    override fun applyElement(element: TagNode) {
    }
}

val div = TagComponent1<Div, DivDsl>(Div, ::DivDsl)

object Div : Tag<FlowContent> {
    override val name: String
        get() = "div"
}
