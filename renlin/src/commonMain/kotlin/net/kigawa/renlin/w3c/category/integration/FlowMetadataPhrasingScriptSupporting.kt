package net.kigawa.renlin.w3c.category.integration

import net.kigawa.renlin.w3c.category.ContentCategory
import net.kigawa.renlin.w3c.category.native.MetadataContent
        import net.kigawa.renlin.w3c.category.native.FlowContent
        import net.kigawa.renlin.w3c.category.native.PhrasingContent
        import net.kigawa.renlin.w3c.category.native.ScriptSupportingContent
        import net.kigawa.renlin.w3c.category.integration.FlowMetadataPhrasing
        import net.kigawa.renlin.w3c.category.integration.FlowPhrasing
        import net.kigawa.renlin.w3c.category.native.ScriptCategory
        import net.kigawa.renlin.w3c.category.native.TemplateCategory

/**
 * Integration of MetadataContent, FlowContent, PhrasingContent, ScriptSupportingContent
 */
interface FlowMetadataPhrasingScriptSupporting: MetadataContent, FlowContent, PhrasingContent, ScriptSupportingContent, FlowMetadataPhrasing, FlowPhrasing, ScriptCategory, TemplateCategory, ContentCategory