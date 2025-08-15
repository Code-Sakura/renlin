package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.integration.FlowInteractivePalpable
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.component.Component
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.native.DetailsCategory
import net.kigawa.renlin.w3c.category.ContentCategory

/**
 * HTML <details> element
 * 
 * model.Categories: FlowContent, InteractiveContent, PalpableContent
 */
class DetailsDsl(dslState: DslState): 
    DslBase<ContentCategory>(dslState),
    StatedDsl<ContentCategory> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val details = TagComponent1(Details, ::DetailsDsl)

object Details : Tag<DetailsCategory> {
    override val name: String
        get() = "details"
}