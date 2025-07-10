package net.kigawa.renlin.state

import net.kigawa.renlin.w3c.event.WebPointerEvent
import kotlin.reflect.KClass
import kotlin.reflect.typeOf

data class DslStateData(
    val key: String,
    var onClick: ((WebPointerEvent) -> Unit)? = null,
    var additionalData: List<AdditionalDslStateData<*>> = listOf()
) {
    inline fun <reified T : Any> setAdditionalData(contextClass: KClass<*>, value: T, key: String? = null) {
        removeAdditionalData<T>(contextClass)
        additionalData = additionalData + AdditionalDslStateData(
            contextClass, typeOf<T>(), key, value
        )
    }

    inline fun <reified T : Any> removeAdditionalData(contextClass: KClass<*>,key: String? = null) {
        additionalData = additionalData.filter {
            it.contextClass != contextClass || it.valueType != typeOf<T>() || it.key != key
        }
    }

    inline fun <reified T : Any> getAdditionalData(contextClass: KClass<*>, key: String? = null): T? {
        @Suppress("UNCHECKED_CAST")
        return additionalData
            .firstOrNull {
                it.contextClass == contextClass &&
                        it.valueType == typeOf<T>() &&
                        it.key == key
            }?.value as? T?
    }
}
