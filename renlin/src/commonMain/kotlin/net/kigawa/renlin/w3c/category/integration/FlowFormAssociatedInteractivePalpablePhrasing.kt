package net.kigawa.renlin.w3c.category.integration

import net.kigawa.renlin.w3c.category.ContentCategory
import net.kigawa.renlin.w3c.category.native.FlowContent
        import net.kigawa.renlin.w3c.category.native.PhrasingContent
        import net.kigawa.renlin.w3c.category.native.InteractiveContent
        import net.kigawa.renlin.w3c.category.native.PalpableContent
        import net.kigawa.renlin.w3c.category.native.FormAssociatedContent
        import net.kigawa.renlin.w3c.category.integration.FlowPalpable
        import net.kigawa.renlin.w3c.category.integration.FlowInteractivePalpablePhrasing
        import net.kigawa.renlin.w3c.category.integration.FlowPalpablePhrasing
        import net.kigawa.renlin.w3c.category.integration.FlowPhrasing
        import net.kigawa.renlin.w3c.category.integration.FlowFormAssociatedPalpablePhrasing
        import net.kigawa.renlin.w3c.category.integration.FlowInteractivePalpable
        import net.kigawa.renlin.w3c.category.native.ButtonCategory
        import net.kigawa.renlin.w3c.category.native.InputCategory
        import net.kigawa.renlin.w3c.category.native.SelectCategory
        import net.kigawa.renlin.w3c.category.native.TextareaCategory

/**
 * Integration of FlowContent, PhrasingContent, InteractiveContent, PalpableContent, FormAssociatedContent
 */
interface FlowFormAssociatedInteractivePalpablePhrasing: FlowContent, PhrasingContent, InteractiveContent, PalpableContent, FormAssociatedContent, FlowPalpable, FlowInteractivePalpablePhrasing, FlowPalpablePhrasing, FlowPhrasing, FlowFormAssociatedPalpablePhrasing, FlowInteractivePalpable, ButtonCategory, InputCategory, SelectCategory, TextareaCategory, ContentCategory