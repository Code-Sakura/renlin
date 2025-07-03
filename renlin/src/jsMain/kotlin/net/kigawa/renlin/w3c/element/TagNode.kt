package net.kigawa.renlin.w3c.element

import net.kigawa.renlin.w3c.element.TagNodeCommon
import org.w3c.dom.Node

@Suppress("EXPECT_ACTUAL_CLASSIFIERS_ARE_IN_BETA_WARNING")
actual interface TagNode : TagNodeCommon {
    val node: Node
}