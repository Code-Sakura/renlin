package net.kigawa.renlin.tag.group

import net.kigawa.renlin.Component0
import net.kigawa.renlin.Component1

@Html
interface FlowContentable {

    operator fun <T : FlowContent> T.invoke(classes: String? = null, block: T.() -> Unit) {
    }

    operator fun Component0<out FlowContent>.invoke() {
    }

    operator fun <T> Component1<out FlowContent, T>.invoke(t: T) {
    }
    operator fun plus(txt: String) {}
    operator fun String.unaryPlus() {

    }
}

fun <T: FlowContent>T.onClick(block: T.() -> Unit) {}