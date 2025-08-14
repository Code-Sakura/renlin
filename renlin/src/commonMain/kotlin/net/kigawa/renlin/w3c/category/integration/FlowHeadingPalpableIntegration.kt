package net.kigawa.renlin.w3c.category.integration

import net.kigawa.renlin.w3c.category.ContentCategory
import net.kigawa.renlin.w3c.category.native.FlowContent
        import net.kigawa.renlin.w3c.category.native.HeadingContent
        import net.kigawa.renlin.w3c.category.native.PalpableContent
        import net.kigawa.renlin.w3c.category.integration.FlowPalpableIntegration
        import net.kigawa.renlin.w3c.category.integration.FlowHeadingIntegration

/**
 * Integration of FlowContent, HeadingContent, PalpableContent
 */
interface FlowHeadingPalpableIntegration: FlowContent, HeadingContent, PalpableContent, FlowPalpableIntegration, FlowHeadingIntegration, ContentCategory