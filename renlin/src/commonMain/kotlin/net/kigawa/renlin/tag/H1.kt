package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.native.FlowHeadingPalpableUnion

import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.ContentCategory

/**
 * HTML <h1> element
 * 
 * model.Categories: FlowContent, HeadingContent, PalpableContent
 */
class H1Dsl(dslState: DslState): 
    DslBase<ContentCategory>(dslState),
    StatedDsl<ContentCategory> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val h1 = TagComponent1(H1, ::H1Dsl)

object H1 : Tag<FlowHeadingPalpableUnion> {
    override val name: String
        get() = "h1"
}