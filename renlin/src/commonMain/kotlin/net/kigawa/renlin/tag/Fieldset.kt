package net.kigawa.renlin.tag

import net.kigawa.renlin.category.AutocapitalizeInheritingFormFlowFormAssociatedPalpableIntersection
import net.kigawa.renlin.category.AutocapitalizeInheritingFormFlowFormAssociatedPalpableDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent1

/**
 * HTML <fieldset> element
 * 
 * Categories: FlowContent, PalpableContent, FormAssociatedContent, AutocapitalizeInheritingFormContent
 */
class FieldsetDsl :
    DslBase<AutocapitalizeInheritingFormFlowFormAssociatedPalpableIntersection>(), Dsl<AutocapitalizeInheritingFormFlowFormAssociatedPalpableIntersection>, AutocapitalizeInheritingFormFlowFormAssociatedPalpableDsl<AutocapitalizeInheritingFormFlowFormAssociatedPalpableIntersection> {
    override fun applyElement(element: TagNode) {
    }
}

val fieldset = TagComponent1<Fieldset, FieldsetDsl>(Fieldset, ::FieldsetDsl)

object Fieldset : Tag<AutocapitalizeInheritingFormFlowFormAssociatedPalpableIntersection> {
    override val name: String
        get() = "fieldset"
}