package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowPalpableIntersection
import net.kigawa.renlin.category.FlowPalpableDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState

/**
 * HTML <ol> element
 * 
 * Categories: FlowContent, PalpableContent
 */
class OlDsl(dslState: DslState):
    DslBase<FlowPalpableIntersection>(dslState), StatedDsl<FlowPalpableIntersection>, FlowPalpableDsl<FlowPalpableIntersection> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val ol = TagComponent1<Ol, OlDsl>(Ol, ::OlDsl)

object Ol : Tag<FlowPalpableIntersection> {
    override val name: String
        get() = "ol"
}