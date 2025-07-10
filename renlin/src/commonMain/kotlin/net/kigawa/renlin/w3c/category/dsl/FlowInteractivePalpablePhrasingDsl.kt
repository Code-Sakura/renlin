package net.kigawa.renlin.w3c.category.dsl


import net.kigawa.renlin.w3c.category.integration.FlowInteractivePalpablePhrasingIntegration


/**
 * DSL for FlowContent, PhrasingContent, PalpableContent, InteractiveContent
 */
interface FlowInteractivePalpablePhrasingDsl<CATEGORY_DSL : FlowInteractivePalpablePhrasingIntegration>:
    FlowContentDsl<CATEGORY_DSL>,
    PhrasingContentDsl<CATEGORY_DSL>,
    PalpableContentDsl<CATEGORY_DSL>,
    InteractiveContentDsl<CATEGORY_DSL>