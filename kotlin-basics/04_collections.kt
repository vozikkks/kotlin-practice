/*
kotlinc 04_collections.kt -include-runtime -d collections.jar
java -jar collections.jar
 */

fun main() {
    val list = listOf("Apple", "Cherry", "Orange")
    val mutableList = mutableListOf("Dog", "Bird", "Cat")
    mutableList.add("Fish")

    println("Immutable list: $list")
    println("Mutable list: $mutableList")
}
