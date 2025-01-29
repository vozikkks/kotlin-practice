/*
kotlinc 08_coroutines.kt -include-runtime -d coroutines.jar
java -jar coroutines.jar
I didnt manage to run this one manually
 */

import kotlin.io.println
import kotlinx.coroutines.*

suspend fun fetchData(): String {
    delay(1000) // Simulate network request
    return "Data received"
}

fun main() = runBlocking {
    println("Fetching data...")
    val result = fetchData()
    println(result)
}
