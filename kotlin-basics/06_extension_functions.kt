/*
kotlinc 06_extension_functions.kt -include-runtime -d extension_functions.jar
java -jar extension_functions.jar
 */

fun String.reverseText(): String = this.reversed()

fun main() {
    val text = "omnomnom nom"
    println(text.reverseText())
}
