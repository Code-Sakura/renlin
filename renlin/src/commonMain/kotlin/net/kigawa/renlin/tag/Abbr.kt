package net.kigawa.renlin.tag

import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.tag.component.TagComponent1
import net.kigawa.renlin.w3c.category.FlowPalpablePhrasingDsl
import net.kigawa.renlin.w3c.category.FlowPalpablePhrasingIntersection
import net.kigawa.renlin.w3c.element.TagNode

/**
 * HTML <abbr> element
 *
 * Categories: FlowContent, PhrasingContent, PalpableContent
 */
class AbbrDsl(dslState: DslState) :
    DslBase<FlowPalpablePhrasingIntersection>(dslState), StatedDsl<FlowPalpablePhrasingIntersection>,
    FlowPalpablePhrasingDsl<FlowPalpablePhrasingIntersection> {
    override fun applyElement(element: TagNode): () -> Unit {
        return {}
    }
}

val abbr = TagComponent1<Abbr, AbbrDsl>(Abbr, ::AbbrDsl)

object Abbr : Tag<FlowPalpablePhrasingIntersection> {
    override val name: String
        get() = "abbr"
}