package net.kigawa.renlin.dsl.category

import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.tag.Div
import net.kigawa.renlin.tag.DivDsl
import net.kigawa.renlin.tag.P
import net.kigawa.renlin.tag.PDsl
import net.kigawa.renlin.tag.item.Item

interface FlowContentDsl : Dsl {
    operator fun Item<P>.invoke(block: PDsl.() -> Unit) {}
    operator fun Item<Div>.invoke(block: DivDsl.() -> Unit) {}
}