package net.kigawa.renlin.w3c.category.integration

import net.kigawa.renlin.w3c.category.ContentCategory
import net.kigawa.renlin.w3c.category.native.MetadataContent
        import net.kigawa.renlin.w3c.category.native.FlowContent
        import net.kigawa.renlin.w3c.category.native.PhrasingContent
        import net.kigawa.renlin.w3c.category.integration.FlowPhrasingIntegration

/**
 * Integration of MetadataContent, FlowContent, PhrasingContent
 */
interface FlowMetadataPhrasingIntegration: MetadataContent, FlowContent, PhrasingContent, FlowPhrasingIntegration, ContentCategory