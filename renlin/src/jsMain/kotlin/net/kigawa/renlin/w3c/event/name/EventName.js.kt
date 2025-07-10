package net.kigawa.renlin.w3c.event.name

import net.kigawa.renlin.w3c.event.WebEvent
import net.kigawa.renlin.w3c.event.WebPointerEvent
import org.khronos.webgl.WebGLContextEventInit
import org.w3c.dom.events.Event
import kotlin.reflect.KClass

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual class EventName<T : WebEvent> actual constructor(kClass: KClass<T>, name: String) :
    EventNameCommon<T>(kClass, name) {
    companion object {
        private val webEventConstructors = listOf<WebEventInitializer<*>>(
            WebEventInitializer(WebPointerEvent::class) { object : WebPointerEvent by it {} },
        )

        private class WebEventInitializer<T : WebEvent>(
            val kClass: KClass<T>,
            val initializer: (Event) -> T,
        )
    }

    @Suppress("UNCHECKED_CAST")
    fun asWebEvent(event: Event): T {
        return webEventConstructors.single { it.kClass == kClass }.initializer(event) as T
    }
}
