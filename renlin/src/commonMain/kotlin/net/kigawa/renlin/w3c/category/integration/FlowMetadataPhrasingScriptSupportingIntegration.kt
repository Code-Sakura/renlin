package net.kigawa.renlin.w3c.category.integration

import net.kigawa.renlin.w3c.category.ContentCategory
import net.kigawa.renlin.w3c.category.native.MetadataContent
import net.kigawa.renlin.w3c.category.native.FlowContent
import net.kigawa.renlin.w3c.category.native.PhrasingContent
import net.kigawa.renlin.w3c.category.native.ScriptSupportingContent

/**
 * Integration of MetadataContent, FlowContent, PhrasingContent, ScriptSupportingContent
 */
interface FlowMetadataPhrasingScriptSupportingIntegration : MetadataContent, FlowContent, PhrasingContent, ScriptSupportingContent, ContentCategory