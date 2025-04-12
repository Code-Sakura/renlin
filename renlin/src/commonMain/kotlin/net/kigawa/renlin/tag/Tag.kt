package net.kigawa.renlin.tag

import net.kigawa.renlin.category.ContentCategory

@Suppress("unused")
interface Tag<CONTENT_CATEGORY : ContentCategory> {
    val name: String
}