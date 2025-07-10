package net.kigawa.renlin.sample

import net.kigawa.hakate.api.HakateInitializer
import net.kigawa.hakate.api.state.MutableState
import net.kigawa.renlin.component.component
import net.kigawa.renlin.css.*
import net.kigawa.renlin.tag.div
import net.kigawa.renlin.tag.fragment
import net.kigawa.renlin.tag.p
import net.kigawa.renlin.tag.text
import net.kigawa.renlin.w3c.category.integration.FlowPalpablePhrasingIntegration
import net.kigawa.renlin.w3c.category.integration.FlowPhrasingIntegration
import net.kigawa.renlin.w3c.category.native.FlowContent
import net.kigawa.renlin.w3c.category.native.PhrasingContent
import net.kigawa.renlin.w3c.category.t


class Sub {
  val state: MutableState<String> = HakateInitializer().newStateDispatcher().newState("state 0")

  val display = div.component {
    div("key display1 div") {
      val value = state.useValue()
      t("display1", key = "key display1")
      div("key display1-1 div") {
        t("display1-1", key = "key display1-1")

        p("key display1-1-1 p") {
          t("display1-1-1 $value", key = "key display1-1-1")

          text {
            margin = "asd"
          }
          css {
            color = if (value.last().digitToInt() % 2 == 0) Color.RED else Color.BLUE
            backgroundColor = if (value.last().digitToInt() % 2 == 0) Color.BLUE else Color.RED
            hover {
              cursor = Cursor.GRABBING
            }
          }
        }
      }
    }
    div("uuid aawaaaaaaaad") {
      t("display2")

      div("uuid aadaaaaaaa") {
        t("display2-1")

        css {
          userSelect = UserSelect.NONE
          hover {
            cursor = Cursor.POINTER
            backgroundColor = Color.rgba(0, 255, 255, 0.3)
          }
          active {
            color = Color.RED
            fontWeight = FontWeight.BOLD
          }
        }
      }
    }
    div("uuid aawaaaaaaaa") {
      t("display3")
      css {
        color = Color.YELLOW
        backgroundColor = Color.BLUE
        fontSize = 24.px
        height = 100.px
        padding = 1.percent
      }

    }
  }
  val controller = div.component {
  }
  val test = component<FlowContent> { }
  val test1 = fragment<PhrasingContent>().component { }
  val test2 = fragment<FlowPalpablePhrasingIntegration>().component { }
}