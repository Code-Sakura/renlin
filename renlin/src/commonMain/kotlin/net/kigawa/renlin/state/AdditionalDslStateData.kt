package net.kigawa.renlin.state

import kotlin.reflect.KClass
import kotlin.reflect.KType

data class AdditionalDslStateData<T : Any>(
    val contextClass: KClass<*>,
    val valueType: KType,
    val key: String?,
    val value: T,
)
