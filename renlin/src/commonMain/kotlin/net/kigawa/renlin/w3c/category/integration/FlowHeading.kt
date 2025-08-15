package net.kigawa.renlin.w3c.category.integration

import net.kigawa.renlin.w3c.category.ContentCategory
import net.kigawa.renlin.w3c.category.native.FlowContent
        import net.kigawa.renlin.w3c.category.native.HeadingContent
        import net.kigawa.renlin.w3c.category.native.HgroupCategory

/**
 * Integration of FlowContent, HeadingContent
 */
interface FlowHeading: FlowContent, HeadingContent, HgroupCategory, ContentCategory