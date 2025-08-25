package net.kigawa.renlin.w3c.category.dsl


import net.kigawa.renlin.w3c.category.integration.FlowPhrasing
import net.kigawa.renlin.dsl.StatedDsl


/**
 * DSL for FlowContent, PhrasingContent
 */
interface FlowPhrasingDsl<CATEGORY_DSL : FlowPhrasing>:
    FlowContentDsl<CATEGORY_DSL>,
    PhrasingContentDsl<CATEGORY_DSL>,
    StatedDsl<CATEGORY_DSL>