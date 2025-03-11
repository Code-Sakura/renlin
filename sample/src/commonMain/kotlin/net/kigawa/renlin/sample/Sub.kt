package net.kigawa.renlin.sample

import net.kigawa.renlin.Tags.Companion.div
import net.kigawa.renlin.tag.group.onClick

class Sub {
    val display = div.component {
        div {
        }
    }
    val controller = div.component {
        onClick {
        }
    }
}