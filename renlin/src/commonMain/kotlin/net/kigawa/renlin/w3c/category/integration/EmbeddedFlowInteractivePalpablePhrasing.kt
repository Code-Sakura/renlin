package net.kigawa.renlin.w3c.category.integration

import net.kigawa.renlin.w3c.category.ContentCategory
import net.kigawa.renlin.w3c.category.native.FlowContent
        import net.kigawa.renlin.w3c.category.native.PhrasingContent
        import net.kigawa.renlin.w3c.category.native.EmbeddedContent
        import net.kigawa.renlin.w3c.category.native.PalpableContent
        import net.kigawa.renlin.w3c.category.native.InteractiveContent
        import net.kigawa.renlin.w3c.category.integration.FlowPalpable
        import net.kigawa.renlin.w3c.category.integration.FlowInteractivePalpablePhrasing
        import net.kigawa.renlin.w3c.category.integration.FlowPalpablePhrasing
        import net.kigawa.renlin.w3c.category.integration.FlowPhrasing
        import net.kigawa.renlin.w3c.category.integration.EmbeddedFlowPalpablePhrasing
        import net.kigawa.renlin.w3c.category.integration.FlowInteractivePalpable
        import net.kigawa.renlin.w3c.category.native.AudioCategory
        import net.kigawa.renlin.w3c.category.native.VideoCategory
        import net.kigawa.renlin.w3c.category.native.EmbedCategory
        import net.kigawa.renlin.w3c.category.native.IframeCategory

/**
 * Integration of FlowContent, PhrasingContent, EmbeddedContent, PalpableContent, InteractiveContent
 */
interface EmbeddedFlowInteractivePalpablePhrasing: FlowContent, PhrasingContent, EmbeddedContent, PalpableContent, InteractiveContent, FlowPalpable, FlowInteractivePalpablePhrasing, FlowPalpablePhrasing, FlowPhrasing, EmbeddedFlowPalpablePhrasing, FlowInteractivePalpable, AudioCategory, VideoCategory, EmbedCategory, IframeCategory, ContentCategory