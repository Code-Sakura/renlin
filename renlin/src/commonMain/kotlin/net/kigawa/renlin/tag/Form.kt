package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.integration.FlowPalpable
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.component.Component
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.native.FormCategory
import net.kigawa.renlin.w3c.category.dsl.FlowPalpableDsl


/**
 * HTML <form> element
 * 
 * model.Categories: FlowContent, PalpableContent
 */
class FormDsl(dslState: DslState): 
    DslBase<FlowPalpable>(dslState),
    StatedDsl<FlowPalpable>,
    FlowPalpableDsl<FlowPalpable> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val form = TagComponent1(Form, ::FormDsl)

object Form : Tag<FormCategory> {
    override val name: String
        get() = "form"
}