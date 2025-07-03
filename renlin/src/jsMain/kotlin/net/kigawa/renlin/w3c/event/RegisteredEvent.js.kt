package net.kigawa.renlin.w3c.event

import net.kigawa.renlin.w3c.event.name.EventName
import org.w3c.dom.events.Event

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual class RegisteredEvent(
    val name: EventName<*>,
    val listener: (Event) -> Unit,
)