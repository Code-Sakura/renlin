package net.kigawa.renlin.tag

import net.kigawa.renlin.category.DslContentCategory
import net.kigawa.renlin.category.FlowContentDsl
import net.kigawa.renlin.category.FlowContentItem
import net.kigawa.renlin.category.PhrasingContentDsl
import net.kigawa.renlin.dsl.Dsl
import net.kigawa.renlin.dsl.DslBase
import net.kigawa.renlin.element.TagNode
import net.kigawa.renlin.tag.component.Component0

class FragmentDsl : DslBase(), Dsl, FlowContentDsl, PhrasingContentDsl {
    override fun applyElement(element: TagNode) {
    }

    override var textContent: String? = null
        set(value) {
            text.render(this) {
                text = value
            }
            field = value
        }
}


abstract class FragmentComponent<T : DslContentCategory>(
) : Component0<Fragment<T>, T> {
    override val tag: Fragment<T>
        get() = object : Fragment<T> {
            override fun newDsl(): T {
                return this@FragmentComponent.newDsl()
            }
        }

    override fun render(
        parentDsl: Dsl, block: T.() -> Unit,
    ) {
        val dsl = newDsl()
        dsl.block()
        parentDsl.subDsl(dsl, this)
    }
}

interface Fragment<T : Dsl> : FlowContentItem<T>, Tag<T> {
    override val name: String
        get() = "fragment"
}
