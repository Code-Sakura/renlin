package net.kigawa.renlin.w3c.event.tag

import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.dsl.EmptyDsl
import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.tag.Tag
import net.kigawa.renlin.tag.component.Component1
import net.kigawa.renlin.w3c.dsl.EventTargetDsl

val EventTargetDsl<*>.click: Component1<*,*>
    get() = object: Component1<Tag<*>, Dsl> {
        override fun newDsl(dslState: DslState): Dsl {
            return EmptyDsl()
        }

        override fun render(
            parentDsl: StatedDsl<*>,
            block: Dsl.() -> Unit,
            key: String?
        ) {
            TODO("Not yet implemented")
        }
    }