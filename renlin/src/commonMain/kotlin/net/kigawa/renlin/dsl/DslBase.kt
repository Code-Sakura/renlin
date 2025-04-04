package net.kigawa.renlin.dsl

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update
import net.kigawa.renlin.category.ContentCategory
import net.kigawa.renlin.dsl.state.DslState
import net.kigawa.renlin.tag.component.Component
import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid

abstract class DslBase<CONTENT_CATEGORY: ContentCategory> : TagDsl<CONTENT_CATEGORY> {
    override var dslState: DslState? = null
    override var key: String? = null
    private val subDsls = MutableStateFlow(listOf<Pair<TagDsl<*>, Component>>())

    @OptIn(ExperimentalUuidApi::class)
    override fun subDsl(subDsl: TagDsl<*>, component: Component) {
        if (subDsl.key == null) subDsl.key = Uuid.random().toString()
//        debug("prev update")
        subDsls.update { list ->
            val newList = list.firstOrNull { it.first.key == subDsl.key }?.let { list - it } ?: list
            newList + subDsl.to(component)
        }
//        debug("updated")
        dslState?.let { subDsl.mountDslState(it.subDslState(subDsl.key!!, component)) }
//        debug("fin subDsl")
    }

    override fun mountDslState(state: DslState) {
//        debug("mountDslState", subDsls.value, dslState)
        dslState = state
//        debug("mountDslState subDsls")
        subDsls.value.also { it.forEach { it.first.mountDslState(state.subDslState(it.first.key!!, it.second)) } }
//        debug("mountDslState setSubDsls")
//        debug("mountDslState AA", subDsls.value, dslState)
        state.setSubDsls(subDsls.value)
//        debug("mountDslState apply")
        state.applyDsl(this)
//        debug("mountDslState finished")
    }
}