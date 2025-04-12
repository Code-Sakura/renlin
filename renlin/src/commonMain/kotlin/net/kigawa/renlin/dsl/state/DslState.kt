package net.kigawa.renlin.dsl.state

import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.dsl.RegisteredDslData
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.component.SubComponent

interface DslState {
    val ownElement: TagNode?
    val latestRegisteredDslData: RegisteredDslData?
    fun subDslState(key: String, second: SubComponent<*, *>): DslState
    fun setSubDsls(dsls: List<RegisteredDslData>)
    fun applyDsl(dsl: Dsl<*>, registeredDslData: RegisteredDslData)
}