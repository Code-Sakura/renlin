package net.kigawa.renlin.w3c.category.dsl


import net.kigawa.renlin.w3c.category.integration.FlowFormAssociatedInteractivePalpablePhrasing
import net.kigawa.renlin.dsl.StatedDsl


/**
 * DSL for FlowContent, PhrasingContent, InteractiveContent, PalpableContent, FormAssociatedContent
 */
interface FlowFormAssociatedInteractivePalpablePhrasingDsl<CATEGORY_DSL : FlowFormAssociatedInteractivePalpablePhrasing>:
    FlowContentDsl<CATEGORY_DSL>,
    PhrasingContentDsl<CATEGORY_DSL>,
    InteractiveContentDsl<CATEGORY_DSL>,
    PalpableContentDsl<CATEGORY_DSL>,
    FormAssociatedContentDsl<CATEGORY_DSL>: StatedDsl<CATEGORY_DSL>