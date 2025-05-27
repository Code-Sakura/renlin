package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowInteractivePalpablePhrasingIntersection
import net.kigawa.renlin.category.FlowInteractivePalpablePhrasingDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent1

/**
 * HTML <a> element
 * 
 * Categories: FlowContent, PhrasingContent, PalpableContent, InteractiveContent
 */
class ADsl :
    DslBase<FlowInteractivePalpablePhrasingIntersection>(), Dsl<FlowInteractivePalpablePhrasingIntersection>, FlowInteractivePalpablePhrasingDsl<FlowInteractivePalpablePhrasingIntersection> {
    override fun applyElement(element: TagNode) {
    }
}

val a = TagComponent1<A, ADsl>(A, ::ADsl)

object A : Tag<FlowInteractivePalpablePhrasingIntersection> {
    override val name: String
        get() = "a"
}