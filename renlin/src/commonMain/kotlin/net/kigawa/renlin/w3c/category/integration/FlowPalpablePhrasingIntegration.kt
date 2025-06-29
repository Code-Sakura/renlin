package net.kigawa.renlin.w3c.category.integration

import net.kigawa.renlin.w3c.category.ContentCategory
import net.kigawa.renlin.w3c.category.native.FlowContent
import net.kigawa.renlin.w3c.category.native.PalpableContent
import net.kigawa.renlin.w3c.category.native.PhrasingContent

/**
 * Integration of FlowContent, PalpableContent, PhrasingContent
 */
interface FlowPalpablePhrasingIntegration : FlowContent, PalpableContent, PhrasingContent, ContentCategory