package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowPalpablePhrasingIntersection
import net.kigawa.renlin.category.FlowPalpablePhrasingDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent1

/**
 * HTML <bdi> element
 * 
 * Categories: FlowContent, PhrasingContent, PalpableContent
 */
class BdiDsl :
    DslBase<FlowPalpablePhrasingIntersection>(), Dsl<FlowPalpablePhrasingIntersection>, FlowPalpablePhrasingDsl<FlowPalpablePhrasingIntersection> {
    override fun applyElement(element: TagNode) {
    }
}

val bdi = TagComponent1<Bdi, BdiDsl>(Bdi, ::BdiDsl)

object Bdi : Tag<FlowPalpablePhrasingIntersection> {
    override val name: String
        get() = "bdi"
}