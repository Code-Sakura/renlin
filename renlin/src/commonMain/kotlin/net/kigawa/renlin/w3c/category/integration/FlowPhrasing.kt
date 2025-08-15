package net.kigawa.renlin.w3c.category.integration

import net.kigawa.renlin.w3c.category.ContentCategory
import net.kigawa.renlin.w3c.category.native.FlowContent
        import net.kigawa.renlin.w3c.category.native.PhrasingContent
        import net.kigawa.renlin.w3c.category.native.BrCategory
        import net.kigawa.renlin.w3c.category.native.RpCategory
        import net.kigawa.renlin.w3c.category.native.RtCategory
        import net.kigawa.renlin.w3c.category.native.WbrCategory
        import net.kigawa.renlin.w3c.category.native.AreaCategory
        import net.kigawa.renlin.w3c.category.native.DatalistCategory
        import net.kigawa.renlin.w3c.category.native.SlotCategory

/**
 * Integration of FlowContent, PhrasingContent
 */
interface FlowPhrasing: FlowContent, PhrasingContent, BrCategory, RpCategory, RtCategory, WbrCategory, AreaCategory, DatalistCategory, SlotCategory, ContentCategory