package net.kigawa.renlin.element

import net.kigawa.renlin.tag.Tag
import org.w3c.dom.Element

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual interface TagElement {
    val element: Element
    actual fun newElement(tag: Tag<*>): TagElement
    actual fun remove()
    actual fun setElements(index: Int, elements: List<TagElement>)
}