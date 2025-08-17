package net.kigawa.renlin.w3c.category.integration

import net.kigawa.renlin.w3c.category.ContentCategory
import net.kigawa.renlin.w3c.category.native.FlowContent
        import net.kigawa.renlin.w3c.category.native.PhrasingContent
        import net.kigawa.renlin.w3c.category.native.PalpableContent
        import net.kigawa.renlin.w3c.category.native.FormAssociatedContent
        import net.kigawa.renlin.w3c.category.integration.FlowPalpable
        import net.kigawa.renlin.w3c.category.integration.FlowPalpablePhrasing
        import net.kigawa.renlin.w3c.category.integration.FlowPhrasing
        import net.kigawa.renlin.w3c.category.native.OutputCategory

/**
 * Integration of FlowContent, PhrasingContent, PalpableContent, FormAssociatedContent
 */
interface FlowFormAssociatedPalpablePhrasing: FlowContent, PhrasingContent, PalpableContent, FormAssociatedContent, FlowPalpable, FlowPalpablePhrasing, FlowPhrasing, OutputCategory, ContentCategory