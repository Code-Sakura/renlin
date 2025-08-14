package net.kigawa.renlin.w3c.category.integration

import net.kigawa.renlin.w3c.category.ContentCategory
import net.kigawa.renlin.w3c.category.native.FlowContent
        import net.kigawa.renlin.w3c.category.native.PhrasingContent
        import net.kigawa.renlin.w3c.category.native.EmbeddedContent
        import net.kigawa.renlin.w3c.category.native.PalpableContent
        import net.kigawa.renlin.w3c.category.native.InteractiveContent
        import net.kigawa.renlin.w3c.category.integration.FlowPalpableIntegration
        import net.kigawa.renlin.w3c.category.integration.FlowInteractivePalpablePhrasingIntegration
        import net.kigawa.renlin.w3c.category.integration.FlowPalpablePhrasingIntegration
        import net.kigawa.renlin.w3c.category.integration.FlowPhrasingIntegration
        import net.kigawa.renlin.w3c.category.integration.EmbeddedFlowPalpablePhrasingIntegration
        import net.kigawa.renlin.w3c.category.integration.FlowInteractivePalpableIntegration

/**
 * Integration of FlowContent, PhrasingContent, EmbeddedContent, PalpableContent, InteractiveContent
 */
interface EmbeddedFlowInteractivePalpablePhrasingIntegration: FlowContent, PhrasingContent, EmbeddedContent, PalpableContent, InteractiveContent, FlowPalpableIntegration, FlowInteractivePalpablePhrasingIntegration, FlowPalpablePhrasingIntegration, FlowPhrasingIntegration, EmbeddedFlowPalpablePhrasingIntegration, FlowInteractivePalpableIntegration, ContentCategory