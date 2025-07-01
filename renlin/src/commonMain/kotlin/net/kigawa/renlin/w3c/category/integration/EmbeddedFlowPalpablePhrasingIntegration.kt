package net.kigawa.renlin.w3c.category.integration

import net.kigawa.renlin.w3c.category.ContentCategory
import net.kigawa.renlin.w3c.category.native.FlowContent
import net.kigawa.renlin.w3c.category.native.PhrasingContent
import net.kigawa.renlin.w3c.category.native.EmbeddedContent
import net.kigawa.renlin.w3c.category.native.PalpableContent

/**
 * Integration of FlowContent, PhrasingContent, EmbeddedContent, PalpableContent
 */
interface EmbeddedFlowPalpablePhrasingIntegration : FlowContent, PhrasingContent, EmbeddedContent, PalpableContent, ContentCategory