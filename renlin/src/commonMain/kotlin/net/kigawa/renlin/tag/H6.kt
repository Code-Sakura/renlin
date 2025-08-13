package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.native.FlowHeadingPalpableUnion

import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.ContentCategory

/**
 * HTML <h6> element
 * 
 * model.Categories: FlowContent, HeadingContent, PalpableContent
 */
class H6Dsl(dslState: DslState): 
    DslBase<ContentCategory>(dslState),
    StatedDsl<ContentCategory> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val h6 = TagComponent1(H6, ::H6Dsl)

object H6 : Tag<FlowHeadingPalpableUnion> {
    override val name: String
        get() = "h6"
}