package net.kigawa.renlin.sample

import net.kigawa.hakate.api.HakateInitializer
import net.kigawa.hakate.api.state.MutableState
import net.kigawa.renlin.category.FlowContent
import net.kigawa.renlin.category.FlowPhrasingIntersection
import net.kigawa.renlin.category.PhrasingContent
import net.kigawa.renlin.category.t
import net.kigawa.renlin.css.*
import net.kigawa.renlin.tag.div
import net.kigawa.renlin.tag.fragment
import net.kigawa.renlin.tag.p
import net.kigawa.renlin.tag.text


class Sub {
    val state: MutableState<String> = HakateInitializer().newStateDispatcher().newState("state 0")

    val display = div.component {
        t("display")
        key = "uuid aaaaaaaaa"
        div {
            val value = state.useValue()
            key = "key display1 div"
            t("display1", key = "key display1")
            div {
                t("display1-1", key = "key display1-1")
                key = "key display1-1 div"
                p {
                    t("display1-1-1 $value", key = "key display1-1-1")
                    key = "key display1-1-1 p"
                    text {
                        margin = "asd"
                    }
                    css { 
                        color = if (value.last().digitToInt() % 2 == 0) Color.RED else Color.BLUE
                        backgroundColor = if (value.last().digitToInt() % 2 == 0) Color.BLUE else Color.RED
                    }
                }
            }
        }
        div {
            t("display2")
            key = "uuid aawaaaaaaaad"
            div {
                t("display2-1")
                key = "uuid aadaaaaaaa"
            }
        }
        div {
            t("display3")
            key = "uuid aawaaaaaaaa"
            css{
                color = Color.YELLOW
                backgroundColor = Color.BLUE
                fontSize = 24.px
                height = 100.px
                padding = 1.percent
            }
        }
    }
    val controller = div.component {
        t("controller")
        key = "uuid aaadaadadsaaaa"
    }
    val test = fragment<FlowContent>().component { }
    val test1 = fragment<PhrasingContent>().component { }
    val test2 = fragment<FlowPhrasingIntersection>().component { }
}