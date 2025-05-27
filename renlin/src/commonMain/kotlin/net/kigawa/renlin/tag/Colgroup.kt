package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowContent
import net.kigawa.renlin.category.FlowContentDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent1

/**
 * HTML <colgroup> element
 * 
 * Categories: FlowContent
 */
class ColgroupDsl :
    DslBase<FlowContent>(), Dsl<FlowContent>, FlowContentDsl<FlowContent> {
    override fun applyElement(element: TagNode) {
    }
}

val colgroup = TagComponent1<Colgroup, ColgroupDsl>(Colgroup, ::ColgroupDsl)

object Colgroup : Tag<FlowContent> {
    override val name: String
        get() = "colgroup"
}