package net.kigawa.renlin.dsl

import net.kigawa.renlin.tag.component.Component

data class RegisteredDslData(
    val dsl: Dsl<*>,
    val component: Component,
    val reload: () -> Unit,
    val key: String,
) {
}