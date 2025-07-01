package net.kigawa.renlin.w3c.event.name

import net.kigawa.renlin.w3c.event.WebEvent
import net.kigawa.renlin.w3c.event.WebPointerEvent
import kotlin.reflect.KClass

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
expect class EventName<T : WebEvent>(kClass: KClass<T>, name: String) : EventNameCommon<T> {
}