package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowPhrasingIntersection
import net.kigawa.renlin.category.FlowPhrasingDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent1

class BdoDsl :
    DslBase<FlowPhrasingIntersection>(), Dsl<FlowPhrasingIntersection>, FlowPhrasingDsl<FlowPhrasingIntersection> {
    override fun applyElement(element: TagNode) {
    }
}

val bdo = TagComponent1<Bdo, BdoDsl>(Bdo, ::BdoDsl)

object Bdo : Tag<FlowPhrasingIntersection> {
    override val name: String
        get() = "bdo"
}