package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.integration.FlowPalpablePhrasing
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.component.Component
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.native.ICategory
import net.kigawa.renlin.w3c.category.ContentCategory

/**
 * HTML <i> element
 * 
 * model.Categories: FlowContent, PhrasingContent, PalpableContent
 */
class IDsl(dslState: DslState): 
    DslBase<ContentCategory>(dslState),
    StatedDsl<ContentCategory> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val i = TagComponent1(I, ::IDsl)

object I : Tag<ICategory> {
    override val name: String
        get() = "i"
}