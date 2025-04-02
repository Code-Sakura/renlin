package net.kigawa.renlin.element

import net.kigawa.renlin.tag.Tag

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
expect interface TagNode {
    val isEmpty: Boolean
    fun setTextContent(text: String?)
    fun newNode(tag: Tag<*>): TagNode
    fun remove()
    fun setNodes(index: Int, nodes: List<TagNode>)
}