package net.kigawa.renlin.w3c.category.dsl


import net.kigawa.renlin.w3c.category.integration.FlowPalpablePhrasingIntegration


/**
 * DSL for FlowContent, PalpableContent, PhrasingContent
 */
interface FlowPalpablePhrasingDsl<CATEGORY_DSL : FlowPalpablePhrasingIntegration>:
    FlowContentDsl<CATEGORY_DSL>,
    PalpableContentDsl<CATEGORY_DSL>,
    PhrasingContentDsl<CATEGORY_DSL>