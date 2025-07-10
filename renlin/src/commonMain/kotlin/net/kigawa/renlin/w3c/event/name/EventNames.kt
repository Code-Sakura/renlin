package net.kigawa.renlin.w3c.event.name

import net.kigawa.renlin.w3c.event.WebPointerEvent

object EventNames {
    val click: EventName<WebPointerEvent> = EventName(WebPointerEvent::class, "click")
}