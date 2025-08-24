package net.kigawa.renlin.w3c.category.dsl


import net.kigawa.renlin.w3c.category.integration.AutocapitalizeInheritingFormFlowFormAssociatedPalpable
import net.kigawa.renlin.dsl.StatedDsl


/**
 * DSL for FlowContent, PalpableContent, FormAssociatedContent, AutocapitalizeInheritingFormContent
 */
interface AutocapitalizeInheritingFormFlowFormAssociatedPalpableDsl<CATEGORY_DSL : AutocapitalizeInheritingFormFlowFormAssociatedPalpable>:
    FlowContentDsl<CATEGORY_DSL>,
    PalpableContentDsl<CATEGORY_DSL>,
    FormAssociatedContentDsl<CATEGORY_DSL>,
    AutocapitalizeInheritingFormContentDsl<CATEGORY_DSL>: StatedDsl<CATEGORY_DSL>