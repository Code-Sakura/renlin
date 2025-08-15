package net.kigawa.renlin.w3c.category.integration

import net.kigawa.renlin.w3c.category.ContentCategory
import net.kigawa.renlin.w3c.category.native.MetadataContent
        import net.kigawa.renlin.w3c.category.native.FlowContent
        import net.kigawa.renlin.w3c.category.native.PhrasingContent
        import net.kigawa.renlin.w3c.category.integration.FlowPhrasing
        import net.kigawa.renlin.w3c.category.native.LinkCategory
        import net.kigawa.renlin.w3c.category.native.MetaCategory
        import net.kigawa.renlin.w3c.category.native.NoscriptCategory

/**
 * Integration of MetadataContent, FlowContent, PhrasingContent
 */
interface FlowMetadataPhrasing: MetadataContent, FlowContent, PhrasingContent, FlowPhrasing, LinkCategory, MetaCategory, NoscriptCategory, ContentCategory