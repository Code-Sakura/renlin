package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.integration.FlowInteractivePalpablePhrasing
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.component.Component
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.native.LabelCategory
import net.kigawa.renlin.w3c.category.ContentCategory

/**
 * HTML <label> element
 * 
 * model.Categories: FlowContent, PhrasingContent, InteractiveContent, PalpableContent
 */
class LabelDsl(dslState: DslState): 
    DslBase<ContentCategory>(dslState),
    StatedDsl<ContentCategory> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val label = TagComponent1(Label, ::LabelDsl)

object Label : Tag<LabelCategory> {
    override val name: String
        get() = "label"
}