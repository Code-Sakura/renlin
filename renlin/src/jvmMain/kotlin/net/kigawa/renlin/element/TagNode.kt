package net.kigawa.renlin.element

import net.kigawa.renlin.tag.Tag

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual interface TagNode {
    actual val isEmpty: Boolean
    actual fun setTextContent(text: String?)
    actual fun newNode(tag: Tag<*>): TagNode
    actual fun remove()
    actual fun setNodes(index: Int, nodes: List<TagNode>)
    actual fun setClassName(className: String)
}