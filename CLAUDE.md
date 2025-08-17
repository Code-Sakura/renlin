# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## プロジェクト概要

RenlinはHTML UIを型安全なDSLアプローチで構築するためのKotlinマルチプラットフォームライブラリです。主にJavaScript/ブラウザターゲット向けのWeb開発用に設計されていますが、JVMもサポートしています。HakateステートマネジメントシステムとCSS-in-JS機能を統合しています。

## 主要アーキテクチャ

### モジュール構造
- **renlin/**: マルチプラットフォームソースセット（commonMain、jsMain、jvmMain）を持つメインライブラリモジュール
- **sample/**: ライブラリの使用パターンを示すサンプル実装
- **generate/**: HTML タグDSL作成用のコード生成ツール
- **convention-plugins/**: 一貫したビルド設定のためのGradle規約プラグイン

### 主要概念
- **コンポーネントシステム**: レンダー関数を持つ`Component<TAG>`インターフェースを使用した型安全なコンポーネント
- **DSLアーキテクチャ**: `@Html`マーカーアノテーションと型安全なコンテンツカテゴリを使用したHTML DSL構築
- **ステート管理**: `StateDispatcher`を介したリアクティブステートハンドリングのためのHakateライブラリとの統合
- **CSS管理**: 自動クラス生成と疑似クラスサポートを持つプラットフォーム固有のCSSマネージャー
- **コンテンツカテゴリ**: W3C準拠のコンテンツモデル強制（FlowContent、PhrasingContentなど）
- **属性システム**: `DslStateData`を通じた型安全な HTML 属性管理（href、onClick など）

### プラットフォームターゲット
- **JavaScript**: DOM操作によるブラウザベースレンダリング（`DomTagElement` 経由）
- **JVM**: サーバーサイドHTML生成機能

## 開発コマンド

### ビルド
```bash
./gradlew build                    # 全モジュールをビルド
./gradlew :renlin:build           # メインライブラリのみをビルド
./gradlew :sample:build           # サンプルアプリケーションをビルド
```

### テスト
```bash
./gradlew test                    # 全テストを実行
./gradlew :renlin:test           # メインライブラリをテスト
./gradlew :renlin:jsTest         # JS固有のテストを実行
./gradlew :renlin:jvmTest        # JVM固有のテストを実行
```

### サンプル開発
```bash
./gradlew :sample:jsBrowserRun   # ブラウザでサンプルを実行（開発用）
./gradlew :sample:jsBrowserDevelopmentExecutableDistribution  # サンプル配布版をビルド
```

### コード生成
```bash
./gradlew :generate:run          # HTML タグDSLコードを生成
```

### パブリッシング
```bash
./gradlew publishToMavenLocal    # ローカルMavenリポジトリに公開
./gradlew publish               # 設定されたリポジトリに公開
```

## 主要実装パターン

### コンポーネント作成
コンポーネントは`Component<TAG>`を継承し、`.component {}`DSLビルダーパターンを使用します。ステート統合は`StateDispatcher`を通じて行われ、`useValue()`によるリアクティブレンダリングが可能です。

### エントリーポイントパターン
JSアプリケーションは`Entrypoint(domElement).render(component, dispatcher)`を使用してコンポーネントをDOM要素にマウントします。

### CSS統合
自動クラス生成のために`cssManager`プロパティを使用してスタイリングを行います。CSSプロパティは型安全で疑似クラスをサポートしています。

### コンテンツ型安全性
DSLはW3Cコンテンツカテゴリをコンパイル時に強制します - FlowContentはPhrasingContentを含むことができますが、その逆はできません。

### 属性とイベント管理
- **DslStateData パターン**: 属性（href など）とイベントハンドラー（onClick など）は`DslStateData`を通じて管理されます
- **型安全な属性**: `Href`クラスなどのvalue objectsを使用して属性値を型安全に扱います
- **自動DOM同期**: `TagNodeCommon.setDslStateData`が属性とイベントの DOM への同期を自動的に行います

## アーキテクチャの理解

### レイヤー構造
1. **Component レイヤー**: `Component<TAG>` - 最上位のコンポーネント抽象化
2. **DSL レイヤー**: `DslBase` - HTML構造構築とライフサイクル管理
3. **State レイヤー**: `DslState` / `DslStateData` - 状態管理と属性/イベント管理
4. **Platform レイヤー**: `TagNode` implementations - プラットフォーム固有のレンダリング

### W3C カテゴリシステム
- `w3c/category/native/` - W3C HTML仕様に基づくコンテンツカテゴリ型定義
- `w3c/category/dsl/` - 各カテゴリ用のDSLインターフェース
- `w3c/category/integration/` - カテゴリ間の統合型定義
- コンパイル時にHTMLコンテンツモデルの制約を強制

## 理解するための重要ファイル

- `renlin/src/commonMain/kotlin/net/kigawa/renlin/component/Component.kt` - コアコンポーネントインターフェース
- `renlin/src/commonMain/kotlin/net/kigawa/renlin/dsl/DslBase.kt` - DSL基底クラスと核心機能
- `renlin/src/commonMain/kotlin/net/kigawa/renlin/state/DslStateData.kt` - 状態データと属性管理
- `renlin/src/commonMain/kotlin/net/kigawa/renlin/w3c/element/TagNodeCommon.kt` - プラットフォーム間共通のDOM抽象化
- `renlin/src/jsMain/kotlin/net/kigawa/renlin/w3c/element/DomTagElement.kt` - ブラウザ用DOM実装
- `renlin/src/jsMain/kotlin/net/kigawa/renlin/Entrypoint.kt` - ブラウザエントリーポイント
- `sample/src/jsMain/kotlin/net/kigawa/renlin/sample/Main.kt` - 使用例

## ステート管理統合

ライブラリはステート管理にHakateが必要です。コンポーネントは`MutableState<T>`を通じてリアクティブステートにアクセスし、`useValue()`を介して再レンダリングをトリガーします。ステートの変更は自動的にコンポーネントツリー全体に伝播されます。

## 拡張とカスタマイズ

### 新しい属性の追加
1. `DslStateData`にプロパティを追加
2. `TagNodeCommon.setDslStateData`で属性をDOMに適用するロジックを追加
3. 対象DSLクラス用の拡張プロパティを`w3c/attribute/`に作成

### 新しいHTMLタグの追加
1. `generate/`モジュールのコード生成を使用するか、手動でタグクラスを作成
2. 適切なW3Cコンテンツカテゴリに従ってDSLクラスを実装
3. プラットフォーム固有の実装が必要な場合は、各プラットフォームモジュールで対応