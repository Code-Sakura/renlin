package net.kigawa.renlin.w3c.category.dsl


import net.kigawa.renlin.w3c.category.integration.FlowMetadataPhrasing


/**
 * DSL for MetadataContent, FlowContent, PhrasingContent
 */
interface FlowMetadataPhrasingDsl<CATEGORY_DSL : FlowMetadataPhrasing>:
    MetadataContentDsl<CATEGORY_DSL>,
    FlowContentDsl<CATEGORY_DSL>,
    PhrasingContentDsl<CATEGORY_DSL>