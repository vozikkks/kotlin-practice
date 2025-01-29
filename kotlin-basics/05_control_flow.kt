/*
kotlinc 05_control_flow.kt -include-runtime -d control_flow.jar
java -jar control_flow.jar
 */
fun main() {
    val num = 10
    if (num > 5) {
        println("Greater than 5")
    } else {
        println("Less than or equal to 5")
    }

    for (i in 1..5) {
        println("Number: $i")
    }

    val result =
            when (num) {
                1 -> "one"
                2 -> "two"
                else -> "other"
            }
    println(result)
}
