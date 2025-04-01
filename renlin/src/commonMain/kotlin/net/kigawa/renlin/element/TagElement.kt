package net.kigawa.renlin.element

interface TagElement {
    fun newElement(): TagElement
    fun remove()

    fun setElements(index: Int, elements: List<TagElement>)
}