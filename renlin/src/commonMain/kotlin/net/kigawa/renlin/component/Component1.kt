package net.kigawa.renlin.component

import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.Tag
import net.kigawa.renlin.w3c.category.ContentCategory

interface Component1<out TAG: Tag<in CONTENT_CATEGORY>, CONTENT_CATEGORY: ContentCategory, ARG1>: Component<TAG> {
  fun render(parentDsl: StatedDsl<out CONTENT_CATEGORY>, arg1: ARG1, key: String?)
}