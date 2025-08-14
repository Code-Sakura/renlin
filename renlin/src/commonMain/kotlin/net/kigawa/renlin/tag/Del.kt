package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.integration.FlowPalpablePhrasingIntegration
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.dsl.FlowPalpablePhrasingDsl


/**
 * HTML <del> element
 * 
 * model.Categories: FlowContent, PhrasingContent, PalpableContent
 */
class DelDsl(dslState: DslState): 
    DslBase<FlowPalpablePhrasingIntegration>(dslState),
    StatedDsl<FlowPalpablePhrasingIntegration>,
    FlowPalpablePhrasingDsl<FlowPalpablePhrasingIntegration> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val del = TagComponent1(Del, ::DelDsl)

object Del : Tag<FlowPalpablePhrasingIntegration> {
    override val name: String
        get() = "del"
}