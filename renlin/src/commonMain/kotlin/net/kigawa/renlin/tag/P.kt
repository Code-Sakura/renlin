package net.kigawa.renlin.tag

import net.kigawa.renlin.Html
import net.kigawa.renlin.tag.group.*

/**
 * P クラスは、HTML デザインにおいて段落を定義するための要素を提供します。
 *
 * このクラスは FlowContent、PalpableContent、PhrasingContentable の各インターフェースを実装しており、
 * 様々なコンテキストで使用できる機能を持っています。
 *
 * 主に以下の特性を持ちます:
 * - FlowContent の一部として使用され、文書の流れを形成します。
 * - PalpableContent の実装により、視覚的意味を持つHTML要素として振る舞います。
 * - PhrasingContentable に対応し、インラインコンテンツのコンテナとして機能します。
 */
@Html
object P : FlowContent, PalpableContent, PhrasingContentable, Tag<FlowContentable, P>