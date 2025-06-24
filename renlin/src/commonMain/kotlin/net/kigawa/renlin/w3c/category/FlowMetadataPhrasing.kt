package net.kigawa.renlin.w3c.category

interface FlowMetadataPhrasingIntersection : FlowContent, MetadataContent, PhrasingContent
interface FlowMetadataPhrasingDsl<CATEGORY_DSL : FlowMetadataPhrasingIntersection> :
    FlowContentDsl<CATEGORY_DSL>