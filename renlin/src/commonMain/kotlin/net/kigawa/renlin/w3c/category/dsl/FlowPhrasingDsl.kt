package net.kigawa.renlin.w3c.category.dsl


import net.kigawa.renlin.w3c.category.integration.FlowPhrasingIntegration


/**
 * DSL for FlowContent, PhrasingContent
 */
interface FlowPhrasingDsl<CATEGORY_DSL : FlowPhrasingIntegration>:
    FlowContentDsl<CATEGORY_DSL>,
    PhrasingContentDsl<CATEGORY_DSL>