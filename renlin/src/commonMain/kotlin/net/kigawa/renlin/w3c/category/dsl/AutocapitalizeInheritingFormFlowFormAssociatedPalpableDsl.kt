package net.kigawa.renlin.w3c.category.dsl


import net.kigawa.renlin.w3c.category.integration.AutocapitalizeInheritingFormFlowFormAssociatedPalpableIntegration


/**
 * DSL for FlowContent, PalpableContent, FormAssociatedContent, AutocapitalizeInheritingFormContent
 */
interface AutocapitalizeInheritingFormFlowFormAssociatedPalpableDsl<CATEGORY_DSL : AutocapitalizeInheritingFormFlowFormAssociatedPalpableIntegration>:
    FlowContentDsl<CATEGORY_DSL>,
    PalpableContentDsl<CATEGORY_DSL>,
    FormAssociatedContentDsl<CATEGORY_DSL>,
    AutocapitalizeInheritingFormContentDsl<CATEGORY_DSL>