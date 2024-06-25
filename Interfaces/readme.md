<h1>⁡⁣⁢⁣Interfaces⁡</h1>
It is a reference type which is similar to Class<br>
The Interface can only contain constants, method signatures, default methods, static methods, and nested types<br>
Interfaces cannot contain instance fields, constructors, or method implementations<br>
<img src="https://media.geeksforgeeks.org/wp-content/uploads/20230419112500/Intefaces-in-Java-2.webp" alt="Multiple Inheritance" width="489" height="300">

<h2>⁡⁣⁢⁣Relationship between Interfaces and Classes⁡</h2>
<img src="https://media.geeksforgeeks.org/wp-content/uploads/20230419112343/Intefaces-in-Java-1.webp" alt="Multiple Inheritance" width="670" height="247">

<h2>⁡⁣⁢⁣Classes v/s Interface⁡</h2>
    <table>
        <tr>
            <th>Feature</th>
            <th>Class</th>
            <th>Interface</th>
        </tr>
        <tr>
            <td>Definition</td>
            <td>A blueprint from which individual objects are created. It can contain fields, methods, constructors, and inner classes.</td>
            <td>A reference type, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types.</td>
        </tr>
        <tr>
            <td>Methods</td>
            <td>Can contain concrete (implemented) methods.</td>
            <td>Can contain abstract methods (methods without a body), default methods, and static methods.</td>
        </tr>
        <tr>
            <td>Fields</td>
            <td>Can contain instance variables and static variables.</td>
            <td>Can contain only constants (public static final fields).</td>
        </tr>
        <tr>
            <td>Inheritance</td>
            <td>Supports single inheritance (a class can inherit from only one superclass).</td>
            <td>Supports multiple inheritance (a class can implement multiple interfaces).</td>
        </tr>
        <tr>
            <td>Constructors</td>
            <td>Can have constructors.</td>
            <td>Cannot have constructors.</td>
        </tr>
        <tr>
            <td>Instantiation</td>
            <td>Can be instantiated to create objects.</td>
            <td>Cannot be instantiated directly.</td>
        </tr>
        <tr>
            <td>Access Modifiers</td>
            <td>Can have any access modifiers (public, protected, private, default).</td>
            <td>Methods are implicitly public and abstract; fields are implicitly public, static, and final.</td>
        </tr>
        <tr>
            <td>Abstract</td>
            <td>Can be abstract or concrete.</td>
            <td>Implicitly abstract (methods in an interface are abstract unless they are default or static).</td>
        </tr>
        <tr>
            <td>Implementation</td>
            <td>A class that extends another class must provide implementations for any abstract methods from its superclass.</td>
            <td>A class that implements an interface must provide implementations for all abstract methods in the interface.</td>
        </tr>
        <tr>
            <td>Keyword</td>
            <td>Declared using the <code>class</code> keyword.</td>
            <td>Declared using the <code>interface</code> keyword.</td>
        </tr>
    </table>

<h2>⁡⁣⁢⁣Advantages and Disadvantages⁡</h2>
    <table>
        <tr>
            <th>Aspect</th>
            <th>Advantages</th>
            <th>Disadvantages</th>
        </tr>
        <tr>
            <td>Multiple Inheritance</td>
            <td>Allows a class to implement multiple interfaces, facilitating multiple inheritance and more flexible design.</td>
            <td>Can lead to complexity and ambiguity if overused, making the code harder to understand and maintain.</td>
        </tr>
        <tr>
            <td>Design and Flexibility</td>
            <td>Provides a way to define a contract for what a class can do, allowing for flexible and interchangeable code components.</td>
            <td>May lead to over-engineering if interfaces are created without a clear need, adding unnecessary complexity.</td>
        </tr>
        <tr>
            <td>Implementation Independence</td>
            <td>Decouples the implementation from the interface, allowing different implementations to be used interchangeably.</td>
            <td>Requires all implementing classes to provide concrete implementations for all methods, which can be tedious and redundant.</td>
        </tr>
        <tr>
            <td>Code Reusability</td>
            <td>Promotes code reusability by allowing common functionality to be defined in an interface and implemented by multiple classes.</td>
            <td>Default methods in interfaces can sometimes lead to conflicts and ambiguity, especially in complex hierarchies.</td>
        </tr>
        <tr>
            <td>Testing and Maintenance</td>
            <td>Facilitates easier testing and maintenance by allowing the use of mock implementations during testing.</td>
            <td>Can make the codebase more difficult to maintain if interfaces are not well-documented or if their usage is not clear.</td>
        </tr>
        <tr>
            <td>API Design</td>
            <td>Helps in designing clean and clear APIs by specifying the methods that must be implemented without dictating how they should be implemented.</td>
            <td>Interfaces cannot contain implementation-specific details, which might limit their use in some scenarios where concrete classes would be more appropriate.</td>
        </tr>
    </table>


<h2>⁡⁣⁢⁣Interface v/s Classes⁡</h2>
    <table>
        <tr>
            <th>Feature</th>
            <th>Interface</th>
            <th>Class</th>
        </tr>
        <tr>
            <td><strong>Definition</strong></td>
            <td>An interface in Java defines a contract that classes can choose to implement. It contains method signatures and constants, without method bodies.</td>
            <td>A class in Java is a blueprint from which objects are created. It can contain methods, constructors, fields, initialization blocks, and instance/static variables.</td>
        </tr>
        <tr>
            <td><strong>Where</strong></td>
            <td>Used when you want to define a set of methods that a class must implement, without specifying how they are implemented.</td>
            <td>Used when you want to create objects that have state and behavior, encapsulating data and methods.</td>
        </tr>
        <tr>
            <td><strong>How</strong></td>
            <td>Defined using the <code>interface</code> keyword. Methods are declared but not implemented.</td>
            <td>Defined using the <code>class</code> keyword. Can have constructors, methods with implementations, and various access specifiers.</td>
        </tr>
        <tr>
            <td><strong>When</strong></td>
            <td>When you want to enforce a certain behavior across multiple unrelated classes.</td>
            <td>When you want to create objects with specific characteristics and behaviors.</td>
        </tr>
        <tr>
            <td><strong>Why</strong></td>
            <td>To achieve abstraction and multiple inheritances of type.</td>
            <td>To model real-world entities, manage complexity, and achieve encapsulation and inheritance.</td>
        </tr>
        <tr>
            <td><strong>Advantages</strong></td>
            <td>
                <ul>
                    <li>Enforces a contract among unrelated classes.</li>
                    <li>Supports multiple inheritances of type.</li>
                    <li>Promotes code reusability and flexibility.</li>
                    <li>Allows for loose coupling and easier maintenance.</li>
                </ul>
            </td>
            <td>
                <ul>
                    <li>Encapsulates data and behavior.</li>
                    <li>Supports inheritance and polymorphism.</li>
                    <li>Allows for code organization and modularization.</li>
                    <li>Provides mechanisms for abstraction and encapsulation.</li>
                </ul>
            </td>
        </tr>
        <tr>
            <td><strong>Disadvantages</strong></td>
            <td>
                <ul>
                    <li>Cannot contain instance fields (only constants).</li>
                    <li>Does not provide implementation details.</li>
                    <li>May lead to a large number of interfaces if not managed properly.</li>
                </ul>
            </td>
            <td>
                <ul>
                    <li>May lead to tight coupling if not designed properly.</li>
                    <li>Requires careful management of inheritance to avoid complexity.</li>
                    <li>Cannot support multiple inheritances of implementation.</li>
                </ul>
            </td>
        </tr>
        <tr>
            <td><strong>Example</strong></td>
            <td>
                <pre><code>
// Example of an interface
interface Animal {
    void eat();
    void sleep();
}

// Example of a class implementing the interface
class Dog implements Animal {
    public void eat() {
        System.out.println("Dog is eating");
    }
    
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}

// Main program to demonstrate usage
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
    }
}
                </code></pre>
            </td>
            <td>
                <pre><code>
// Example of a class with methods and fields
class Car {
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void start() {
        System.out.println("Car started");
    }

    public void stop() {
        System.out.println("Car stopped");
    }
}

// Main program to demonstrate usage
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2020);
        myCar.start();
        myCar.stop();
    }
}
                </code></pre>
            </td>
        </tr>
        <tr>
            <td><strong>Output (Example)</strong></td>
            <td>
                <pre>
Dog is eating
Dog is sleeping
                </pre>
            </td>
            <td>
                <pre>
Car started
Car stopped
                </pre>
            </td>
        </tr>
    </table>

<h2>⁡⁣⁢⁣Multiple Inheritance using Interface⁡</h2>
<img src="https://static.javatpoint.com/images/core/multipleinheritance.jpg" alt="Multiple Inheritance" width="702" height="279">
// Define an interface for all animals<br>
interface Animal {<br>
    void eat();  // Method to eat<br>
    void sleep();  // Method to sleep<br>
}<br>
<br>
// Define an interface for pets<br>
interface Pet {<br>
    void play();  // Method to play<br>
    void makeSound();  // Method to make sound<br>
}<br>
<br>
// Dog class implementing both Animal and Pet interfaces<br>
class Dog implements Animal, Pet {<br>
    private String name;<br>
<br>
    // Constructor<br>
    public Dog(String name) {<br>
        this.name = name;<br>
    }<br>
<br>
    // Implementation of Animal interface methods<br>
    @Override<br>
    public void eat() {<br>
        System.out.println(name + " is eating.");<br>
    }<br>
<br>
    @Override<br>
    public void sleep() {<br>
        System.out.println(name + " is sleeping.");<br>
    }<br>
<br>
    // Implementation of Pet interface methods<br>
    @Override<br>
    public void play() {<br>
        System.out.println(name + " is playing.");<br>
    }<br>
<br>
    @Override<br>
    public void makeSound() {<br>
        System.out.println(name + " says: Woof!");<br>
    }<br>
}<br>
<br>
// Main class to demonstrate usage<br>
public class MultipleInheritanceExample {<br>
    public static void main(String[] args) {<br>
        // Create an instance of Dog<br>
        Dog dog = new Dog("Buddy");<br>
<br>
        // Display details using interface methods<br>
        dog.eat();<br>
        dog.sleep();<br>
        dog.play();<br>
        dog.makeSound();<br>
    }<br>
}<br>

