package net.kigawa.renlin.w3c.category.dsl


import net.kigawa.renlin.w3c.category.integration.FlowPalpableIntegration


/**
 * DSL for FlowContent, PalpableContent
 */
interface FlowPalpableDsl<CATEGORY_DSL : FlowPalpableIntegration>:
    FlowContentDsl<CATEGORY_DSL>,
    PalpableContentDsl<CATEGORY_DSL>