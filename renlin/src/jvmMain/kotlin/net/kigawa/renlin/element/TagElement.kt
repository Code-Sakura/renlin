package net.kigawa.renlin.element

import net.kigawa.renlin.tag.Tag

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual interface TagElement {
    actual fun newElement(tag: Tag<*>): TagElement
    actual fun remove()

    actual fun setElements(index: Int, elements: List<TagElement>)
}