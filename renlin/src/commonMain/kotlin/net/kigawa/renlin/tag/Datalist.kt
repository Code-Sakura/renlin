package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.integration.FlowPhrasingIntegration
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.dsl.FlowPhrasingDsl


/**
 * HTML <datalist> element
 * 
 * model.Categories: FlowContent, PhrasingContent
 */
class DatalistDsl(dslState: DslState): 
    DslBase<FlowPhrasingIntegration>(dslState),
    StatedDsl<FlowPhrasingIntegration>,
    FlowPhrasingDsl<FlowPhrasingIntegration> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val datalist = TagComponent1(Datalist, ::DatalistDsl)

object Datalist : Tag<FlowPhrasingIntegration> {
    override val name: String
        get() = "datalist"
}