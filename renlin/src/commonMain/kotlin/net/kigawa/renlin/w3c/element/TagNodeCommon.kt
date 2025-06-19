package net.kigawa.renlin.w3c.element

import net.kigawa.renlin.tag.Tag
import net.kigawa.renlin.w3c.event.WebEvent
import net.kigawa.renlin.w3c.event.name.EventName

interface TagNodeCommon {
    val isEmpty: Boolean
    fun setTextContent(text: String?)
    fun newNode(tag: Tag<*>): TagNode
    fun remove()
    fun setNodes(index: Int, nodes: List<TagNode>)
    fun <T : WebEvent> addEventListener(eventName: EventName<T>, listener: (T) -> Unit)
}