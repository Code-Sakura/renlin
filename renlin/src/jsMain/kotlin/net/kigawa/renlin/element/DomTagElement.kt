package net.kigawa.renlin.element

import kotlinx.browser.document
import net.kigawa.renlin.tag.Tag
import net.kigawa.renlin.tag.TextNodeTag
import org.w3c.dom.Node
import org.w3c.dom.Text

class DomTagElement(
    override val node: Node,
    private val parent: DomTagElement?,
) : TagNode {
    override val isEmpty: Boolean
        get() = if (node is Text) node.textContent == null else false

    override fun setTextContent(text: String?) {
        node.textContent = text
    }

    override fun newNode(tag: Tag<*>): TagNode {
        return DomTagElement(
            if (tag is TextNodeTag) Text() else document.createElement(tag.name),
            this
        )
    }

    override fun remove() {
        parent?.node?.removeChild(node)
    }

    override fun setNodes(
        index: Int, nodes: List<TagNode>,
    ) {
//        debug("setElements", index, elements)
        var last: Node? = node.firstChild
        repeat(index) {
            last = last?.nextSibling
        }
        nodes.forEach {
//            debug(last?.tagName)
            node.insertBefore(it.node, last?.nextSibling)
            last = it.node
        }
    }
}