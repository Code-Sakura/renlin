package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.native.FlowPalpablePhrasingUnion
import net.kigawa.renlin.w3c.category.integration.FlowPalpablePhrasingIntegration
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.dsl.FlowPalpablePhrasingDsl


/**
 * HTML <ins> element
 * 
 * model.Categories: FlowContent, PhrasingContent, PalpableContent
 */
class InsDsl(dslState: DslState): 
    DslBase<FlowPalpablePhrasingIntegration>(dslState),
    StatedDsl<FlowPalpablePhrasingIntegration>,
    FlowPalpablePhrasingDsl<FlowPalpablePhrasingIntegration> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val ins = TagComponent1(Ins, ::InsDsl)

object Ins : Tag<FlowPalpablePhrasingUnion> {
    override val name: String
        get() = "ins"
}