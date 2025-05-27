package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowContent
import net.kigawa.renlin.category.FlowContentDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent1

/**
 * HTML <th> element
 * 
 * Categories: FlowContent
 */
class ThDsl :
    DslBase<FlowContent>(), Dsl<FlowContent>, FlowContentDsl<FlowContent> {
    override fun applyElement(element: TagNode) {
    }
}

val th = TagComponent1<Th, ThDsl>(Th, ::ThDsl)

object Th : Tag<FlowContent> {
    override val name: String
        get() = "th"
}