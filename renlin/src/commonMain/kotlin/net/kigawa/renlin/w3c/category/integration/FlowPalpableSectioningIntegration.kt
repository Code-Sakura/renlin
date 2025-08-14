package net.kigawa.renlin.w3c.category.integration

import net.kigawa.renlin.w3c.category.ContentCategory
import net.kigawa.renlin.w3c.category.native.FlowContent
        import net.kigawa.renlin.w3c.category.native.SectioningContent
        import net.kigawa.renlin.w3c.category.native.PalpableContent
        import net.kigawa.renlin.w3c.category.integration.FlowPalpableIntegration

/**
 * Integration of FlowContent, SectioningContent, PalpableContent
 */
interface FlowPalpableSectioningIntegration: FlowContent, SectioningContent, PalpableContent, FlowPalpableIntegration, ContentCategory