package net.kigawa.renlin.dsl

import net.kigawa.hakate.api.state.State
import net.kigawa.renlin.css.CssCapable
import net.kigawa.renlin.css.CssRuleSet
import net.kigawa.renlin.css.CssValue
import net.kigawa.renlin.state.DslState
import net.kigawa.renlin.state.DslStateData
import net.kigawa.renlin.w3c.category.ContentCategory

   /**
    * `DslBase` は、HTML構造を構築するためのDSLの基底クラスです。
    * このクラスは[StatedDsl]と[CssCapable]の実装を提供し、
    * HTML要素の構築、状態管理、CSS処理、コンポーネント管理、およびサブDSLの管理を行います。
    *
    * 主な機能:
    * - HTML要素の構築と管理
    * - 状態管理と更新
    * - サブDSLの階層管理とマウント
    * - コンポーネントの状態管理と描画
    * - CSSの適用と管理
    * - 状態の自動追跡とバインディング
    *
    * @param CONTENT_CATEGORY このDSLが生成できるHTMLコンテンツのカテゴリ
    * @param dslState このDSLに関連付けられた状態
    *
    * @see StatedDsl
    * @see CssCapable
    * @see DslState
    *
    */
abstract class DslBase<CONTENT_CATEGORY : ContentCategory>(
    override val dslState: DslState,
) : StatedDsl<CONTENT_CATEGORY>, CssCapable {
       /**
        * このDSLに適用されるCSSクラス名
        */
    override var cssClassName: String? = null
       /**
        * 保留中のCSSプロパティ
        */
    override var pendingCssProperties: Map<String, CssValue>? = null
       /**
        * 保留中のCSSルールセット
        */
    override var pendingCssRuleSet: CssRuleSet? = null
       /**
        * サブDSLの登録情報を保持するリスト
        */
    private val subDsls = mutableListOf<RegisteredDslData>()
       /**
        * DSLの状態を保持するセット
        */
    override val states = mutableSetOf<State<*>>()
       /**
        * このDSLの状態データ。
        */
    override val dslStateData: DslStateData? = dslState.dslStateData()

       /**
        * サブDSLを現在のDSLに登録
        *
        *    1. 既存のサブDSLをキーで検索
        *    2. 存在しない場合は追加、存在する場合は更新
        *    3. サブDSLに現在の状態を適用
        *
        * @param registeredDslData 登録するDSLのデータ
        * @see RegisteredDslData
        */
    override fun registerSubDsl(registeredDslData: RegisteredDslData) {

        val i = subDsls.indexOfFirst { it.key == registeredDslData.key }
        if (i == -1) subDsls.add(registeredDslData)
        else subDsls[i] = registeredDslData

        dslState.let {
            registeredDslData.dsl.applyToDslState(
                it.getOrCreateSubDslState(registeredDslData.key, registeredDslData.component), registeredDslData
            )
        }
    }
       /**
        * 指定された状態をDSLにマウントします
        *
        * これにより、DSLの状態が更新され、関連するサブDSLも更新されます。
        *
        *    1. 保留中のCSS情報の処理
        *    2. すべてのサブDSLへの状態適用
        *    3. 状態へのサブDSL情報の設定
        *    4. 状態へのDSL情報の適用
        *
        * @param state マウントする状態
        * @param registeredDslData 関連するDSLデータ
        */
    override fun applyToDslState(state: DslState, registeredDslData: RegisteredDslData) {

        // dslStateが設定されたタイミングでpendingCssPropertiesを処理
        processPendingCss()

        subDsls.forEach {
            it.dsl.applyToDslState(
                state.getOrCreateSubDslState(it.key, it.component), it
            )
        }
        state.setSubDsls(subDsls)
        state.applyDsl(this, registeredDslData)
    }
       /**
        * 状態の現在の値を取得し、この状態をDSLの状態セットに追加します
        *
        * このメソッドは状態の値を取得すると同時に、その状態をDSLの追跡対象として登録します。
        * これにより、状態の変更時にDSLの再描画が自動的にトリガーされます。
        *
        * @param T 状態の値の型
        * @return 状態の現在の値
        * @see State.currentValue
        */
    override fun <T> State<T>.useValue(): T {
        states.add(this)
        return this.currentValue()
    }
       /**
        * 保留中のCSS情報を処理
        *
        * このメソッドは新しい`CssRuleSet`形式のCSSを優先的に処理し、
        * 後方互換性のため古い`Properties`形式もサポートします。
        *
        * @see CssRuleSet
        * @see pendingCssRuleSet
        * @see pendingCssProperties
        */
    private fun processPendingCss() {
        // 新しいCssRuleSet形式を優先的に処理
        pendingCssRuleSet?.let { ruleSet ->
            val cssManager = dslState.cssManager
            if (cssManager != null) {
                cssClassName = cssManager.getOrCreateClass(ruleSet)
                // 処理完了後はクリア
                pendingCssRuleSet = null
                return
            }
        }

        // 後方互換性のため、古いproperties形式も処理
        pendingCssProperties?.let { properties ->
            val cssManager = dslState.cssManager
            if (cssManager != null) {
                val ruleSet = CssRuleSet(properties, emptyList())
                cssClassName = cssManager.getOrCreateClass(ruleSet)
                // 処理完了後はクリア
                pendingCssProperties = null
            }
        }
    }
}