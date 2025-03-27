package net.kigawa.renlin.dsl

import net.kigawa.renlin.Html
import net.kigawa.renlin.element.TagElement

@Html
interface Dsl {
    val element: TagElement
    var key: String?
}