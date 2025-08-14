package net.kigawa.renlin.w3c.category.integration

import net.kigawa.renlin.w3c.category.ContentCategory
import net.kigawa.renlin.w3c.category.native.FlowContent
        import net.kigawa.renlin.w3c.category.native.PhrasingContent
        import net.kigawa.renlin.w3c.category.native.EmbeddedContent
        import net.kigawa.renlin.w3c.category.native.PalpableContent
        import net.kigawa.renlin.w3c.category.native.FormAssociatedContent
        import net.kigawa.renlin.w3c.category.native.InteractiveContent
        import net.kigawa.renlin.w3c.category.integration.FlowPalpableIntegration
        import net.kigawa.renlin.w3c.category.integration.FlowInteractivePalpablePhrasingIntegration
        import net.kigawa.renlin.w3c.category.integration.FlowPalpablePhrasingIntegration
        import net.kigawa.renlin.w3c.category.integration.FlowPhrasingIntegration
        import net.kigawa.renlin.w3c.category.integration.EmbeddedFlowInteractivePalpablePhrasingIntegration
        import net.kigawa.renlin.w3c.category.integration.EmbeddedFlowPalpablePhrasingIntegration
        import net.kigawa.renlin.w3c.category.integration.FlowFormAssociatedInteractivePalpablePhrasingIntegration
        import net.kigawa.renlin.w3c.category.integration.FlowFormAssociatedPalpablePhrasingIntegration
        import net.kigawa.renlin.w3c.category.integration.FlowInteractivePalpableIntegration

/**
 * Integration of FlowContent, PhrasingContent, EmbeddedContent, PalpableContent, FormAssociatedContent, InteractiveContent
 */
interface EmbeddedFlowFormAssociatedInteractivePalpablePhrasingIntegration: FlowContent, PhrasingContent, EmbeddedContent, PalpableContent, FormAssociatedContent, InteractiveContent, FlowPalpableIntegration, FlowInteractivePalpablePhrasingIntegration, FlowPalpablePhrasingIntegration, FlowPhrasingIntegration, EmbeddedFlowInteractivePalpablePhrasingIntegration, EmbeddedFlowPalpablePhrasingIntegration, FlowFormAssociatedInteractivePalpablePhrasingIntegration, FlowFormAssociatedPalpablePhrasingIntegration, FlowInteractivePalpableIntegration, ContentCategory