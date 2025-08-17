package net.kigawa.renlin.w3c.category.integration

import net.kigawa.renlin.w3c.category.ContentCategory
import net.kigawa.renlin.w3c.category.native.FlowContent
        import net.kigawa.renlin.w3c.category.native.PhrasingContent
        import net.kigawa.renlin.w3c.category.native.EmbeddedContent
        import net.kigawa.renlin.w3c.category.native.PalpableContent
        import net.kigawa.renlin.w3c.category.integration.FlowPalpable
        import net.kigawa.renlin.w3c.category.integration.FlowPalpablePhrasing
        import net.kigawa.renlin.w3c.category.integration.FlowPhrasing
        import net.kigawa.renlin.w3c.category.native.PictureCategory
        import net.kigawa.renlin.w3c.category.native.SvgCategory
        import net.kigawa.renlin.w3c.category.native.MathCategory
        import net.kigawa.renlin.w3c.category.native.CanvasCategory

/**
 * Integration of FlowContent, PhrasingContent, EmbeddedContent, PalpableContent
 */
interface EmbeddedFlowPalpablePhrasing: FlowContent, PhrasingContent, EmbeddedContent, PalpableContent, FlowPalpable, FlowPalpablePhrasing, FlowPhrasing, PictureCategory, SvgCategory, MathCategory, CanvasCategory, ContentCategory