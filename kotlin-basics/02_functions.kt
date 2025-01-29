/*
kotlinc 02_functions.kt -include-runtime -d functions.jar
java -jar functions.jar
 */

fun greet(name: String): String {
    return "Hiiii, $name!"
}

fun main() {
    println(greet("Kseniia"))
}
