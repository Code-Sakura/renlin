package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.native.AutocapitalizeInheritingFormFlowFormAssociatedPalpableUnion
import net.kigawa.renlin.w3c.category.integration.AutocapitalizeInheritingFormFlowFormAssociatedPalpableIntegration
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.dsl.AutocapitalizeInheritingFormFlowFormAssociatedPalpableDsl


/**
 * HTML <fieldset> element
 * 
 * model.Categories: FlowContent, PalpableContent, FormAssociatedContent, AutocapitalizeInheritingFormContent
 */
class FieldsetDsl(dslState: DslState): 
    DslBase<AutocapitalizeInheritingFormFlowFormAssociatedPalpableIntegration>(dslState),
    StatedDsl<AutocapitalizeInheritingFormFlowFormAssociatedPalpableIntegration>,
    AutocapitalizeInheritingFormFlowFormAssociatedPalpableDsl<AutocapitalizeInheritingFormFlowFormAssociatedPalpableIntegration> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val fieldset = TagComponent1<Fieldset, FieldsetDsl>(Fieldset, ::FieldsetDsl)

object Fieldset : Tag<AutocapitalizeInheritingFormFlowFormAssociatedPalpableUnion> {
    override val name: String
        get() = "fieldset"
}