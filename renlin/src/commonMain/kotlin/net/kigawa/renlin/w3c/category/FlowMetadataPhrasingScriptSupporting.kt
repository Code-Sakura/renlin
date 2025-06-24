package net.kigawa.renlin.w3c.category

interface FlowMetadataPhrasingScriptSupportingIntersection : FlowContent, MetadataContent, PhrasingContent, ScriptSupportingContent
interface FlowMetadataPhrasingScriptSupportingDsl<CATEGORY_DSL : FlowMetadataPhrasingScriptSupportingIntersection> :
    FlowContentDsl<CATEGORY_DSL>