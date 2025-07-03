package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.native.FlowMetadataPhrasingScriptSupportingUnion
import net.kigawa.renlin.w3c.category.integration.FlowMetadataPhrasingScriptSupportingIntegration
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.component.TagComponent1
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.dsl.FlowMetadataPhrasingScriptSupportingDsl


/**
 * HTML <script> element
 * 
 * model.Categories: MetadataContent, FlowContent, PhrasingContent, ScriptSupportingContent
 */
class ScriptDsl(dslState: DslState): 
    DslBase<FlowMetadataPhrasingScriptSupportingIntegration>(dslState),
    StatedDsl<FlowMetadataPhrasingScriptSupportingIntegration>,
    FlowMetadataPhrasingScriptSupportingDsl<FlowMetadataPhrasingScriptSupportingIntegration> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val script = TagComponent1<Script, ScriptDsl>(Script, ::ScriptDsl)

object Script : Tag<FlowMetadataPhrasingScriptSupportingUnion> {
    override val name: String
        get() = "script"
}