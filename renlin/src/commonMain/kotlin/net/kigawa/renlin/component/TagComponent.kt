package net.kigawa.renlin.component

import net.kigawa.renlin.tag.Tag

interface TagComponent<TAG : Tag<*>> : Component {
    val tag: TAG
}