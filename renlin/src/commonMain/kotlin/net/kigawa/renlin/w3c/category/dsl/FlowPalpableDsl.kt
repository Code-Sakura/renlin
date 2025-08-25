package net.kigawa.renlin.w3c.category.dsl


import net.kigawa.renlin.w3c.category.integration.FlowPalpable
import net.kigawa.renlin.dsl.StatedDsl


/**
 * DSL for FlowContent, PalpableContent
 */
interface FlowPalpableDsl<CATEGORY_DSL : FlowPalpable>:
    FlowContentDsl<CATEGORY_DSL>,
    PalpableContentDsl<CATEGORY_DSL>,
    StatedDsl<CATEGORY_DSL>