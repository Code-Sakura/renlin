package net.kigawa.renlin.w3c.category.integration

import net.kigawa.renlin.w3c.category.ContentCategory
import net.kigawa.renlin.w3c.category.native.FlowContent
        import net.kigawa.renlin.w3c.category.native.PhrasingContent
        import net.kigawa.renlin.w3c.category.native.EmbeddedContent
        import net.kigawa.renlin.w3c.category.native.PalpableContent
        import net.kigawa.renlin.w3c.category.native.FormAssociatedContent
        import net.kigawa.renlin.w3c.category.native.InteractiveContent
        import net.kigawa.renlin.w3c.category.integration.FlowPalpable
        import net.kigawa.renlin.w3c.category.integration.FlowInteractivePalpablePhrasing
        import net.kigawa.renlin.w3c.category.integration.FlowPalpablePhrasing
        import net.kigawa.renlin.w3c.category.integration.FlowPhrasing
        import net.kigawa.renlin.w3c.category.integration.EmbeddedFlowInteractivePalpablePhrasing
        import net.kigawa.renlin.w3c.category.integration.EmbeddedFlowPalpablePhrasing
        import net.kigawa.renlin.w3c.category.integration.FlowFormAssociatedInteractivePalpablePhrasing
        import net.kigawa.renlin.w3c.category.integration.FlowFormAssociatedPalpablePhrasing
        import net.kigawa.renlin.w3c.category.integration.FlowInteractivePalpable
        import net.kigawa.renlin.w3c.category.native.ImgCategory
        import net.kigawa.renlin.w3c.category.native.ObjectCategory

/**
 * Integration of FlowContent, PhrasingContent, EmbeddedContent, PalpableContent, FormAssociatedContent, InteractiveContent
 */
interface EmbeddedFlowFormAssociatedInteractivePalpablePhrasing: FlowContent, PhrasingContent, EmbeddedContent, PalpableContent, FormAssociatedContent, InteractiveContent, FlowPalpable, FlowInteractivePalpablePhrasing, FlowPalpablePhrasing, FlowPhrasing, EmbeddedFlowInteractivePalpablePhrasing, EmbeddedFlowPalpablePhrasing, FlowFormAssociatedInteractivePalpablePhrasing, FlowFormAssociatedPalpablePhrasing, FlowInteractivePalpable, ImgCategory, ObjectCategory, ContentCategory