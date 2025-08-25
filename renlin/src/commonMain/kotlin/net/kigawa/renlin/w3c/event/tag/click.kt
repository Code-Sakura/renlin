package net.kigawa.renlin.w3c.event.tag

import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.w3c.category.dsl.FlowContentDsl
import net.kigawa.renlin.w3c.category.native.EventTarget
import net.kigawa.renlin.w3c.event.WebPointerEvent

fun FlowContentDsl<*>.onClick(block: (WebPointerEvent)-> Unit) {
    this.dslStateData?.onClick = block
}