package net.kigawa.renlin.w3c.category.dsl


import net.kigawa.renlin.w3c.category.integration.FlowPalpablePhrasing
import net.kigawa.renlin.dsl.StatedDsl


/**
 * DSL for FlowContent, PalpableContent, PhrasingContent
 */
interface FlowPalpablePhrasingDsl<CATEGORY_DSL : FlowPalpablePhrasing>:
    FlowContentDsl<CATEGORY_DSL>,
    PalpableContentDsl<CATEGORY_DSL>,
    PhrasingContentDsl<CATEGORY_DSL>: StatedDsl<CATEGORY_DSL>