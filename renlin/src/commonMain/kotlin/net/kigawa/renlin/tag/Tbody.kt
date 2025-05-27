package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowContent
import net.kigawa.renlin.category.FlowContentDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent1

/**
 * HTML <tbody> element
 * 
 * Categories: FlowContent
 */
class TbodyDsl :
    DslBase<FlowContent>(), Dsl<FlowContent>, FlowContentDsl<FlowContent> {
    override fun applyElement(element: TagNode) {
    }
}

val tbody = TagComponent1<Tbody, TbodyDsl>(Tbody, ::TbodyDsl)

object Tbody : Tag<FlowContent> {
    override val name: String
        get() = "tbody"
}