package net.kigawa.renlin.dsl

import net.kigawa.renlin.tag.component.SubComponent

data class RegisteredDslData(
    val dsl: Dsl<*>,
    val component: SubComponent<*, *>,
    val reload: () -> Unit,
) {
}