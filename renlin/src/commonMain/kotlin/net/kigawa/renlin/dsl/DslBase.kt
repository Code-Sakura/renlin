package net.kigawa.renlin.dsl

import net.kigawa.hakate.api.state.State
import net.kigawa.renlin.category.ContentCategory
import net.kigawa.renlin.css.CssCapable
import net.kigawa.renlin.css.CssValue
import net.kigawa.renlin.dsl.state.DslState
import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid

abstract class DslBase<CONTENT_CATEGORY : ContentCategory> : Dsl<CONTENT_CATEGORY>, CssCapable {
    override var dslState: DslState? = null
    override var key: String? = null
    override var cssClassName: String? = null
    override var pendingCssProperties: Map<String, CssValue>? = null
    private val subDsls = mutableListOf<RegisteredDslData>()
    override val states = mutableSetOf<State<*>>()

    override fun subDsl(registeredDslData: RegisteredDslData) {
        @OptIn(ExperimentalUuidApi::class)
        if (registeredDslData.dsl.key == null) registeredDslData.dsl.key = Uuid.random().toString()

        val i = subDsls.indexOfFirst { it.dsl.key == registeredDslData.dsl.key }
        if (i == -1) subDsls.add(registeredDslData)
        else subDsls[i] = registeredDslData

        dslState?.let {
            registeredDslData.dsl.mountDslState(
                it.subDslState(registeredDslData.dsl.key!!, registeredDslData.component), registeredDslData
            )
        }
    }

    override fun mountDslState(state: DslState, registeredDslData: RegisteredDslData) {
        dslState = state

        // dslStateが設定されたタイミングでpendingCssPropertiesを処理
        processPendingCss()

        subDsls.forEach {
            it.dsl.mountDslState(
                state.subDslState(it.dsl.key!!, it.component), it
            )
        }
        state.setSubDsls(subDsls)
        state.applyDsl(this, registeredDslData)
    }

    override fun <T> State<T>.useValue(): T {
        states.add(this)
        return this.currentValue()
    }

    /**
     * 保留中のCSS情報を処理
     */
    private fun processPendingCss() {
        pendingCssProperties?.let { properties ->
            val cssManager = dslState?.getCssManager()
            if (cssManager != null) {
                cssClassName = cssManager.getOrCreateClass(properties)
                // 処理完了後はクリア
                pendingCssProperties = null
            }
        }
    }
}