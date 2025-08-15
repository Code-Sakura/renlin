package net.kigawa.renlin.w3c.category.integration

import net.kigawa.renlin.w3c.category.ContentCategory
import net.kigawa.renlin.w3c.category.native.FlowContent
        import net.kigawa.renlin.w3c.category.native.SectioningContent
        import net.kigawa.renlin.w3c.category.native.PalpableContent
        import net.kigawa.renlin.w3c.category.integration.FlowPalpable
        import net.kigawa.renlin.w3c.category.native.ArticleCategory
        import net.kigawa.renlin.w3c.category.native.AsideCategory
        import net.kigawa.renlin.w3c.category.native.NavCategory
        import net.kigawa.renlin.w3c.category.native.SectionCategory

/**
 * Integration of FlowContent, SectioningContent, PalpableContent
 */
interface FlowPalpableSectioning: FlowContent, SectioningContent, PalpableContent, FlowPalpable, ArticleCategory, AsideCategory, NavCategory, SectionCategory, ContentCategory