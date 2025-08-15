package net.kigawa.renlin.w3c.category.dsl


import net.kigawa.renlin.w3c.category.integration.FlowPalpable


/**
 * DSL for FlowContent, PalpableContent
 */
interface FlowPalpableDsl<CATEGORY_DSL : FlowPalpable>:
    FlowContentDsl<CATEGORY_DSL>,
    PalpableContentDsl<CATEGORY_DSL>