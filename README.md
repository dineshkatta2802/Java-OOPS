<h1>Java</h1>
This java file Consists of the new Java programs With clear explanation and examples
<h2>Differntiating table between Inheritance,Polymorphism,abstracton,Encapsulation</h2>
<table>
    <tr>
        <th>Concept</th>
        <th>Definition</th>
        <th>Characteristics</th>
        <th>Properties</th>
        <th>Advantages</th>
        <th>Disadvantages</th>
        <th>Example</th>
    </tr>
    <tr>
        <td>Inheritance</td>
        <td>Allows a class (subclass/derived class) to inherit behaviors and properties from another class (superclass/base class).</td>
        <td>
            <ul>
                <li>Establishes a parent-child relationship between classes.</li>
                <li>Supports code reusability.</li>
                <li>Enables overriding of methods.</li>
            </ul>
        </td>
        <td>
            <ul>
                <li>Uses extends keyword in Java.</li>
                <li>Derived class inherits non-private members (fields and methods) from the base class.</li>
            </ul>
        </td>
        <td>
            <ul>
                <li>Promotes code reusability and reduces redundancy.</li>
                <li>Facilitates method overriding to provide specific implementation in subclasses.</li>
            </ul>
        </td>
        <td>
            <ul>
                <li>Can lead to tight coupling between classes.</li>
                <li>Increases complexity of the codebase.</li>
            </ul>
        </td>
        <td>
<pre>
<code>
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound(); // Output: Dog barks
    }
}
</code>
</pre>
        </td>
    </tr>
    <tr>
        <td>Polymorphism</td>
        <td>Allows objects of different classes to be treated as objects of a common superclass, providing flexibility in method invocation.</td>
        <td>
            <ul>
                <li>Supports method overloading and overriding.</li>
                <li>Enables dynamic method dispatch.</li>
                <li>Facilitates code flexibility and extensibility.</li>
            </ul>
        </td>
        <td>
            <ul>
                <li>Can be achieved through method overloading and overriding.</li>
                <li>Enables interfaces and abstract classes to achieve polymorphic behavior.</li>
            </ul>
        </td>
        <td>
            <ul>
                <li>Enhances code flexibility and reuse.</li>
                <li>Supports the concept of "one interface, multiple methods".</li>
            </ul>
        </td>
        <td>
            <ul>
                <li>Can lead to confusion if not used carefully.</li>
                <li>Overuse can result in code that is difficult to understand and maintain.</li>
            </ul>
        </td>
        <td>
<pre>
<code>
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Animal();
        
        animal1.sound(); // Output: Dog barks
        animal2.sound(); // Output: Animal makes a sound
    }
}
</code>
</pre>
        </td>
    </tr>
    <tr>
        <td>Abstraction</td>
        <td>Hides complex implementation details and shows only the necessary features of an object.</td>
        <td>
            <ul>
                <li>Focuses on essential features.</li>
                <li>Uses abstract classes and interfaces.</li>
                <li>Reduces complexity and enhances maintainability.</li>
            </ul>
        </td>
        <td>
            <ul>
                <li>Uses abstract classes, interfaces, and access modifiers (public, private, protected).</li>
                <li>Allows defining abstract methods (methods without a body) and concrete methods.</li>
            </ul>
        </td>
        <td>
            <ul>
                <li>Provides clarity and simplification of complex systems.</li>
                <li>Enhances modularity and maintainability of code.</li>
            </ul>
        </td>
        <td>
            <ul>
                <li>May lead to over-simplification of the system.</li>
                <li>Requires careful design to balance abstraction and implementation details.</li>
            </ul>
        </td>
        <td>
<pre>
<code>
interface Animal {
    void sound(); // abstract method
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound(); // Output: Dog barks
    }
}
</code>
</pre>
        </td>
    </tr>
    <tr>
        <td>Encapsulation</td>
        <td>Bundles data (fields) and methods that operate on the data into a single unit (class), and restricts access to some components.</td>
        <td>
            <ul>
                <li>Uses access modifiers (private, public, protected) to restrict access to data.</li>
                <li>Protects an object's internal state.</li>
                <li>Enhances security and flexibility of code.</li>
            </ul>
        </td>
        <td>
            <ul>
                <li>Uses private variables and public getter/setter methods.</li>
                <li>Supports data hiding and information abstraction.</li>
            </ul>
        </td>
        <td>
            <ul>
                <li>Improves code maintainability and reusability.</li>
                <li>Enables effective debugging and testing.</li>
            </ul>
        </td>
        <td>
            <ul>
                <li>Can lead to increased complexity if not used properly.</li>
                <li>May introduce overhead due to method calls.</li>
            </ul>
        </td>
        <td>
<pre>
<code>
class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle myCircle = new Circle(5.0);
        System.out.println("Radius: " + myCircle.getRadius());
        System.out.println("Area: " + myCircle.calculateArea());
    }
}
</code>
</pre>
        </td>
    </tr>
</table>
