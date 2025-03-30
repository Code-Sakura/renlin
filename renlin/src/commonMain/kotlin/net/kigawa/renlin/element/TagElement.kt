package net.kigawa.renlin.element

import net.kigawa.renlin.tag.Tag

interface TagElement {
    fun newChild(tag: Tag<*>): TagElement
    fun reflect()
}