// This is a Java reference file. It’s not meant to compile but to serve as a knowledge resource.

/*
 * 1. What is Java?
 * - Java is a high-level, platform-independent, object-oriented programming language.
 * - Features:
 *   - Platform-independent: "Write Once, Run Anywhere" (via JVM).
 *   - Object-Oriented: Based on OOP principles like inheritance, polymorphism, encapsulation, abstraction.
 *   - Multithreaded: Java supports concurrent task execution.
 *   - Secure: Strong memory management and no explicit pointers.
 */

/*
 * 2. JVM, JRE, and JDK
 * - JVM (Java Virtual Machine): Executes Java bytecode on any platform.
 * - JRE (Java Runtime Environment): Includes JVM + core libraries to run Java apps.
 * - JDK (Java Development Kit): Includes JRE + tools like javac (compiler) for development.
 */

/*
 * 3. Data Types
 * Java has two types of data types:
 * - Primitive: byte, short, int, long, float, double, char, boolean.
 * - Reference: Arrays, Classes, Interfaces, etc.
 */
byte myByte = 10;          // 1 byte (range: -128 to 127)
short myShort = 500;       // 2 bytes (range: -32,768 to 32,767)
int myInt = 1000;          // 4 bytes (range: -2^31 to 2^31-1)
long myLong = 100000L;     // 8 bytes (range: -2^63 to 2^63-1)
float myFloat = 3.14f;     // 4 bytes (decimal, single-precision)
double myDouble = 3.14159; // 8 bytes (decimal, double-precision)
char myChar = 'A';         // 2 bytes (single character)
boolean myBoolean = true;  // 1 bit (true or false)

/*
 * 4. Control Flow (if-else, switch, loops)
 * - If-else example:
 */
if (myInt > 0) {
    System.out.println("Positive number");
} else {
    System.out.println("Non-positive number");
}

/*
 * - Switch example:
 */
int day = 3;
switch (day) {
    case 1 -> System.out.println("Monday");
    case 2 -> System.out.println("Tuesday");
    default -> System.out.println("Another day");
}

/*
 * - Loops: for, while, do-while
 */
for (int i = 0; i < 5; i++) {
    System.out.println("Count: " + i);
}
int count = 0;
while (count < 5) {
    System.out.println("While count: " + count);
    count++;
}
do {
    System.out.println("Do-While count: " + count);
    count--;
} while (count > 0);

/*
 * 5. Arrays
 * Arrays are used to store multiple values of the same type.
 */
int[] numbers = {1, 2, 3, 4, 5};
for (int number : numbers) {
    System.out.println(number);
}

/*
 * 6. Methods
 * Methods are reusable blocks of code. They may or may not return values.
 */
public static int add(int a, int b) {
    return a + b;
}
System.out.println("Sum: " + add(5, 10));

/*
 * 7. Object-Oriented Programming (OOP)
 * - Core Principles:
 *   - Encapsulation: Wrapping data and code together in a class.
 *   - Inheritance: A class inherits fields/methods from another class.
 *   - Polymorphism: One method, multiple implementations.
 *   - Abstraction: Hiding internal details and showing only the necessary features.
 */
class Person {
    private String name; // Encapsulation (private field)

    public Person(String name) { // Constructor
        this.name = name;
    }

    public String getName() { // Getter
        return name;
    }

    public void setName(String name) { // Setter
        this.name = name;
    }
}
Person person = new Person("Kseniia");
System.out.println("Name: " + person.getName());

/*
 * 8. Exception Handling
 * Handle runtime errors gracefully using try-catch blocks.
 */
try {
    int result = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero!");
}

/*
 * 9. String Operations
 * Strings are immutable objects in Java.
 */
String str = "Hello, Java!";
System.out.println("Length: " + str.length());
System.out.println("Substring: " + str.substring(0, 5));
System.out.println("Uppercase: " + str.toUpperCase());

/*
 * 10. Collections Framework
 * Java Collections (e.g., ArrayList, HashMap) provide dynamic data structures.
 */
import java.util.ArrayList;
ArrayList<String> list = new ArrayList<>();
list.add("Java");
list.add("Python");
System.out.println(list);

/*
 * 11. Multithreading
 * Threads allow concurrent execution of code.
 */
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
}
MyThread thread = new MyThread();
thread.start();

