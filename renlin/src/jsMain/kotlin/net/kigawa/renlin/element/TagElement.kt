package net.kigawa.renlin.element

import kotlinx.browser.document
import net.kigawa.renlin.tag.Tag
import org.w3c.dom.Element

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual class TagElement(
    private val htmlElement: Element,
) {
    actual fun appendChild(tag: Tag<*>): TagElement {
        val child = document.createElement(tag.name)
        htmlElement.appendChild(child)
        return TagElement(child)
    }
}