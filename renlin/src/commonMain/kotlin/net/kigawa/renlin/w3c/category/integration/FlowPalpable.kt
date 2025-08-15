package net.kigawa.renlin.w3c.category.integration

import net.kigawa.renlin.w3c.category.ContentCategory
import net.kigawa.renlin.w3c.category.native.FlowContent
        import net.kigawa.renlin.w3c.category.native.PalpableContent
        import net.kigawa.renlin.w3c.category.native.PCategory
        import net.kigawa.renlin.w3c.category.native.DivCategory
        import net.kigawa.renlin.w3c.category.native.AddressCategory
        import net.kigawa.renlin.w3c.category.native.FooterCategory
        import net.kigawa.renlin.w3c.category.native.HeaderCategory
        import net.kigawa.renlin.w3c.category.native.MainCategory
        import net.kigawa.renlin.w3c.category.native.SearchCategory
        import net.kigawa.renlin.w3c.category.native.BlockquoteCategory
        import net.kigawa.renlin.w3c.category.native.DlCategory
        import net.kigawa.renlin.w3c.category.native.FigureCategory
        import net.kigawa.renlin.w3c.category.native.OlCategory
        import net.kigawa.renlin.w3c.category.native.PreCategory
        import net.kigawa.renlin.w3c.category.native.UlCategory
        import net.kigawa.renlin.w3c.category.native.TableCategory
        import net.kigawa.renlin.w3c.category.native.FormCategory

/**
 * Integration of FlowContent, PalpableContent
 */
interface FlowPalpable: FlowContent, PalpableContent, PCategory, DivCategory, AddressCategory, FooterCategory, HeaderCategory, MainCategory, SearchCategory, BlockquoteCategory, DlCategory, FigureCategory, OlCategory, PreCategory, UlCategory, TableCategory, FormCategory, ContentCategory