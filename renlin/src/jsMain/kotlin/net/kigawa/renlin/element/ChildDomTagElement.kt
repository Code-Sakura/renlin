package net.kigawa.renlin.element

import net.kigawa.renlin.tag.Tag

class ChildDomTagElement(
    private val parent: DomTagElement,
    val tag: Tag<*>,
) : DomTagElement() {
    var key: String? = null
    override fun reflect() {
        super.reflect()
        parent.mountChild(this)
    }

}