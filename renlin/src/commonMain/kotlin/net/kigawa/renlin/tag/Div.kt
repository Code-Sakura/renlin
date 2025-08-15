package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.integration.FlowPalpable
    import net.kigawa.renlin.w3c.category.integration.FlowPalpablePhrasing
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.component.Component
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.native.DivCategory
import net.kigawa.renlin.w3c.category.dsl.FlowPalpablePhrasingDsl


/**
 * HTML <div> element
 * 
 * model.Categories: FlowContent, PalpableContent
 */
class DivDsl(dslState: DslState): 
    DslBase<FlowPalpablePhrasing>(dslState),
    StatedDsl<FlowPalpablePhrasing>,
    FlowPalpablePhrasingDsl<FlowPalpablePhrasing> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val div = TagComponent1(Div, ::DivDsl)

object Div : Tag<DivCategory> {
    override val name: String
        get() = "div"
}