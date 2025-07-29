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

### プラットフォームターゲット
- **JavaScript**: DOM操作によるブラウザベースレンダリング
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

## 理解するための重要ファイル

- `renlin/src/commonMain/kotlin/net/kigawa/renlin/component/Component.kt` - コアコンポーネントインターフェース
- `renlin/src/commonMain/kotlin/net/kigawa/renlin/dsl/Dsl.kt` - DSL基盤
- `renlin/src/commonMain/kotlin/net/kigawa/renlin/css/CssManager.kt` - CSS管理システム
- `renlin/src/jsMain/kotlin/net/kigawa/renlin/Entrypoint.kt` - ブラウザエントリーポイント
- `sample/src/jsMain/kotlin/net/kigawa/renlin/sample/Main.kt` - 使用例

## ステート管理統合

ライブラリはステート管理にHakateが必要です。コンポーネントは`MutableState<T>`を通じてリアクティブステートにアクセスし、`useValue()`を介して再レンダリングをトリガーします。ステートの変更は自動的にコンポーネントツリー全体に伝播されます。