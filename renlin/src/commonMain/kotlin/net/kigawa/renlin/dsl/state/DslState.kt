package net.kigawa.renlin.dsl.state

import net.kigawa.renlin.dsl.TagDsl
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.component.Component

interface DslState {
    val ownElement: TagNode?
    fun subDslState(key: String, second: Component): DslState
    fun setSubDsls(dsls: List<Pair<TagDsl<*>, Component>>)
    fun applyDsl(dsl: TagDsl<*>)
}