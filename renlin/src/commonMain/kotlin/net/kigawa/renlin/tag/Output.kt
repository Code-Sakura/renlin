package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.integration.FlowFormAssociatedPalpablePhrasing
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.component.Component
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.native.OutputCategory
import net.kigawa.renlin.w3c.category.ContentCategory

/**
 * HTML <output> element
 * 
 * model.Categories: FlowContent, PhrasingContent, PalpableContent, FormAssociatedContent
 */
class OutputDsl(dslState: DslState): 
    DslBase<ContentCategory>(dslState),
    StatedDsl<ContentCategory> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val output = TagComponent1(Output, ::OutputDsl)

object Output : Tag<OutputCategory> {
    override val name: String
        get() = "output"
}