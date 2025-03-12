package net.kigawa.renlin.tag

import net.kigawa.renlin.Component0
import net.kigawa.renlin.Component1
import net.kigawa.renlin.tag.group.*


@Html
object Div : AbstractTag(), FlowContent, PalpableContent, FlowContentable, Tag<FlowContentable> {
    fun component(func: Div.() -> Unit): Component0<FlowContentable,Tag<FlowContentable>> {
        return object : Component0<FlowContentable,Tag<FlowContentable>> {
            override fun FlowContentable.call() {
                this@Div{ func() }
            }
        }
    }

    fun <T> component(func: Div.(T) -> Unit): Component1<Div, T> {
        return object : Component1<Div, T> {
            override fun call(t: T) {
                this@Div.func(t)
            }
        }
    }

}