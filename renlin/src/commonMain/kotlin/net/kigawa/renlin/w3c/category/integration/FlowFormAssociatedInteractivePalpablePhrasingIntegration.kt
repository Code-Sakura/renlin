package net.kigawa.renlin.w3c.category.integration

import net.kigawa.renlin.w3c.category.ContentCategory
import net.kigawa.renlin.w3c.category.native.FlowContent
import net.kigawa.renlin.w3c.category.native.PhrasingContent
import net.kigawa.renlin.w3c.category.native.InteractiveContent
import net.kigawa.renlin.w3c.category.native.PalpableContent
import net.kigawa.renlin.w3c.category.native.FormAssociatedContent

/**
 * Integration of FlowContent, PhrasingContent, InteractiveContent, PalpableContent, FormAssociatedContent
 */
interface FlowFormAssociatedInteractivePalpablePhrasingIntegration : FlowContent, PhrasingContent, InteractiveContent, PalpableContent, FormAssociatedContent, ContentCategory