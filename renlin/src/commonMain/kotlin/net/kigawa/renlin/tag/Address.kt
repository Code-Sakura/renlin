package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.integration.FlowPalpableIntegration
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.dsl.FlowPalpableDsl


/**
 * HTML <address> element
 * 
 * model.Categories: FlowContent, PalpableContent
 */
class AddressDsl(dslState: DslState): 
    DslBase<FlowPalpableIntegration>(dslState),
    StatedDsl<FlowPalpableIntegration>,
    FlowPalpableDsl<FlowPalpableIntegration> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val address = TagComponent1(Address, ::AddressDsl)

object Address : Tag<FlowPalpableIntegration> {
    override val name: String
        get() = "address"
}