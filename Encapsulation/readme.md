<h1>Encapsulation</h2>
Wrapping up of data under a single unit.<br>
Java Encapsulation is a way of hiding the implementation details of a class from outside access and only exposing a public interface that can be used to interact with the class.<br>
It is achieved by declaring the instance variables of a class as private, which means they can only be accessed within the class<br>
<h2>Differnce between Encapsulation and Abstraction</h2>
<table>
    <tr>
        <th>Aspect</th>
        <th>Encapsulation</th>
        <th>Abstraction</th>
    </tr>
    <tr>
        <td>Definition</td>
        <td>Bundling data and methods that operate on the data into a single unit, and restricting access to some of the object's components.</td>
        <td>Hiding the complex implementation details of a class and showing only the essential features of the object.</td>
    </tr>
    <tr>
        <td>What</td>
        <td>Data and methods are encapsulated into a class.</td>
        <td>Essential features of an object are abstracted.</td>
    </tr>
    <tr>
        <td>Where</td>
        <td>Class level</td>
        <td>Class level</td>
    </tr>
    <tr>
        <td>How</td>
        <td>Using access modifiers (private, public, protected) to restrict access to data.</td>
        <td>Using abstract classes and interfaces to achieve abstraction.</td>
    </tr>
    <tr>
        <td>When</td>
        <td>Used when data hiding and restricting direct access to data is required.</td>
        <td>Used when we want to hide complex implementation details and provide a simplified interface.</td>
    </tr>
    <tr>
        <td>Why</td>
        <td>To improve security, maintainability, and flexibility of code.</td>
        <td>To simplify the complexities and focus on essential features of an object.</td>
    </tr>
    <tr>
        <td>Purpose</td>
        <td>Protecting an object's internal state, achieving information hiding, and improving code maintainability.</td>
        <td>Providing a simple and understandable view of objects and systems.</td>
    </tr>
    <tr>
        <td>Advantages</td>
        <td>
            <ul>
                <li>Enhanced security</li>
                <li>Improved maintainability</li>
                <li>Flexibility to change implementation</li>
            </ul>
        </td>
        <td>
            <ul>
                <li>Focus on essential details</li>
                <li>Reduced complexity</li>
                <li>Enhanced reusability</li>
            </ul>
        </td>
    </tr>
    <tr>
        <td>Disadvantages</td>
        <td>
            <ul>
                <li>Increased development time due to defining accessors and mutators</li>
                <li>Potential overhead in performance due to method calls</li>
            </ul>
        </td>
        <td>
            <ul>
                <li>May lead to over-simplification and loss of details</li>
                <li>Requires careful design to avoid excessive abstraction</li>
            </ul>
        </td>
    </tr>
</table>

<h3>Example</h3>

<p>Here's a simple Java example demonstrating encapsulation:</p>

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

<p><strong>Output:</strong></p>
<pre>
<code>
Radius: 5.0
Area: 78.53981633974483
</code>
</pre>



