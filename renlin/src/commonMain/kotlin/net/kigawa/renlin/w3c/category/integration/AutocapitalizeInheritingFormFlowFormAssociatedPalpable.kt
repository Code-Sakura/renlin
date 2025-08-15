package net.kigawa.renlin.w3c.category.integration

import net.kigawa.renlin.w3c.category.ContentCategory
import net.kigawa.renlin.w3c.category.native.FlowContent
        import net.kigawa.renlin.w3c.category.native.PalpableContent
        import net.kigawa.renlin.w3c.category.native.FormAssociatedContent
        import net.kigawa.renlin.w3c.category.native.AutocapitalizeInheritingFormContent
        import net.kigawa.renlin.w3c.category.integration.FlowPalpable
        import net.kigawa.renlin.w3c.category.native.FieldsetCategory

/**
 * Integration of FlowContent, PalpableContent, FormAssociatedContent, AutocapitalizeInheritingFormContent
 */
interface AutocapitalizeInheritingFormFlowFormAssociatedPalpable: FlowContent, PalpableContent, FormAssociatedContent, AutocapitalizeInheritingFormContent, FlowPalpable, FieldsetCategory, ContentCategory