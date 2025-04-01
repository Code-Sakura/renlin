package net.kigawa.renlin.element

import net.kigawa.renlin.tag.Tag

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
expect interface TagElement {
    fun newElement(tag: Tag<*>): TagElement
    fun remove()

    fun setElements(index: Int, elements: List<TagElement>)
}