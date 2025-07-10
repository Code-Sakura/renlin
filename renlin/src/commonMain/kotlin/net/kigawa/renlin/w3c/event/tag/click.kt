package net.kigawa.renlin.w3c.event.tag

import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.dsl.EmptyDsl
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.tag.Tag
import net.kigawa.renlin.tag.component.Component1
import net.kigawa.renlin.w3c.category.native.EventTarget
import net.kigawa.renlin.w3c.event.WebPointerEvent

fun StatedDsl<out EventTarget>.onClick(block: (WebPointerEvent)-> Unit) {
    this.dslStateData?.onClick = block
}