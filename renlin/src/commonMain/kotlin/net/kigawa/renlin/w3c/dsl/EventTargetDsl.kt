package net.kigawa.renlin.w3c.dsl

import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.w3c.category.ContentCategory
import net.kigawa.renlin.w3c.event.WebPointerEvent

interface EventTargetDsl<CONTENT_CATEGORY : ContentCategory> : StatedDsl<CONTENT_CATEGORY> {
    fun onClick(block: (WebPointerEvent) -> Unit){
        dslState
    }
}