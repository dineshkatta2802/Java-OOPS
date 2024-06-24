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
