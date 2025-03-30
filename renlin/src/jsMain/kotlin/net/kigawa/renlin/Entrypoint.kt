package net.kigawa.renlin

import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.dsl.EmptyDsl
import net.kigawa.renlin.dsl.state.DslState
import net.kigawa.renlin.tag.component.Component0
import org.w3c.dom.Element

class Entrypoint(
    val element: Element,
) {
    fun render(component: Component0<*, EmptyDsl>) {
        val dsl = DomDsl().apply {
            mountDslState(object : DslState {
                override fun subDslState(key: String?): DslState {
                    TODO("Not yet implemented")
                }

                override fun setDsls(dsls: List<Dsl>) {
                    TODO("Not yet implemented")
                }
            })
        }
        component.render(dsl) {}
    }
}