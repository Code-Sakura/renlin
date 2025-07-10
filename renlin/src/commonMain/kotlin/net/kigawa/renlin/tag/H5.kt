package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.native.FlowHeadingPalpableUnion

import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.ContentCategory

/**
 * HTML <h5> element
 * 
 * model.Categories: FlowContent, HeadingContent, PalpableContent
 */
class H5Dsl(dslState: DslState): 
    DslBase<ContentCategory>(dslState),
    StatedDsl<ContentCategory> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val h5 = TagComponent1(H5, ::H5Dsl)

object H5 : Tag<FlowHeadingPalpableUnion> {
    override val name: String
        get() = "h5"
}