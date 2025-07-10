package net.kigawa.renlin.w3c.category.dsl


import net.kigawa.renlin.w3c.category.integration.EmbeddedFlowPalpablePhrasingIntegration


/**
 * DSL for FlowContent, PhrasingContent, EmbeddedContent, PalpableContent
 */
interface EmbeddedFlowPalpablePhrasingDsl<CATEGORY_DSL : EmbeddedFlowPalpablePhrasingIntegration>:
    FlowContentDsl<CATEGORY_DSL>,
    PhrasingContentDsl<CATEGORY_DSL>,
    EmbeddedContentDsl<CATEGORY_DSL>,
    PalpableContentDsl<CATEGORY_DSL>