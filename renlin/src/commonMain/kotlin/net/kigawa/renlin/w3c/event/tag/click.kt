package net.kigawa.renlin.w3c.event.tag

import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.w3c.category.native.EventTarget
import net.kigawa.renlin.w3c.event.WebPointerEvent

fun StatedDsl<out EventTarget>.onClick(block: (WebPointerEvent)-> Unit) {
    this.dslStateData?.onClick = block
}