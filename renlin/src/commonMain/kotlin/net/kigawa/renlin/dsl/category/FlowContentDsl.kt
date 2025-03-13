package net.kigawa.renlin.dsl.category

import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.tag.P
import net.kigawa.renlin.tag.PDsl
import net.kigawa.renlin.tag.item.Item

interface FlowContentDsl : Dsl {
    operator fun Item<P>.invoke(block: PDsl.() -> Unit) {}
}