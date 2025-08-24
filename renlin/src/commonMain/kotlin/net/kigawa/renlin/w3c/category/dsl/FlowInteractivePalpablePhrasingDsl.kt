package net.kigawa.renlin.w3c.category.dsl


import net.kigawa.renlin.w3c.category.integration.FlowInteractivePalpablePhrasing
import net.kigawa.renlin.dsl.StatedDsl


/**
 * DSL for FlowContent, PhrasingContent, PalpableContent, InteractiveContent
 */
interface FlowInteractivePalpablePhrasingDsl<CATEGORY_DSL : FlowInteractivePalpablePhrasing>:
    FlowContentDsl<CATEGORY_DSL>,
    PhrasingContentDsl<CATEGORY_DSL>,
    PalpableContentDsl<CATEGORY_DSL>,
    InteractiveContentDsl<CATEGORY_DSL>: StatedDsl<CATEGORY_DSL>