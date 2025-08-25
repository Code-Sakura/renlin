package net.kigawa.renlin.w3c.category.dsl


import net.kigawa.renlin.w3c.category.integration.FlowMetadataPhrasingScriptSupporting
import net.kigawa.renlin.dsl.StatedDsl


/**
 * DSL for MetadataContent, FlowContent, PhrasingContent, ScriptSupportingContent
 */
interface FlowMetadataPhrasingScriptSupportingDsl<CATEGORY_DSL : FlowMetadataPhrasingScriptSupporting>:
    MetadataContentDsl<CATEGORY_DSL>,
    FlowContentDsl<CATEGORY_DSL>,
    PhrasingContentDsl<CATEGORY_DSL>,
    ScriptSupportingContentDsl<CATEGORY_DSL>,
    StatedDsl<CATEGORY_DSL>