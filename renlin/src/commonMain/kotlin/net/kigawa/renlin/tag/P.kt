package net.kigawa.renlin.tag

import net.kigawa.renlin.tag.group.FlowContent
import net.kigawa.renlin.tag.group.FlowContentable
import net.kigawa.renlin.tag.group.Html
import net.kigawa.renlin.tag.group.PalpableContent
import net.kigawa.renlin.tag.group.PhrasingContentable

@Html
object P : AbstractTag(), FlowContent, PalpableContent, PhrasingContentable {
    fun component(func: P.() -> Unit): FlowContentable.() -> Unit {
        return { func(this@P) }
    }
}