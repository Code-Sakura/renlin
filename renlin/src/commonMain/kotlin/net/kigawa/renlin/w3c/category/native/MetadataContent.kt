package net.kigawa.renlin.w3c.category.native

import net.kigawa.renlin.w3c.category.ContentCategory
import net.kigawa.renlin.w3c.category.native.BaseCategory
import net.kigawa.renlin.w3c.category.native.LinkCategory
import net.kigawa.renlin.w3c.category.native.MetaCategory
import net.kigawa.renlin.w3c.category.native.StyleCategory
import net.kigawa.renlin.w3c.category.native.TitleCategory
import net.kigawa.renlin.w3c.category.native.NoscriptCategory
import net.kigawa.renlin.w3c.category.native.ScriptCategory
import net.kigawa.renlin.w3c.category.native.TemplateCategory

/**
 * MetadataContent represents elements that are part of the metadata content category.
 * 
 */
interface MetadataContent : ContentCategory, BaseCategory, LinkCategory, MetaCategory, StyleCategory, TitleCategory, NoscriptCategory, ScriptCategory, TemplateCategory