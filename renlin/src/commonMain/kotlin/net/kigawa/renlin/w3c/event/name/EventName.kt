package net.kigawa.renlin.w3c.event.name

import net.kigawa.renlin.w3c.event.WebEvent
import net.kigawa.renlin.w3c.event.WebPointerEvent
import kotlin.reflect.KClass

class EventName<T : WebEvent>(
    val kClass: KClass<T>, val name: String,
) {
    companion object {
        val click = EventName(WebPointerEvent::class, "click")
    }
}