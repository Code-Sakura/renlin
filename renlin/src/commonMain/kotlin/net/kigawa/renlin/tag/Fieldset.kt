package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.native.AutocapitalizeInheritingFormFlowFormAssociatedPalpableUnion
import net.kigawa.renlin.w3c.category.integration.ContentCategory
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState


/**
 * HTML <fieldset> element
 * 
 * model.Categories: FlowContent, PalpableContent, FormAssociatedContent, AutocapitalizeInheritingFormContent
 */
class FieldsetDsl(dslState: DslState): 
    DslBase<ContentCategory>(dslState),
    StatedDsl<ContentCategory> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val fieldset = TagComponent1<Fieldset, FieldsetDsl>(Fieldset, ::FieldsetDsl)

object Fieldset : Tag<AutocapitalizeInheritingFormFlowFormAssociatedPalpableUnion> {
    override val name: String
        get() = "fieldset"
}