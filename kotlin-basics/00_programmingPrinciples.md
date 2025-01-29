
/*
 * SOLID Principles:
 * 1. Single Responsibility (SRP): 
 *    - A class should have one reason to change.
 *    - Example: Separate classes for "FileStorage" and "UserLogic."
 *
 * 2. Open/Closed (OCP): 
 *    - Classes should be open for extension, closed for modification.
 *    - Example: Use interfaces to add new behavior instead of modifying existing code.
 *
 * 3. Liskov Substitution (LSP): 
 *    - Subclasses should replace their parent class without breaking functionality.
 *    - Example: "Square" should behave like "Rectangle" if extending it.
 *
 * 4. Interface Segregation (ISP): 
 *    - Don’t force a class to implement unused methods.
 *    - Example: Use smaller interfaces instead of one large one.
 *
 * 5. Dependency Inversion (DIP): 
 *    - Depend on abstractions, not concrete implementations.
 *    - Example: Pass interfaces to a constructor instead of instantiating objects.
 */

 /*
 * KISS Principle:
 * - Keep code simple and avoid unnecessary complexity.
 * - Example: Use built-in methods like "Arrays.sort()" instead of writing your own sorting logic.
 */

 /*
 * DRY Principle:
 * - Don’t duplicate code; reuse it instead.
 * - Example: Move repeated logic into a separate reusable method.
 */

 Practical Example of SOLID + KISS + DRY

 abstract class Vehicle {
    abstract void startEngine(); // Shared behavior for all vehicles
}

class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Car engine started");
    }
}

class Truck extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Truck engine started");
    }
}

class Garage {
    void testEngine(Vehicle vehicle) { // Depend on abstraction (DIP)
        vehicle.startEngine();
    }
}

public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();

        Vehicle car = new Car();     // LSP: Car behaves like a Vehicle
        Vehicle truck = new Truck(); // LSP: Truck behaves like a Vehicle

        garage.testEngine(car);   // Outputs: Car engine started
        garage.testEngine(truck); // Outputs: Truck engine started
    }
}


/*
 * 1. static and final
 * -------------------
 * 
 * static:
 * - Used to define members (variables, methods) that belong to the class, not to individual objects.
 * - static variables are shared across all objects.
 * - static methods can be called without creating an object.
 * 
 * Example:
 */
class MyClass {
    static int counter = 0; // Shared by all objects
    String name;

    MyClass(String name) {
        this.name = name;
        counter++;
    }

    static void printCounter() { // Can be called without an object
        System.out.println("Counter: " + counter);
    }
}

/*
 * final:
 * - final variables: Value cannot be changed after initialization.
 * - final methods: Cannot be overridden by subclasses.
 * - final classes: Cannot be extended.
 * 
 * Example:
 */
final class Constants {
    static final double PI = 3.14159; // A constant
}

class Parent {
    final void display() { // Cannot be overridden
        System.out.println("This is final.");
    }
}

/*
 * 2. Access Modifiers
 * -------------------
 * Define the visibility of classes, methods, and variables.
 * 
 * private: Accessible only within the same class.
 * default: Accessible within the same package.
 * protected: Accessible within the same package and subclasses.
 * public: Accessible everywhere.
 * 
 * Example:
 */
class AccessModifiersExample {
    private int privateVar = 10;  // Accessible only within this class
    int defaultVar = 20;          // Accessible within the same package
    protected int protectedVar = 30; // Accessible in package + subclasses
    public int publicVar = 40;    // Accessible everywhere

    public void printVars() {
        System.out.println("Private: " + privateVar);
        System.out.println("Default: " + defaultVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Public: " + publicVar);
    }
}

/*
 * 3. The Object Class and Common Methods
 * --------------------------------------
 * The Object class is the parent class of all Java classes. Commonly used methods:
 * 
 * toString(): Returns a string representation of the object.
 * equals(): Compares two objects for equality.
 * hashCode(): Returns a hash code for the object.
 * getClass(): Returns the runtime class of the object.
 * clone(): Creates a shallow copy of the object.
 * 
 * Example:
 */
class MyObject {
    private String name;

    MyObject(String name) {
        this.name = name;
    }

    @Override
    public String toString() { // Override toString
        return "MyObject: " + name;
    }

    @Override
    public boolean equals(Object o) { // Override equals
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyObject myObject = (MyObject) o;
        return name.equals(myObject.name);
    }
}

public class Main {
    public static void main(String[] args) {
        // Example for static
        MyClass obj1 = new MyClass("Object1");
        MyClass obj2 = new MyClass("Object2");
        MyClass.printCounter(); // Output: Counter: 2

        // Example for access modifiers
        AccessModifiersExample example = new AccessModifiersExample();
        example.printVars(); // Outputs values of all variables

        // Example for Object class methods
        MyObject obj1 = new MyObject("Java");
        MyObject obj2 = new MyObject("Java");
        System.out.println(obj1.toString());    // Output: MyObject: Java
        System.out.println(obj1.equals(obj2)); // Output: true
        System.out.println(obj1.hashCode());   // Unique hash for obj1
        System.out.println(obj1.getClass());   // Output: class MyObject
    }
}