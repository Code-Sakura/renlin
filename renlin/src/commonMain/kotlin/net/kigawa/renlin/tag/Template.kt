package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowMetadataPhrasingScriptSupportingIntersection
import net.kigawa.renlin.category.FlowMetadataPhrasingScriptSupportingDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState

/**
 * HTML <template> element
 * 
 * Categories: MetadataContent, FlowContent, PhrasingContent, ScriptSupportingContent
 */
class TemplateDsl(dslState: DslState):
    DslBase<FlowMetadataPhrasingScriptSupportingIntersection>(dslState), StatedDsl<FlowMetadataPhrasingScriptSupportingIntersection>, FlowMetadataPhrasingScriptSupportingDsl<FlowMetadataPhrasingScriptSupportingIntersection> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val template = TagComponent1<Template, TemplateDsl>(Template, ::TemplateDsl)

object Template : Tag<FlowMetadataPhrasingScriptSupportingIntersection> {
    override val name: String
        get() = "template"
}