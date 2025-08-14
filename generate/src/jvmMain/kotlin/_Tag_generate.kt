import generator.DslGenerator
import generator.IntegrationGenerator
import generator.NativeGenerator
import generator.TagGenerator
import java.io.File

fun main() {
    // 出力先ディレクトリ
    val outputDir = "../renlin/src/commonMain/kotlin/net/kigawa/renlin/tag"
    val categoryOutputDir = "../renlin/src/commonMain/kotlin/net/kigawa/renlin/w3c/category"
    val categoryIntegrationOutputDir = "$categoryOutputDir/integration"
    val categoryDslOutputDir = "$categoryOutputDir/dsl"
    val categoryNativeOutputDir = "$categoryOutputDir/native"
    File(outputDir).mkdirs()
    File(categoryOutputDir).mkdirs()
    File(categoryIntegrationOutputDir).mkdirs()
    File(categoryDslOutputDir).mkdirs()
    File(categoryNativeOutputDir).mkdirs()

    val tagGenerator = TagGenerator(outputDir).also {
        it.generate()
    }
    val integrationGenerator = IntegrationGenerator(categoryIntegrationOutputDir).also {
        it.generate()
    }
    val dslGenerator = DslGenerator(categoryDslOutputDir).also {
        it.generate()
    }
    val nativeGenerator = NativeGenerator(categoryNativeOutputDir).also {
        it.generate(integrationGenerator.nativeCategories)
    }

    println("タグのコード生成が完了しました。")
    println("生成されたIntegrationクラス: ${integrationGenerator.processedIntegrations.size}")
    println("生成されたDSLクラス: ${dslGenerator.processedDsls.size}")
}