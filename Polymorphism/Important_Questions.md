<h1>⁡⁢⁣⁢Some Important Questions for Interview on Polymorphism⁡</h1><br>

<h2>⁡⁣⁢⁣1.Differentiate between Staticand Dynamic polymorphism(Compile-time polymorphism and Runtime Plymorphism)?⁡</h2><br>
<!DOCTYPE html>
<html>
<head>
    <title>Static vs Dynamic Polymorphism in Java</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid black;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <h2>Static vs Dynamic Polymorphism in Java</h2>
    <table>
        <tr>
            <th>Criteria</th>
            <th>Static Polymorphism</th>
            <th>Dynamic Polymorphism</th>
        </tr>
        <tr>
            <td>Definition</td>
            <td>Static polymorphism, also known as compile-time polymorphism, is achieved by method overloading or operator overloading.</td>
            <td>Dynamic polymorphism, also known as runtime polymorphism, is achieved by method overriding.</td>
        </tr>
        <tr>
            <td>Binding</td>
            <td>Binding of method calls to method implementations is done at compile time.</td>
            <td>Binding of method calls to method implementations is done at runtime.</td>
        </tr>
        <tr>
            <td>Implementation</td>
            <td>Implemented using method overloading.</td>
            <td>Implemented using method overriding and inheritance.</td>
        </tr>
        <tr>
            <td>Performance</td>
            <td>Generally faster because the method to be invoked is known at compile time.</td>
            <td>Generally slower because the method to be invoked is determined at runtime.</td>
        </tr>
        <tr>
            <td>Flexibility</td>
            <td>Less flexible as it is decided at compile time.</td>
            <td>More flexible as it allows for more dynamic and extensible code.</td>
        </tr>
        <tr>
            <td>Example</td>
            <td>
                <pre>
class Example {
    void add(int a, int b) {
        System.out.println(a + b);
    }
    void add(double a, double b) {
        System.out.println(a + b);
    }
}
                </pre>
            </td>
            <td>
                <pre>
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
public class Test {
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.sound(); // Dog barks
    }
}
                </pre>
            </td>
        </tr>
    </table>
</body>
</html>

<h2>⁡⁣⁢⁣2.What Function that cannot be Overloaded by C++?⁡</h2><br>

<h3>⁡⁢⁣⁣1.Main Function (`main`):⁡</h3><br>
The starting point of a C++ program; its signature cannot be changed or overloaded.<br>
   <br>
<h3>⁡⁢⁣⁣2.Constructors and Destructors:⁡</h3> <br>
    Constructors can be overloaded, but you cannot create non-constructor member functions with the same name as the class.<br>
    Destructors cannot be overloaded; there can only be one destructor per class.<br>
<br>
<h3>⁡⁢⁣⁣3.Certain Operators: The following operators cannot be overloaded:⁡</h3><br>
    Scope resolution operator (`::`)<br>
    Member access operator (`.`)<br>
    Pointer-to-member operator (`.*`)<br>
    Conditional (ternary) operator (`?:`)<br>
<br>
Here's a quick overview with examples:<br>
<br>
<h3>Main Function (`main`)</h3><br>
int main() {<br>
    return 0;<br>
}<br>
// Cannot have another main function with a different signature.<br>
<br>
<h3>⁡⁢⁣⁣Constructors and Destructors⁡</h3><br>
class Example {<br>
public:<br>
    Example() {}       // Constructor<br>
    // void Example() {} // Error: cannot have a non-constructor function with the same name<br>
<br>
    ~Example() {}      // Destructor<br>
    //~Example(int a) {} // Error: cannot overload destructors<br>
}<br>
<br>
<h3>⁡⁢⁣⁣Certain Operators⁡</h3><br>
class Example {<br>
public:<br>
    // void operator::() {} // Error: scope resolution operator cannot be overloaded<br>
    // void operator.() {}  // Error: member access operator cannot be overloaded<br>
    // void operator.*() {} // Error: pointer-to-member operator cannot be overloaded<br>
    // void operator?() {}  // Error: conditional operator cannot be overloaded<br>
};<br>
```<br>
<br>
In summary, the `main` function, destructors, and certain operators have restrictions in C++ and cannot be overloaded.<br>

<h2>⁡⁣⁢⁣3.What are all the Operartors that cannot be overloaded?⁡</h2><br>
<!DOCTYPE html>
<html>
<head>
    <title>Operators That Cannot Be Overloaded in C++ and Java</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid black;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <h2>Operators That Cannot Be Overloaded in C++ and Java</h2>
    <table>
        <tr>
            <th>Operator</th>
            <th>C++</th>
            <th>Java</th>
        </tr>
        <tr>
            <td>Scope Resolution Operator (`::`)</td>
            <td>Cannot be overloaded</td>
            <td>Not applicable (no operator overloading)</td>
        </tr>
        <tr>
            <td>Member Access Operator (`.`)</td>
            <td>Cannot be overloaded</td>
            <td>Not applicable (no operator overloading)</td>
        </tr>
        <tr>
            <td>Pointer-to-Member Operator (`.*`)</td>
            <td>Cannot be overloaded</td>
            <td>Not applicable (no operator overloading)</td>
        </tr>
        <tr>
            <td>Conditional (Ternary) Operator (`?:`)</td>
            <td>Cannot be overloaded</td>
            <td>Not applicable (no operator overloading)</td>
        </tr>
        <tr>
            <td>Assignment Operator (`=`)</td>
            <td>Can be overloaded</td>
            <td>Not applicable (no operator overloading)</td>
        </tr>
        <tr>
            <td>Arithmetic Operators (`+`, `-`, `*`, `/`, `%`)</td>
            <td>Can be overloaded</td>
            <td>Not applicable (no operator overloading)</td>
        </tr>
        <tr>
            <td>Relational Operators (`==`, `!=`, `<`, `>`, `<=`, `>=`)</td>
            <td>Can be overloaded</td>
            <td>Not applicable (no operator overloading)</td>
        </tr>
        <tr>
            <td>Logical Operators (`&&`, `||`, `!`)</td>
            <td>Can be overloaded</td>
            <td>Not applicable (no operator overloading)</td>
        </tr>
        <tr>
            <td>Bitwise Operators (`&`, `|`, `^`, `~`, `<<`, `>>`, `>>>`)</td>
            <td>Can be overloaded</td>
            <td>Not applicable (no operator overloading)</td>
        </tr>
        <tr>
            <td>Increment and Decrement Operators (`++`, `--`)</td>
            <td>Can be overloaded</td>
            <td>Not applicable (no operator overloading)</td>
        </tr>
        <tr>
            <td>Type Comparison Operator (`instanceof`)</td>
            <td>Not applicable</td>
            <td>Not applicable (no operator overloading)</td>
        </tr>
    </table>
</body>
</html>

<h2>⁡⁣⁢⁣4.What is a Virtual Function?⁡</h2><br>
<!DOCTYPE html>
<html>
<head>
    <title>Virtual Functions in Java and C++</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid black;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <h3>Definition of Virtual Functions</h3>
    <p>
        <strong>Virtual Function in C++:</strong> 
        A virtual function in C++ is a member function in a base class that you expect to override in derived classes. 
        Declaring a function as <code>virtual</code> allows you to achieve dynamic (runtime) polymorphism, which means that the correct function is called for an object, 
        regardless of the type of reference (or pointer) used for the function call.
    </p>
    <p>
        <strong>Virtual Function in Java:</strong> 
        In Java, virtual functions are implemented using method overriding. By default, all non-static methods in Java are virtual, 
        meaning they support dynamic (runtime) polymorphism. This allows Java to determine the appropriate method to invoke at runtime based on the actual object type, 
        not the reference type.
    </p>
    <h3>Differences Between Virtual Functions in C++ and Java</h3>
    <table>
        <tr>
            <th>Criteria</th>
            <th>C++</th>
            <th>Java</th>
        </tr>
        <tr>
            <td>Declaration</td>
            <td>Explicitly declared using the <code>virtual</code> keyword.</td>
            <td>All non-static methods are virtual by default.</td>
        </tr>
        <tr>
            <td>Keyword for Overriding</td>
            <td>No special keyword is required, but <code>override</code> can be used for clarity (C++11 and later).</td>
            <td><code>@Override</code> annotation is used to indicate method overriding.</td>
        </tr>
        <tr>
            <td>Default Behavior</td>
            <td>Methods are not virtual unless specified with <code>virtual</code> keyword.</td>
            <td>Methods are virtual by default.</td>
        </tr>
        <tr>
            <td>Destructors</td>
            <td>Can be virtual to ensure proper cleanup of derived class objects.</td>
            <td>Not applicable (Java uses garbage collection).</td>
        </tr>
        <tr>
            <td>Performance</td>
            <td>Potentially more efficient since not all methods are virtual by default.</td>
            <td>All methods are virtual by default, which can introduce slight overhead.</td>
        </tr>
        <tr>
            <td>Inheritance</td>
            <td>Allows for selective polymorphism with the use of the <code>virtual</code> keyword.</td>
            <td>Supports polymorphism for all non-static methods.</td>
        </tr>
        <tr>
            <td>Abstract Methods</td>
            <td>Declared by assigning 0 to a virtual function: <code>virtual void func() = 0;</code></td>
            <td>Declared with the <code>abstract</code> keyword in an abstract class.</td>
        </tr>
    </table>
</body>
</html>

<h2>⁡⁣⁢⁣5.What is a Virtual Class?⁡</h2><br>
<!DOCTYPE html>
<html>
<head>
    <title>Virtual (Abstract) Classes in Java and C++</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid black;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <h3>Definition of Virtual (Abstract) Classes</h3>
    <p>
        <strong>Virtual (Abstract) Class in C++:</strong>
        A virtual class in C++ is typically referred to as an abstract class. It is a class that cannot be instantiated and is designed to be inherited by other classes. 
        An abstract class in C++ contains at least one pure virtual function, which is a function declared by assigning 0 in its declaration.
    </p>
    <p>
        <strong>Virtual (Abstract) Class in Java:</strong>
        In Java, an abstract class is a class that cannot be instantiated and is meant to be subclassed. 
        An abstract class can contain abstract methods, which are methods declared without an implementation. 
        These methods must be implemented by subclasses.
    </p>
    <h3>Differences Between Virtual (Abstract) Classes in C++ and Java</h3>
    <table>
        <tr>
            <th>Criteria</th>
            <th>C++</th>
            <th>Java</th>
        </tr>
        <tr>
            <td>Declaration</td>
            <td>Declared using the keyword <code>class</code> and contains at least one pure virtual function.</td>
            <td>Declared using the keyword <code>abstract</code>.</td>
        </tr>
        <tr>
            <td>Abstract Methods</td>
            <td>Declared by assigning 0 to a virtual function: <code>virtual void func() = 0;</code></td>
            <td>Declared with the <code>abstract</code> keyword and without a body: <code>abstract void func();</code></td>
        </tr>
        <tr>
            <td>Instantiation</td>
            <td>Cannot be instantiated directly. Can only be used as a base class.</td>
            <td>Cannot be instantiated directly. Can only be used as a base class.</td>
        </tr>
        <tr>
            <td>Constructors</td>
            <td>Can have constructors, which can be called by derived classes.</td>
            <td>Can have constructors, which can be called by derived classes.</td>
        </tr>
        <tr>
            <td>Implementation of Abstract Methods</td>
            <td>Derived classes must implement all pure virtual functions.</td>
            <td>Subclasses must implement all abstract methods unless the subclass is also abstract.</td>
        </tr>
        <tr>
            <td>Multiple Inheritance</td>
            <td>Supports multiple inheritance through multiple base classes.</td>
            <td>Supports single inheritance but can implement multiple interfaces.</td>
        </tr>
        <tr>
            <td>Keyword for Inheritance</td>
            <td>Inherited using the <code>:</code> symbol.</td>
            <td>Inherited using the <code>extends</code> keyword.</td>
        </tr>
    </table>
</body>
</html>

<h2>⁡⁣⁢⁣6.What is Derived Class?⁡</h2><br>
<!DOCTYPE html>
<html>
<head>
    <title>Derived Classes in Java and C++</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid black;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <h3>Definition of Derived Classes</h3>
    <p>
        <strong>Derived Class in C++:</strong> 
        A derived class in C++ is a class that is created from another class, known as the base class or parent class. 
        The derived class inherits properties and behaviors (member variables and member functions) from the base class and can extend or override them as needed.
    </p>
    <p>
        <strong>Derived Class in Java:</strong> 
        In Java, a derived class is referred to as a subclass. 
        It is a class that inherits properties and behaviors from another class, known as the superclass or parent class. 
        Java supports single inheritance, meaning a subclass can inherit from only one superclass, but it can implement multiple interfaces.
    </p>
    <h3>Differences Between Derived Classes in C++ and Java</h3>
    <table>
        <tr>
            <th>Criteria</th>
            <th>C++</th>
            <th>Java</th>
        </tr>
        <tr>
            <td>Inheritance Syntax</td>
            <td>Uses the colon (<code>:</code>) to indicate inheritance.</td>
            <td>Uses the keyword <code>extends</code> to indicate inheritance.</td>
        </tr>
        <tr>
            <td>Multiple Inheritance</td>
            <td>Supports multiple inheritance.</td>
            <td>Supports single inheritance (one class can only extend one superclass).</td>
        </tr>
        <tr>
            <td>Interface Implementation</td>
            <td>Separate concept of interfaces; classes can implement multiple interfaces.</td>
            <td>Uses interfaces for multiple inheritance of type only (no multiple inheritance of implementation).</td>
        </tr>
        <tr>
            <td>Access Modifiers</td>
            <td>Supports access specifiers for inherited members (public, protected, private).</td>
            <td>Uses access modifiers for inherited members (public, protected, private).</td>
        </tr>
        <tr>
            <td>Constructor Inheritance</td>
            <td>Constructors are not inherited but are called explicitly from the derived class.</td>
            <td>Constructors are not inherited but are called explicitly from the derived class.</td>
        </tr>
        <tr>
            <td>Final Classes and Methods</td>
            <td>Can use the <code>final</code> keyword to prevent a class from being subclassed or a method from being overridden.</td>
            <td>Uses the <code>final</code> keyword similarly to prevent a class from being subclassed or a method from being overridden.</td>
        </tr>
        <tr>
            <td>Abstract Classes</td>
            <td>Uses abstract classes with pure virtual functions for defining interfaces.</td>
            <td>Uses abstract classes with abstract methods for defining interfaces.</td>
        </tr>
    </table>
</body>
</html>

<h2>⁡⁣⁢⁣7.What is a Inline Function?⁡</h2><br>

<h2>⁡⁣⁢⁣⁡⁣⁢⁡⁣⁢⁣8.Can Virtual function can be set to private?⁡⁡</h2><br>
<!DOCTYPE html>
<html>
<head>
    <title>Inline Functions in Java and C++</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid black;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <h3>Definition of Inline Functions</h3>
    <p>
        <strong>Inline Function in C++:</strong> 
        In C++, an inline function is a function that is expanded in-line at the point of call rather than being called through a function call mechanism. 
        It is typically used to optimize code execution by reducing function call overhead and is defined using the <code>inline</code> keyword.
    </p>
    <p>
        <strong>Inline Function in Java:</strong> 
        In Java, methods are not explicitly declared as inline. 
        Instead, the Java Virtual Machine (JVM) dynamically optimizes the code, including possibly inlining methods during runtime execution. 
        Java provides no direct control over method inlining as in C++.
    </p>
    <h3>Differences Between Inline Functions in C++ and Java</h3>
    <table>
        <tr>
            <th>Criteria</th>
            <th>C++</th>
            <th>Java</th>
        </tr>
        <tr>
            <td>Keyword for Inlining</td>
            <td>Uses the <code>inline</code> keyword to hint the compiler to inline the function.</td>
            <td>Methods are not explicitly marked as inline; JVM may dynamically inline methods.</td>
        </tr>
        <tr>
            <td>Control Over Inlining</td>
            <td>Provides direct control over inlining through the <code>inline</code> keyword.</td>
            <td>No direct control over method inlining; JVM handles optimizations at runtime.</td>
        </tr>
        <tr>
            <td>Optimization Purpose</td>
            <td>Primarily used for optimizing performance by reducing function call overhead.</td>
            <td>JVM optimizes code dynamically, including potential inlining based on runtime conditions.</td>
        </tr>
        <tr>
            <td>Function Call Overhead</td>
            <td>Reduces function call overhead by expanding the function body at the call site.</td>
            <td>Methods are typically called through the JVM's method invocation mechanism.</td>
        </tr>
        <tr>
            <td>Usage</td>
            <td>Commonly used for small, frequently called functions to improve performance.</td>
            <td>Emphasizes maintainability and platform independence rather than low-level optimizations.</td>
        </tr>
        <tr>
            <td>Compiler Behavior</td>
            <td>Compiler may choose not to inline a function even if marked with <code>inline</code> keyword.</td>
            <td>JVM dynamically optimizes code, including potential inlining during runtime.</td>
        </tr>
    </table>
</body>
</html>
