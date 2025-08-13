package net.kigawa.renlin.component

import net.kigawa.renlin.tag.Tag

interface TagComponent<TAG : Tag<*>> : Component<TAG> {
    val tag: TAG
}