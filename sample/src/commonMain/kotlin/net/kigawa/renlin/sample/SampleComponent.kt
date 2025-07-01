@file:Suppress("unused")

package net.kigawa.renlin.sample

import net.kigawa.renlin.tag.div
import net.kigawa.renlin.tag.p
import net.kigawa.renlin.tag.text
import net.kigawa.renlin.w3c.category.t
import net.kigawa.renlin.w3c.event.tag.onClick

class SampleComponent(
    val name: String,
    val sub: Sub,
) {
    var update: (Int) -> Unit = {}

    // public final val root: Component1<Div, EmptyDsl>
    // public val div: TagComponent1<Div, DivDsl> = TagComponent1<Div, DivDsl>
    val aaaa = div.component {
        p {
        }
    }

    val root = div.component {

        div("uuid 1") {
            text("uuid 1-1") {
                +"repeat "
            }
        }
        sub.display("uuid 2") {
        }

        fragment {
            div {
                fragment {
                    p {
                        onClick {
                            println("onClick!")
                        }
                        t("onClick")
                        text {
                            text = "onClick"
                        }
                    }
                }
                p {
//                    +"aaaa"
                }
            }
        }
//        fragment {
        sub.display("uuid 3") {
        }
//        }
        sub.controller("uuid 4") {
        }
        p {
//            key = "uuid 5"
        }
        sub.test {}
        sub.test1 {}
    }
}
