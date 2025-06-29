package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.native.FlowPalpablePhrasingUnion
import net.kigawa.renlin.w3c.category.integration.ContentCategory
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState


/**
 * HTML <ins> element
 * 
 * model.Categories: FlowContent, PhrasingContent, PalpableContent
 */
class InsDsl(dslState: DslState): 
    DslBase<ContentCategory>(dslState),
    StatedDsl<ContentCategory> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val ins = TagComponent1<Ins, InsDsl>(Ins, ::InsDsl)

object Ins : Tag<FlowPalpablePhrasingUnion> {
    override val name: String
        get() = "ins"
}