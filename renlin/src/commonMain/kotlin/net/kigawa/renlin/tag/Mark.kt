package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.integration.FlowPalpablePhrasing
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.component.Component
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.native.MarkCategory
import net.kigawa.renlin.w3c.category.ContentCategory

/**
 * HTML <mark> element
 * 
 * model.Categories: FlowContent, PhrasingContent, PalpableContent
 */
class MarkDsl(dslState: DslState): 
    DslBase<ContentCategory>(dslState),
    StatedDsl<ContentCategory> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val mark = TagComponent1(Mark, ::MarkDsl)

object Mark : Tag<MarkCategory> {
    override val name: String
        get() = "mark"
}