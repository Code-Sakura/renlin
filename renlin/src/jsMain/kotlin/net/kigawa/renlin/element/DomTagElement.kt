package net.kigawa.renlin.element

import kotlinx.browser.document
import net.kigawa.renlin.tag.Tag
import net.kigawa.renlin.util.afterElement
import org.w3c.dom.Element

class DomTagElement(
    override val element: Element,
) : TagElement {
    override fun newElement(tag: Tag<*>): TagElement {
        return DomTagElement(document.createElement(tag.name))
    }

    override fun remove() {
        element.remove()
    }

    override fun setElements(
        index: Int, elements: List<TagElement>,
    ) {
//        debug("setElements", index, elements)
        var last: Element? = null
        repeat(index) {
            last = last?.nextElementSibling ?: element.firstElementChild
        }
        elements.forEach {
//            debug(last?.tagName)
            last?.afterElement(it.element) ?: element.appendChild(it.element)
            last = it.element
        }
    }
}