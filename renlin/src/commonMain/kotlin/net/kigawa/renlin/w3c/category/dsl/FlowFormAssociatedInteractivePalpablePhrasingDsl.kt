package net.kigawa.renlin.w3c.category.dsl


import net.kigawa.renlin.w3c.category.integration.FlowFormAssociatedInteractivePalpablePhrasingIntegration


/**
 * DSL for FlowContent, PhrasingContent, InteractiveContent, PalpableContent, FormAssociatedContent
 */
interface FlowFormAssociatedInteractivePalpablePhrasingDsl<CATEGORY_DSL : FlowFormAssociatedInteractivePalpablePhrasingIntegration>:
    FlowContentDsl<CATEGORY_DSL>,
    PhrasingContentDsl<CATEGORY_DSL>,
    InteractiveContentDsl<CATEGORY_DSL>,
    PalpableContentDsl<CATEGORY_DSL>,
    FormAssociatedContentDsl<CATEGORY_DSL>