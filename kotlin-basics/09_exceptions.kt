/*
kotlinc 09_exceptions.kt -include-runtime -d exceptions.jar
java -jar exceptions.jar
*/

 / 1️⃣ Basic try-catch example
fun divide(a: Int, b: Int): Int {
    return try {
        a / b
    } catch (e: ArithmeticException) {
        println("Caught exception: ${e.message}")
        -1 // Return a default value
    }
}

fun main() {
    println(divide(10, 2)) // ✅ Output: 5
    println(divide(10, 0)) // ❌ Caught exception, Output: -1

    // 2️⃣ Using runCatching for cleaner exception handling
    val result =
            runCatching { riskyOperation() }.getOrElse { "Error: ${it.message}" } // Handle error

    println(result) // Output: Error: Something went wrong

    // 3️⃣ Throwing a custom exception
    try {
        validateAge(15)
    } catch (e: AgeException) {
        println("Custom Exception: ${e.message}")
    }

    // 4️⃣ Null safety with exceptions
    val name: String? = null
    try {
        checkNotNull(name) { "Name cannot be null" }
    } catch (e: IllegalStateException) {
        println("Caught null exception: ${e.message}")
    }
}

// 5️⃣ Function that throws an exception
fun riskyOperation(): String {
    throw IllegalStateException("Something went wrong")
}

// 6️⃣ Creating a custom exception class
class AgeException(message: String) : Exception(message)

// 7️⃣ Using a custom exception in a function
fun validateAge(age: Int) {
    if (age < 18) {
        throw AgeException("Age must be 18 or above")
    }
}
