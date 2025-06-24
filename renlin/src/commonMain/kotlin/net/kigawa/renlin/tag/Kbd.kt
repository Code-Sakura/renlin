package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowPhrasingIntersection
import net.kigawa.renlin.category.FlowPhrasingDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent1

class KbdDsl :
    DslBase<FlowPhrasingIntersection>(), StatedDsl<FlowPhrasingIntersection>, FlowPhrasingDsl<FlowPhrasingIntersection> {
    override fun applyElement(element: TagNode) {
    }
}

val kbd = TagComponent1<Kbd, KbdDsl>(Kbd, ::KbdDsl)

object Kbd : Tag<FlowPhrasingIntersection> {
    override val name: String
        get() = "kbd"
}