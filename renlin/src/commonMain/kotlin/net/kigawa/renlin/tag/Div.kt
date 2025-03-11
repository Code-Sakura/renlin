package net.kigawa.renlin.tag

import net.kigawa.renlin.Component0
import net.kigawa.renlin.Component1
import net.kigawa.renlin.tag.group.FlowContent
import net.kigawa.renlin.tag.group.FlowContentable
import net.kigawa.renlin.tag.group.Html
import net.kigawa.renlin.tag.group.PalpableContent

@Html
object Div : AbstractTag(), FlowContent, PalpableContent, FlowContentable {
    fun component(func: Div.() -> Unit): Component0<Div> {
        return object : Component0<Div> {
            override fun call() {
                this@Div.func()
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