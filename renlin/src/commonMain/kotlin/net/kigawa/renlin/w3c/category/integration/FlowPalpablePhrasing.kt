package net.kigawa.renlin.w3c.category.integration

import net.kigawa.renlin.w3c.category.ContentCategory
import net.kigawa.renlin.w3c.category.native.FlowContent
        import net.kigawa.renlin.w3c.category.native.PhrasingContent
        import net.kigawa.renlin.w3c.category.native.PalpableContent
        import net.kigawa.renlin.w3c.category.integration.FlowPalpable
        import net.kigawa.renlin.w3c.category.integration.FlowPhrasing
        import net.kigawa.renlin.w3c.category.native.AbbrCategory
        import net.kigawa.renlin.w3c.category.native.BCategory
        import net.kigawa.renlin.w3c.category.native.BdiCategory
        import net.kigawa.renlin.w3c.category.native.BdoCategory
        import net.kigawa.renlin.w3c.category.native.CiteCategory
        import net.kigawa.renlin.w3c.category.native.CodeCategory
        import net.kigawa.renlin.w3c.category.native.DataCategory
        import net.kigawa.renlin.w3c.category.native.DfnCategory
        import net.kigawa.renlin.w3c.category.native.EmCategory
        import net.kigawa.renlin.w3c.category.native.ICategory
        import net.kigawa.renlin.w3c.category.native.KbdCategory
        import net.kigawa.renlin.w3c.category.native.MarkCategory
        import net.kigawa.renlin.w3c.category.native.QCategory
        import net.kigawa.renlin.w3c.category.native.RubyCategory
        import net.kigawa.renlin.w3c.category.native.SCategory
        import net.kigawa.renlin.w3c.category.native.SampCategory
        import net.kigawa.renlin.w3c.category.native.SmallCategory
        import net.kigawa.renlin.w3c.category.native.SpanCategory
        import net.kigawa.renlin.w3c.category.native.StrongCategory
        import net.kigawa.renlin.w3c.category.native.SubCategory
        import net.kigawa.renlin.w3c.category.native.SupCategory
        import net.kigawa.renlin.w3c.category.native.TimeCategory
        import net.kigawa.renlin.w3c.category.native.UCategory
        import net.kigawa.renlin.w3c.category.native.VarCategory
        import net.kigawa.renlin.w3c.category.native.MapCategory
        import net.kigawa.renlin.w3c.category.native.DelCategory
        import net.kigawa.renlin.w3c.category.native.InsCategory
        import net.kigawa.renlin.w3c.category.native.MeterCategory
        import net.kigawa.renlin.w3c.category.native.ProgressCategory

/**
 * Integration of FlowContent, PhrasingContent, PalpableContent
 */
interface FlowPalpablePhrasing: FlowContent, PhrasingContent, PalpableContent, FlowPalpable, FlowPhrasing, AbbrCategory, BCategory, BdiCategory, BdoCategory, CiteCategory, CodeCategory, DataCategory, DfnCategory, EmCategory, ICategory, KbdCategory, MarkCategory, QCategory, RubyCategory, SCategory, SampCategory, SmallCategory, SpanCategory, StrongCategory, SubCategory, SupCategory, TimeCategory, UCategory, VarCategory, MapCategory, DelCategory, InsCategory, MeterCategory, ProgressCategory, ContentCategory