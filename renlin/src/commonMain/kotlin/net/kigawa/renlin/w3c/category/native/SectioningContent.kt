package net.kigawa.renlin.w3c.category.native

import net.kigawa.renlin.w3c.category.ContentCategory
import net.kigawa.renlin.w3c.category.native.ArticleCategory
import net.kigawa.renlin.w3c.category.native.AsideCategory
import net.kigawa.renlin.w3c.category.native.NavCategory
import net.kigawa.renlin.w3c.category.native.SectionCategory

/**
 * SectioningContent represents elements that are part of the sectioning content category.
 * Parent: FlowContent
 */
interface SectioningContent : ContentCategory, FlowContent, ArticleCategory, AsideCategory, NavCategory, SectionCategory