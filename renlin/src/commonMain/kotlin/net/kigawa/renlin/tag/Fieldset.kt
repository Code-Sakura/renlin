package net.kigawa.renlin.tag

import net.kigawa.renlin.category.AutocapitalizeInheritingFormFlowFormAssociatedPalpableIntersection
import net.kigawa.renlin.category.AutocapitalizeInheritingFormFlowFormAssociatedPalpableDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState

/**
 * HTML <fieldset> element
 * 
 * Categories: FlowContent, PalpableContent, FormAssociatedContent, AutocapitalizeInheritingFormContent
 */
class FieldsetDsl(dslState: DslState):
    DslBase<AutocapitalizeInheritingFormFlowFormAssociatedPalpableIntersection>(dslState), StatedDsl<AutocapitalizeInheritingFormFlowFormAssociatedPalpableIntersection>, AutocapitalizeInheritingFormFlowFormAssociatedPalpableDsl<AutocapitalizeInheritingFormFlowFormAssociatedPalpableIntersection> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val fieldset = TagComponent1<Fieldset, FieldsetDsl>(Fieldset, ::FieldsetDsl)

object Fieldset : Tag<AutocapitalizeInheritingFormFlowFormAssociatedPalpableIntersection> {
    override val name: String
        get() = "fieldset"
}