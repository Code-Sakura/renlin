package net.kigawa.renlin.category

interface FlowMetadataPhrasingScriptSupportingIntersection : FlowContent, MetadataContent, PhrasingContent, ScriptSupportingContent
interface FlowMetadataPhrasingScriptSupportingDsl<CATEGORY_DSL : FlowMetadataPhrasingScriptSupportingIntersection> :
    FlowContentDsl<CATEGORY_DSL>