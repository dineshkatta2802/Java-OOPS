<h1>Encapsulation</h2>
<h2>Differnce between Encapsulation and Abstraction</h2>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Encapsulation vs Abstraction</title>
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
    <h2>Encapsulation vs Abstraction</h2>
    <table>
        <tr>
            <th>Aspect</th>
            <th>Encapsulation</th>
            <th>Abstraction</th>
        </tr>
        <tr>
            <td>Definition</td>
            <td>Encapsulation is the bundling of data (variables) and methods (code that operates on the data) into a single unit (class), and restricting access to some of the object's components.</td>
            <td>Abstraction refers to the concept of hiding the complex implementation details and showing only the essential features of the object. It focuses on what the object does rather than how it does it.</td>
        </tr>
        <tr>
            <td>Why</td>
            <td>To protect an object's state from unwanted access and modification, and to improve code maintainability and flexibility by hiding implementation details.</td>
            <td>To simplify complexity by providing a simplified and generalized interface that hides the complexities of the underlying implementation.</td>
        </tr>
        <tr>
            <td>Purpose</td>
            <td>Protects an object's internal state, improves modularity, and promotes code reusability.</td>
            <td>Simplifies complexity, reduces code duplication, and enhances maintainability by providing a clear separation between interface and implementation.</td>
        </tr>
        <tr>
            <td>Differences</td>
            <td>
                <ul>
                    <li>Focuses on bundling data and methods into a single unit.</li>
                    <li>Controls access to the internal state of an object.</li>
                    <li>Uses access modifiers (e.g., private, public) to restrict or allow access.</li>
                    <li>Example: Using private variables and public getter/setter methods in a class.</li>
                </ul>
            </td>
            <td>
                <ul>
                    <li>Focuses on hiding implementation details and showing only essential features.</li>
                    <li>Provides a clear interface for interaction, hiding the complex implementation.</li>
                    <li>Uses abstract classes and interfaces to achieve abstraction.</li>
                    <li>Example: Interface in Java defining methods without implementation details.</li>
                </ul>
            </td>
        </tr>
        <tr>
            <td>Example and Output</td>
            <td colspan="2">
                <p><strong>Example of Encapsulation:</strong></p>
                <pre><code>
public class Person {
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
                </code></pre>
                <p><strong>Output:</strong></p>
                <pre><code>
Name: John Doe
Age: 30
                </code></pre>

                <p><strong>Example of Abstraction:</strong></p>
                <pre><code>
public interface Animal {
    void makeSound();
}

public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.makeSound();
    }
}
                </code></pre>
                <p><strong>Output:</strong></p>
                <pre><code>
Bark
                </code></pre>
            </td>
        </tr>
    </table>
</body>
</html>
