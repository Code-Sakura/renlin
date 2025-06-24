package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowPalpablePhrasingIntersection
import net.kigawa.renlin.category.FlowPalpablePhrasingDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState

/**
 * HTML <strong> element
 * 
 * Categories: FlowContent, PhrasingContent, PalpableContent
 */
class StrongDsl(dslState: DslState):
    DslBase<FlowPalpablePhrasingIntersection>(dslState), StatedDsl<FlowPalpablePhrasingIntersection>, FlowPalpablePhrasingDsl<FlowPalpablePhrasingIntersection> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val strong = TagComponent1<Strong, StrongDsl>(Strong, ::StrongDsl)

object Strong : Tag<FlowPalpablePhrasingIntersection> {
    override val name: String
        get() = "strong"
}