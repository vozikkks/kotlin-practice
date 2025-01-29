/*
kotlinc 05_control_flow.kt -include-runtime -d control_flow.jar
java -jar control_flow.jar
 */
fun main() {
    val num = 10

    // If-Else
    if (num > 5) {
        println("Greater than 5")
    } else {
        println("Less than or equal to 5")
    }

    // For-Loop
    for (i in 1..5) {
        println("For loop - Number: $i")
    }

    // When
    val result =
            when (num) {
                1 -> "one"
                2 -> "two"
                in 3..9 -> "between three and nine"
                else -> "other"
            }
    println("When result: $result")

    // While-Loop
    var count = 3
    while (count > 0) {
        println("While loop - Countdown: $count")
        count--
    }

    // Do-While
    var x = 0
    do {
        println("Do-while loop - x = $x")
        x++
    } while (x < 3)
}
