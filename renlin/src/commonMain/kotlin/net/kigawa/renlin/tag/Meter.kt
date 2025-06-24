package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowPhrasingIntersection
import net.kigawa.renlin.category.FlowPhrasingDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent1

class MeterDsl :
    DslBase<FlowPhrasingIntersection>(), StatedDsl<FlowPhrasingIntersection>, FlowPhrasingDsl<FlowPhrasingIntersection> {
    override fun applyElement(element: TagNode) {
    }
}

val meter = TagComponent1<Meter, MeterDsl>(Meter, ::MeterDsl)

object Meter : Tag<FlowPhrasingIntersection> {
    override val name: String
        get() = "meter"
}