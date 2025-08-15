package net.kigawa.renlin.w3c.category.dsl


import net.kigawa.renlin.w3c.category.integration.EmbeddedFlowPalpablePhrasing


/**
 * DSL for FlowContent, PhrasingContent, EmbeddedContent, PalpableContent
 */
interface EmbeddedFlowPalpablePhrasingDsl<CATEGORY_DSL : EmbeddedFlowPalpablePhrasing>:
    FlowContentDsl<CATEGORY_DSL>,
    PhrasingContentDsl<CATEGORY_DSL>,
    EmbeddedContentDsl<CATEGORY_DSL>,
    PalpableContentDsl<CATEGORY_DSL>