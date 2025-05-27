package net.kigawa.renlin.tag

import net.kigawa.renlin.category.FlowMetadataPhrasingScriptSupportingIntersection
import net.kigawa.renlin.category.FlowMetadataPhrasingScriptSupportingDsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.component.TagComponent1

/**
 * HTML <template> element
 * 
 * Categories: MetadataContent, FlowContent, PhrasingContent, ScriptSupportingContent
 */
class TemplateDsl :
    DslBase<FlowMetadataPhrasingScriptSupportingIntersection>(), Dsl<FlowMetadataPhrasingScriptSupportingIntersection>, FlowMetadataPhrasingScriptSupportingDsl<FlowMetadataPhrasingScriptSupportingIntersection> {
    override fun applyElement(element: TagNode) {
    }
}

val template = TagComponent1<Template, TemplateDsl>(Template, ::TemplateDsl)

object Template : Tag<FlowMetadataPhrasingScriptSupportingIntersection> {
    override val name: String
        get() = "template"
}