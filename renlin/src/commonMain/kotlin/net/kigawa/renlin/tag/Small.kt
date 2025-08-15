package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.integration.FlowPalpablePhrasing
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.component.Component
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.native.SmallCategory
import net.kigawa.renlin.w3c.category.ContentCategory

/**
 * HTML <small> element
 * 
 * model.Categories: FlowContent, PhrasingContent, PalpableContent
 */
class SmallDsl(dslState: DslState): 
    DslBase<ContentCategory>(dslState),
    StatedDsl<ContentCategory> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val small = TagComponent1(Small, ::SmallDsl)

object Small : Tag<SmallCategory> {
    override val name: String
        get() = "small"
}