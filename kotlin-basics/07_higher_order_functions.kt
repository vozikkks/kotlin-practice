/*
kotlinc 07_higher_order_functions.kt -include-runtime -d higher_order_functions.jar
java -jar higher_order_functions.jar
 */

fun operateOnNumbers(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun main() {
    val sum = operateOnNumbers(5, 3) { x, y -> x + y }
    println("Sum: $sum")
}
