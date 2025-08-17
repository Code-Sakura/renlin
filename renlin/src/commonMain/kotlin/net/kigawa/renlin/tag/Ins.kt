package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.integration.FlowPalpablePhrasing
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.component.Component
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.native.InsCategory
import net.kigawa.renlin.w3c.category.dsl.FlowPalpablePhrasingDsl


/**
 * HTML <ins> element
 * 
 * model.Categories: FlowContent, PhrasingContent, PalpableContent
 */
class InsDsl(dslState: DslState): 
    DslBase<FlowPalpablePhrasing>(dslState),
    StatedDsl<FlowPalpablePhrasing>,
    FlowPalpablePhrasingDsl<FlowPalpablePhrasing> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val ins = TagComponent1(Ins, ::InsDsl)

object Ins : Tag<InsCategory> {
    override val name: String
        get() = "ins"
}