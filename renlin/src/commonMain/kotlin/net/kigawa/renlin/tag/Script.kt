package net.kigawa.renlin.tag

import net.kigawa.renlin.w3c.category.integration.FlowMetadataPhrasingScriptSupporting
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.component.TagComponent1
import net.kigawa.renlin.component.Component
import net.kigawa.renlin.w3c.element.TagNode
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.w3c.category.native.ScriptCategory
import net.kigawa.renlin.w3c.category.dsl.FlowMetadataPhrasingScriptSupportingDsl


/**
 * HTML <script> element
 * 
 * model.Categories: MetadataContent, FlowContent, PhrasingContent, ScriptSupportingContent
 */
class ScriptDsl(dslState: DslState): 
    DslBase<FlowMetadataPhrasingScriptSupporting>(dslState),
    StatedDsl<FlowMetadataPhrasingScriptSupporting>,
    FlowMetadataPhrasingScriptSupportingDsl<FlowMetadataPhrasingScriptSupporting> {
    override fun applyElement(element: TagNode): ()->Unit {
        return {}
    }
}

val script = TagComponent1(Script, ::ScriptDsl)

object Script : Tag<ScriptCategory> {
    override val name: String
        get() = "script"
}