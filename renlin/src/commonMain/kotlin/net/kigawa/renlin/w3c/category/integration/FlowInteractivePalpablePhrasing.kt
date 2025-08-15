package net.kigawa.renlin.w3c.category.integration

import net.kigawa.renlin.w3c.category.ContentCategory
import net.kigawa.renlin.w3c.category.native.FlowContent
        import net.kigawa.renlin.w3c.category.native.PhrasingContent
        import net.kigawa.renlin.w3c.category.native.PalpableContent
        import net.kigawa.renlin.w3c.category.native.InteractiveContent
        import net.kigawa.renlin.w3c.category.integration.FlowPalpable
        import net.kigawa.renlin.w3c.category.integration.FlowPalpablePhrasing
        import net.kigawa.renlin.w3c.category.integration.FlowPhrasing
        import net.kigawa.renlin.w3c.category.integration.FlowInteractivePalpable
        import net.kigawa.renlin.w3c.category.native.ACategory
        import net.kigawa.renlin.w3c.category.native.LabelCategory

/**
 * Integration of FlowContent, PhrasingContent, PalpableContent, InteractiveContent
 */
interface FlowInteractivePalpablePhrasing: FlowContent, PhrasingContent, PalpableContent, InteractiveContent, FlowPalpable, FlowPalpablePhrasing, FlowPhrasing, FlowInteractivePalpable, ACategory, LabelCategory, ContentCategory