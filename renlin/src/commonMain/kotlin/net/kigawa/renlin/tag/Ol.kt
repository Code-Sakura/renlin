package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowPalpableIntersection
import net.kigawa.renlin.category.FlowPalpableDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent1

/**
 * HTML <ol> element
 * 
 * Categories: FlowContent, PalpableContent
 */
class OlDsl :
    DslBase<FlowPalpableIntersection>(), Dsl<FlowPalpableIntersection>, FlowPalpableDsl<FlowPalpableIntersection> {
    override fun applyElement(element: TagNode) {
    }
}

val ol = TagComponent1<Ol, OlDsl>(Ol, ::OlDsl)

object Ol : Tag<FlowPalpableIntersection> {
    override val name: String
        get() = "ol"
}