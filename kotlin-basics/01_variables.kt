/*
kotlinc 01_variables.kt -include-runtime -d variables.jar
java -jar variables.jar
 */

fun main() {
    val name: String = "Kseniia" // Immutiable variable
    var age: Int = 26 // Mutiable variable
    age += 1

    println("Hi, my name is $name and I am not $age years old")
}
