package net.kigawa.renlin.w3c.element

import kotlinx.browser.document
import net.kigawa.renlin.state.DslStateData
import net.kigawa.renlin.tag.Tag
import net.kigawa.renlin.tag.TextTag
import net.kigawa.renlin.w3c.event.RegisteredEvent
import net.kigawa.renlin.w3c.event.WebEvent
import net.kigawa.renlin.w3c.event.name.EventName
import org.w3c.dom.Node
import org.w3c.dom.Text

class DomTagElement(
    override val node: Node,
    private val parent: DomTagElement?,
) : TagNode {
    override val isEmpty: Boolean
        get() = if (node is Text) node.textContent == null else false

    override fun setTextContent(text: String?) {
        if (node.textContent != text) node.textContent = text
    }

    override fun newNode(tag: Tag<*>): TagNode {
        return DomTagElement(
            if (tag is TextTag) Text() else document.createElement(tag.name),
            this
        )
    }

    override fun remove() {
        parent?.node?.removeChild(node)
    }

    override fun setNodes(
        index: Int, nodes: List<TagNode>,
    ) {
        var last: Node? = node.firstChild
        repeat(index) {
            last = last?.nextSibling
        }
        nodes.forEach {
            if (it.node != last) {
                node.insertBefore(it.node, last)
            }
            last = it.node.nextSibling
        }
    }

    override fun <T : WebEvent> addEventListener(
        eventName: EventName<T>, listener: (T) -> Unit,
    ): RegisteredEvent {
        return RegisteredEvent(eventName, {
            listener(eventName.asWebEvent(it))
        }).also { node.addEventListener(eventName.name, it.listener) }
    }

    override fun removeEventListener(registeredEvent: RegisteredEvent) {
        node.removeEventListener(registeredEvent.name.name, registeredEvent.listener)
    }

}