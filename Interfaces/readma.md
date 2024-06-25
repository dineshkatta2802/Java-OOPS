<h1>Interfaces</h1>
It is a reference type which is similar to Class<br>
The Interface can only contain constants, method signatures, default methods, static methods, and nested types<br>
Interfaces cannot contain instance fields, constructors, or method implementations<br>
<img src="https://media.geeksforgeeks.org/wp-content/uploads/20230419112500/Intefaces-in-Java-2.webp" alt="Multiple Inheritance" width="489" height="300">

<h2>Relationship between Interfaces and Classes</h2>
<img src="https://media.geeksforgeeks.org/wp-content/uploads/20230419112343/Intefaces-in-Java-1.webp" alt="Multiple Inheritance" width="670" height="247">

<h2>Classes v/s Interface</h2>

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

