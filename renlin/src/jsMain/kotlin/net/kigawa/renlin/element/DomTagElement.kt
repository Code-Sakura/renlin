package net.kigawa.renlin.element

import kotlinx.browser.document
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update
import net.kigawa.renlin.tag.Tag
import org.w3c.dom.Element
import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid

open class DomTagElement : TagElement {
    private val childDomElements = MutableStateFlow(mapOf<String, Element>())
    private var element = MutableStateFlow<Element?>(null)

    override fun newChild(tag: Tag<*>): DomTagElement {
        return ChildDomTagElement(this, tag)
    }

    override fun reflect() {
    }

    @OptIn(ExperimentalUuidApi::class)
    fun mountChild(child: ChildDomTagElement) {
        val key = child.key ?: Uuid.random().toString().also { child.key = it }
        var childElement: Element?
        childDomElements.update {
            childElement = it[key]
            var elements = it
            if (childElement == null) {
                childElement = document.createElement(child.tag.name)
                elements = it.plus(key to childElement)
            }
            elements
        }

    }
}