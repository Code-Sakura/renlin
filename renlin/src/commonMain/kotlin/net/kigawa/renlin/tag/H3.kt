package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.integration.FlowHeadingPalpable
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.component.Component
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.native.H3Category
import net.kigawa.renlin.w3c.category.ContentCategory

/**
 * HTML <h3> element
 * 
 * model.Categories: FlowContent, HeadingContent, PalpableContent
 */
class H3Dsl(dslState: DslState): 
    DslBase<ContentCategory>(dslState),
    StatedDsl<ContentCategory> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val h3 = TagComponent1(H3, ::H3Dsl)

object H3 : Tag<H3Category> {
    override val name: String
        get() = "h3"
}