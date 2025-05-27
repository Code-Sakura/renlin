package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowPalpablePhrasingIntersection
import net.kigawa.renlin.category.FlowPalpablePhrasingDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent1

/**
 * HTML <kbd> element
 * 
 * Categories: FlowContent, PhrasingContent, PalpableContent
 */
class KbdDsl :
    DslBase<FlowPalpablePhrasingIntersection>(), Dsl<FlowPalpablePhrasingIntersection>, FlowPalpablePhrasingDsl<FlowPalpablePhrasingIntersection> {
    override fun applyElement(element: TagNode) {
    }
}

val kbd = TagComponent1<Kbd, KbdDsl>(Kbd, ::KbdDsl)

object Kbd : Tag<FlowPalpablePhrasingIntersection> {
    override val name: String
        get() = "kbd"
}