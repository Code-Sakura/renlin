package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowPalpableIntersection
import net.kigawa.renlin.category.FlowPalpableDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent1

/**
 * HTML <figure> element
 * 
 * Categories: FlowContent, PalpableContent
 */
class FigureDsl :
    DslBase<FlowPalpableIntersection>(), Dsl<FlowPalpableIntersection>, FlowPalpableDsl<FlowPalpableIntersection> {
    override fun applyElement(element: TagNode) {
    }
}

val figure = TagComponent1<Figure, FigureDsl>(Figure, ::FigureDsl)

object Figure : Tag<FlowPalpableIntersection> {
    override val name: String
        get() = "figure"
}