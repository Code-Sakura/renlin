package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowPhrasingIntersection
import net.kigawa.renlin.category.FlowPhrasingDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent1

class InputDsl :
    DslBase<FlowPhrasingIntersection>(), Dsl<FlowPhrasingIntersection>, FlowPhrasingDsl<FlowPhrasingIntersection> {
    override fun applyElement(element: TagNode) {
    }
}

val input = TagComponent1<Input, InputDsl>(Input, ::InputDsl)

object Input : Tag<FlowPhrasingIntersection> {
    override val name: String
        get() = "input"
}