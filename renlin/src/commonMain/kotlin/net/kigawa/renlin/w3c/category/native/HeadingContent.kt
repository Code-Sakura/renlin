package net.kigawa.renlin.w3c.category.native

import net.kigawa.renlin.w3c.category.ContentCategory
import net.kigawa.renlin.w3c.category.native.H1Category
import net.kigawa.renlin.w3c.category.native.H2Category
import net.kigawa.renlin.w3c.category.native.H3Category
import net.kigawa.renlin.w3c.category.native.H4Category
import net.kigawa.renlin.w3c.category.native.H5Category
import net.kigawa.renlin.w3c.category.native.H6Category
import net.kigawa.renlin.w3c.category.native.HgroupCategory

/**
 * HeadingContent represents elements that are part of the heading content category.
 * Parent: FlowContent
 */
interface HeadingContent : ContentCategory, FlowContent, H1Category, H2Category, H3Category, H4Category, H5Category, H6Category, HgroupCategory