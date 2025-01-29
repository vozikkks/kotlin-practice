/*
kotlinc 10_file_io.kt -include-runtime -d fileio.jar
java -jar fileio.jar
 */
import java.io.File

fun main() {
    val fileName = "testfile.txt"

    // Write to a file
    File(fileName).writeText("Hello, file i/o!")

    // Add text to an existing file
    File(fileName).appendText("\nThis is an addtion line.")

    // Read the file
    val content = File(fileName).readText()
    println("File content: ${content}")

    // Delete the file after execution (optional)
    File(fileName).delete()
    println("\n🗑️ File deleted.")
}
