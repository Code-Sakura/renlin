package net.kigawa.renlin.dsl

import net.kigawa.hakate.api.state.State
import net.kigawa.renlin.category.ContentCategory
import net.kigawa.renlin.css.CssCapable
import net.kigawa.renlin.css.CssRuleSet
import net.kigawa.renlin.css.CssValue
import net.kigawa.renlin.dsl.state.DslState
import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid

abstract class DslBase<CONTENT_CATEGORY : ContentCategory> : Dsl<CONTENT_CATEGORY>, CssCapable {
    override var dslState: DslState? = null
    override var key: String? = null
    override var cssClassName: String? = null
    override var pendingCssProperties: Map<String, CssValue>? = null
    override var pendingCssRuleSet: CssRuleSet? = null
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
        // 新しいCssRuleSet形式を優先的に処理
        pendingCssRuleSet?.let { ruleSet ->
            val cssManager = dslState?.getCssManager()
            if (cssManager != null) {
                cssClassName = cssManager.getOrCreateClass(ruleSet)
                // 処理完了後はクリア
                pendingCssRuleSet = null
                return
            }
        }

        // 後方互換性のため、古いproperties形式も処理
        pendingCssProperties?.let { properties ->
            val cssManager = dslState?.getCssManager()
            if (cssManager != null) {
                val ruleSet = CssRuleSet(properties, emptyList())
                cssClassName = cssManager.getOrCreateClass(ruleSet)
                // 処理完了後はクリア
                pendingCssProperties = null
            }
        }
    }
}