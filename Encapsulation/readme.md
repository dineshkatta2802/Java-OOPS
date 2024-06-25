<h1>Encapsulation</h2>
<h2>Differnce between Encapsulation and Abstraction</h2>

<table>
    <tr>
        <th>Aspect</th>
        <th>Encapsulation</th>
        <th>Abstraction</th>
    </tr>
    <tr>
        <td>Definition</td>
        <td>Encapsulation is the technique of bundling data (variables) and methods that operate on the data into a single unit, and restricting access to some of the object's components.</td>
        <td>Abstraction is the process of hiding the implementation details and showing only the functionality to the user.</td>
    </tr>
    <tr>
        <td>Example</td>
        <td>
            <pre>
public class Person {
    private String name;
    private int age;
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}
            </pre>
        </td>
        <td>
            <pre>
abstract class Animal {
    abstract void makeSound();
}
class Dog extends Animal {
    void makeSound() { System.out.println("Bark"); }
}
class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();
    }
}
            </pre>
        </td>
    </tr>
    <tr>
        <td>Why</td>
        <td>To protect the object's state by preventing unauthorized access and modification.</td>
        <td>To reduce complexity by hiding unnecessary details and exposing only the essential features.</td>
    </tr>
    <tr>
        <td>Purpose</td>
        <td>To achieve data hiding and to protect the integrity of the data within an object.</td>
        <td>To provide a clear and simple interface for complex systems, making them easier to understand and use.</td>
    </tr>
    <tr>
        <td>Output</td>
        <td>
            <pre>
Name: John Doe
Age: 30
            </pre>
        </td>
        <td>
            <pre>
Bark
            </pre>
        </td>
    </tr>
</table>

