package net.kigawa.renlin.w3c.category.integration

import net.kigawa.renlin.w3c.category.ContentCategory
import net.kigawa.renlin.w3c.category.native.FlowContent
        import net.kigawa.renlin.w3c.category.native.HeadingContent
        import net.kigawa.renlin.w3c.category.native.PalpableContent
        import net.kigawa.renlin.w3c.category.integration.FlowPalpable
        import net.kigawa.renlin.w3c.category.integration.FlowHeading
        import net.kigawa.renlin.w3c.category.native.H1Category
        import net.kigawa.renlin.w3c.category.native.H2Category
        import net.kigawa.renlin.w3c.category.native.H3Category
        import net.kigawa.renlin.w3c.category.native.H4Category
        import net.kigawa.renlin.w3c.category.native.H5Category
        import net.kigawa.renlin.w3c.category.native.H6Category

/**
 * Integration of FlowContent, HeadingContent, PalpableContent
 */
interface FlowHeadingPalpable: FlowContent, HeadingContent, PalpableContent, FlowPalpable, FlowHeading, H1Category, H2Category, H3Category, H4Category, H5Category, H6Category, ContentCategory