package net.kigawa.renlin

import net.kigawa.renlin.tag.group.Html

@Html
interface Component0<P> {
    fun call()
}

@Html
interface Component1<P, T> {
    fun call(t: T)
}