package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowPalpableIntersection
import net.kigawa.renlin.category.FlowPalpableDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent1

/**
 * HTML <blockquote> element
 * 
 * Categories: FlowContent, PalpableContent
 */
class BlockquoteDsl :
    DslBase<FlowPalpableIntersection>(), Dsl<FlowPalpableIntersection>, FlowPalpableDsl<FlowPalpableIntersection> {
    override fun applyElement(element: TagNode) {
    }
}

val blockquote = TagComponent1<Blockquote, BlockquoteDsl>(Blockquote, ::BlockquoteDsl)

object Blockquote : Tag<FlowPalpableIntersection> {
    override val name: String
        get() = "blockquote"
}