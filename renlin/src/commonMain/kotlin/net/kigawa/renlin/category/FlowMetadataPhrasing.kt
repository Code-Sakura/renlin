package net.kigawa.renlin.category

interface FlowMetadataPhrasingIntersection : FlowContent, MetadataContent, PhrasingContent
interface FlowMetadataPhrasingDsl<CATEGORY_DSL : FlowMetadataPhrasingIntersection> :
    FlowContentDsl<CATEGORY_DSL>