package net.kigawa.renlin.w3c.element

import net.kigawa.renlin.state.DslStateData
import net.kigawa.renlin.tag.Tag
import net.kigawa.renlin.w3c.event.RegisteredEvent
import net.kigawa.renlin.w3c.event.WebEvent
import net.kigawa.renlin.w3c.event.name.EventName
import net.kigawa.renlin.w3c.event.name.EventNames

interface TagNodeCommon {
    val isEmpty: Boolean
    fun setTextContent(text: String?)
    fun newNode(tag: Tag<*>): TagNode
    fun remove()
    fun setNodes(index: Int, nodes: List<TagNode>)
    fun <T : WebEvent> addEventListener(eventName: EventName<T>, listener: (T) -> Unit): RegisteredEvent
    fun removeEventListener(registeredEvent: RegisteredEvent)
    fun setDslStateData(prevData: DslStateData?, dslStateData: DslStateData?) {
        prevData?.getAdditionalData<List<RegisteredEvent>>(this::class)
            ?.forEach { removeEventListener(it) }
        if (dslStateData == null) return
        listOfNotNull(
            dslStateData.onClick?.let { addEventListener(EventNames.click, it) }
        ).let { dslStateData.setAdditionalData(this::class, it) }
    }
}