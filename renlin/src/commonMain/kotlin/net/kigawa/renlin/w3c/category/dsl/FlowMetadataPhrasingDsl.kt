package net.kigawa.renlin.w3c.category.dsl


import net.kigawa.renlin.w3c.category.integration.FlowMetadataPhrasingIntegration


/**
 * DSL for MetadataContent, FlowContent, PhrasingContent
 */
interface FlowMetadataPhrasingDsl<CATEGORY_DSL : FlowMetadataPhrasingIntegration>:
    MetadataContentDsl<CATEGORY_DSL>,
    FlowContentDsl<CATEGORY_DSL>,
    PhrasingContentDsl<CATEGORY_DSL>