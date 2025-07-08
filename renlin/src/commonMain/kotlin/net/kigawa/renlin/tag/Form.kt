package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.native.FlowPalpableUnion
import net.kigawa.renlin.w3c.category.integration.FlowPalpableIntegration
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.dsl.FlowPalpableDsl


/**
 * HTML <form> element
 * 
 * model.Categories: FlowContent, PalpableContent
 */
class FormDsl(dslState: DslState): 
    DslBase<FlowPalpableIntegration>(dslState),
    StatedDsl<FlowPalpableIntegration>,
    FlowPalpableDsl<FlowPalpableIntegration> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val form = TagComponent1<Form, FormDsl>(Form, ::FormDsl)

object Form : Tag<FlowPalpableUnion> {
    override val name: String
        get() = "form"
}