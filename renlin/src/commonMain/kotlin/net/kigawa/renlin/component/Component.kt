package net.kigawa.renlin.component

import net.kigawa.renlin.Html
import net.kigawa.renlin.tag.Tag

@Html
interface Component<out TAG: Tag<*>> {
}