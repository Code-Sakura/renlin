package net.kigawa.renlin.category

import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.dsl.TagDsl
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.Tag
import net.kigawa.renlin.tag.component.Component1
import net.kigawa.renlin.tag.component.StructuredComponent
import net.kigawa.renlin.tag.text

interface PhrasingContentDsl<CONTENT_CATEGORY : PhrasingContent> : TagDsl<CONTENT_CATEGORY> {
    var textContent: String?
    operator fun String.unaryPlus() {
        textContent = this
    }

    override val fragment: Component1<Tag<CONTENT_CATEGORY>, PhrasingContentDsl<CONTENT_CATEGORY>>
        get() = object : StructuredComponent<Tag<CONTENT_CATEGORY>, PhrasingContentDsl<CONTENT_CATEGORY>> {
            override val tag: Tag<CONTENT_CATEGORY>
                get() = object : Tag<CONTENT_CATEGORY> {
                    override val name: String
                        get() = "fragment"
                }

            override fun newDsl(): PhrasingContentDsl<CONTENT_CATEGORY> {
                return object : DslBase<CONTENT_CATEGORY>(), PhrasingContentDsl<CONTENT_CATEGORY> {
                    override fun applyElement(element: TagNode) {
                    }

                    override var textContent: String? = null
                        set(value) {
                            text.render(this) {
                                text = value
                            }
                            field = value
                        }
                }
            }
        }
}

interface PhrasingContent : ContentCategory