package net.kigawa.renlin

import net.kigawa.renlin.tag.group.Html
import net.kigawa.renlin.tag.group.Tag

@Html
interface Component0<PARENT, TAG : Tag<PARENT>> {
    fun PARENT.call()
}

@Html
interface Component1<P, T> {
    fun call(t: T)
}