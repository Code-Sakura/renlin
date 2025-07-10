package net.kigawa.renlin.component

import net.kigawa.renlin.dsl.StatedDsl
import net.kigawa.renlin.tag.Tag
import net.kigawa.renlin.w3c.category.ContentCategory

interface Component0<out TAG: Tag<in CONTENT_CATEGORY>, CONTENT_CATEGORY: ContentCategory>: Component<TAG> {
  fun render(parentDsl: StatedDsl<out CONTENT_CATEGORY>, key: String?)

}