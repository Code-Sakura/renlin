package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.integration.AutocapitalizeInheritingFormFlowFormAssociatedPalpable
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.component.Component
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.native.FieldsetCategory
import net.kigawa.renlin.w3c.category.dsl.AutocapitalizeInheritingFormFlowFormAssociatedPalpableDsl


/**
 * HTML <fieldset> element
 * 
 * model.Categories: FlowContent, PalpableContent, FormAssociatedContent, AutocapitalizeInheritingFormContent
 */
class FieldsetDsl(dslState: DslState): 
    DslBase<AutocapitalizeInheritingFormFlowFormAssociatedPalpable>(dslState),
    StatedDsl<AutocapitalizeInheritingFormFlowFormAssociatedPalpable>,
    AutocapitalizeInheritingFormFlowFormAssociatedPalpableDsl<AutocapitalizeInheritingFormFlowFormAssociatedPalpable> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val fieldset = TagComponent1(Fieldset, ::FieldsetDsl)

object Fieldset : Tag<FieldsetCategory> {
    override val name: String
        get() = "fieldset"
}