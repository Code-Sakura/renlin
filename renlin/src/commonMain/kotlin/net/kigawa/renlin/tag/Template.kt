package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.native.FlowMetadataPhrasingScriptSupportingUnion

import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.ContentCategory

/**
 * HTML <template> element
 * 
 * model.Categories: MetadataContent, FlowContent, PhrasingContent, ScriptSupportingContent
 */
class TemplateDsl(dslState: DslState): 
    DslBase<ContentCategory>(dslState),
    StatedDsl<ContentCategory> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val template = TagComponent1<Template, TemplateDsl>(Template, ::TemplateDsl)

object Template : Tag<FlowMetadataPhrasingScriptSupportingUnion> {
    override val name: String
        get() = "template"
}