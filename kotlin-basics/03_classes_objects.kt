/*
kotlinc 03_classes_objects.kt -include-runtime -d classes_objects.jar
java -jar classes_objects.jar
 */

class Person(val name: String, var age: Int) {
    fun introduce() = "Hi, my name is $name and I am $age years old."
}

fun main() {
    val person = Person("Anna", 20)
    println(person.introduce())
}
