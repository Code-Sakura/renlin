package net.kigawa.renlin.w3c.category.integration

import net.kigawa.renlin.w3c.category.ContentCategory
import net.kigawa.renlin.w3c.category.native.FlowContent
import net.kigawa.renlin.w3c.category.native.PhrasingContent
import net.kigawa.renlin.w3c.category.native.PalpableContent
import net.kigawa.renlin.w3c.category.native.InteractiveContent

/**
 * Integration of FlowContent, PhrasingContent, PalpableContent, InteractiveContent
 */
interface FlowInteractivePalpablePhrasingIntegration : FlowContent, PhrasingContent, PalpableContent, InteractiveContent, ContentCategory