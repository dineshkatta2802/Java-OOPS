<h1>Java</h1>
This java file Consists of the new Java programs With clear explanation and examples
<h2>Differntiating table between Inheritance,Polymorphism,abstracton,Encapsulation</h2>
<table>
    <tr>
        <th>Aspect</th>
        <th>Inheritance</th>
        <th>Polymorphism</th>
        <th>Abstraction</th>
        <th>Encapsulation</th>
    </tr>
    <tr>
        <td>Definition</td>
        <td>Allows a class (subclass/derived class) to inherit properties and behaviors (methods) from another class (superclass/base class).</td>
        <td>Refers to the ability of objects to take on different forms or types, allowing methods to be called on objects of different classes through a common interface.</td>
        <td>Hides the complex implementation details of a class and shows only the essential features of the object.</td>
        <td>Bundling data and methods into a single unit (class) and controlling access to some of the object's components.</td>
    </tr>
    <tr>
        <td>What</td>
        <td>Relationship between classes where one class inherits from another.</td>
        <td>Allows objects of different classes to be treated as objects of a common superclass.</td>
        <td>Focuses on the interface and hides the implementation details.</td>
        <td>Bundles data and methods into a single unit and controls access to them.</td>
    </tr>
    <tr>
        <td>Where</td>
        <td>Class level</td>
        <td>Object level</td>
        <td>Class level</td>
        <td>Class level</td>
    </tr>
    <tr>
        <td>How</td>
        <td>Using the `extends` keyword to create a subclass that inherits from a superclass.</td>
        <td>Through method overriding (runtime polymorphism) and method overloading (compile-time polymorphism).</td>
        <td>Using abstract classes and interfaces to define the abstract view of objects.</td>
        <td>Using access modifiers (private, public, protected) to control access to data.</td>
    </tr>
    <tr>
        <td>When</td>
        <td>Used when a class wants to reuse the properties and behaviors of another class.</td>
        <td>Used when there is a need to perform different actions based on the object type.</td>
        <td>Used when we want to hide complex implementation details and provide a simplified interface.</td>
        <td>Used when data hiding and restricting direct access to data is required.</td>
    </tr>
    <tr>
        <td>Why</td>
        <td>To promote code reusability and to implement the "is-a" relationship.</td>
        <td>To achieve flexibility and to support polymorphic behavior.</td>
        <td>To simplify the complexities and focus on essential features of an object.</td>
        <td>To improve security, maintainability, and flexibility of code.</td>
    </tr>
    <tr>
        <td>Purpose</td>
        <td>Supports code reusability and establishes a hierarchical relationship between classes.</td>
        <td>Supports flexibility in method calls and enhances code extensibility.</td>
        <td>Provides a clear and simplified view of objects and systems.</td>
        <td>Protects an object's internal state and enhances maintainability.</td>
    </tr>
    <tr>
        <td>Advantages</td>
        <td>
            <ul>
                <li>Code reusability</li>
                <li>Promotes software extensibility</li>
                <li>Supports polymorphism</li>
            </ul>
        </td>
        <td>
            <ul>
                <li>Enhanced flexibility</li>
                <li>Improved code readability</li>
                <li>Efficient code maintenance</li>
            </ul>
        </td>
        <td>
            <ul>
                <li>Simplifies code complexity</li>
                <li>Enhances system flexibility</li>
                <li>Improves code maintenance</li>
            </ul>
        </td>
        <td>
            <ul>
                <li>Enhanced security</li>
                <li>Improved maintainability</li>
                <li>Flexibility to change implementation</li>
            </ul>
        </td>
    </tr>
    <tr>
        <td>Disadvantages</td>
        <td>
            <ul>
                <li>Can lead to tight coupling between classes</li>
                <li>Increases complexity in large hierarchies</li>
            </ul>
        </td>
        <td>
            <ul>
                <li>Requires careful design to avoid ambiguity</li>
                <li>Potential performance overhead</li>
            </ul>
        </td>
        <td>
            <ul>
                <li>May lead to over-simplification and loss of details</li>
                <li>Requires careful design to avoid excessive abstraction</li>
            </ul>
        </td>
        <td>
            <ul>
                <li>Increased development time due to defining accessors and mutators</li>
                <li>Potential overhead in performance due to method calls</li>
            </ul>
        </td>
    </tr>
</table>

<h3>Examples</h3>

<h4>Inheritance Example</h4>

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
        Animal animal = new Animal();
        animal.sound(); // Output: Animal makes a sound

        Dog dog = new Dog();
        dog.sound(); // Output: Dog barks
    }
}
</code>
</pre>

<h4>Polymorphism Example</h4>

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

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        myAnimal.sound(); // Output: Dog barks

        myAnimal = new Cat();
        myAnimal.sound(); // Output: Cat meows
    }
}
</code>
</pre>

<h4>Abstraction Example</h4>

<pre>
<code>
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw(); // Output: Drawing Circle

        shape = new Rectangle();
        shape.draw(); // Output: Drawing Rectangle
    }
}
</code>
</pre>

<h4>Encapsulation Example</h4>

<pre>
<code>
class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John Doe");
        person.setAge(30);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
</code>
</pre>

