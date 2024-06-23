<h1>Some Important Questions for Interview on Polymorphism</h1><br>

<h2>1.Differentiate between Staticand Dynamic polymorphism(Compile-time polymorphism and Runtime Plymorphism)?</h2><br>
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
