package net.kigawa.renlin.w3c.category.integration

import net.kigawa.renlin.w3c.category.ContentCategory
import net.kigawa.renlin.w3c.category.native.FlowContent
import net.kigawa.renlin.w3c.category.native.PalpableContent
import net.kigawa.renlin.w3c.category.native.FormAssociatedContent
import net.kigawa.renlin.w3c.category.native.AutocapitalizeInheritingFormContent

/**
 * Integration of FlowContent, PalpableContent, FormAssociatedContent, AutocapitalizeInheritingFormContent
 */
interface AutocapitalizeInheritingFormFlowFormAssociatedPalpableIntegration : FlowContent, PalpableContent, FormAssociatedContent, AutocapitalizeInheritingFormContent, ContentCategory