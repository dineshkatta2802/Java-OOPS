<h1>Some important Quetsions for Interview?</h1><br>

<h2>⁡⁣⁢⁣1.Can OOPS exist Without Inheritance⁡</h2><br>
Yes, object-oriented programming (OOP) can exist without inheritance. Inheritance is just one feature of OOP where a class can inherit attributes and methods from another class. OOP can still utilize other fundamental concepts like encapsulation, polymorphism, and abstraction without inheritance. However, inheritance can often provide a convenient way to model relationships between classes and reuse code.<br>

<h2>⁡⁣⁢⁣2.Give a Real life example of Multiple Inheritance⁡</h2><br>
// Parent class 1<br>
class Engine {<br>
    public void start() {<br>
        System.out.println("Engine started");<br>
    }<br>
<br>
    public void stop() {<br>
        System.out.println("Engine stopped");<br>
    }<br>
}<br>
<br>
// Parent class 2<br>
class Electric {<br>
    public void charge() {<br>
        System.out.println("Electric vehicle charging");<br>
    }<br>
}<br>
<br>
// Child class inheriting from Engine and Electric<br>
class HybridCar extends Engine, Electric {<br>
    public void drive() {<br>
        System.out.println("Hybrid car driving");<br>
    }<br>
}<br>
<br>
public class Main {<br>
    public static void main(String[] args) {<br>
        // Creating an instance of HybridCar<br>
        HybridCar myCar = new HybridCar();<br>
<br>
        // Using methods from both parent classes<br>
        myCar.start();   // Output: Engine started<br>
        myCar.charge();  // Output: Electric vehicle charging<br>
    }<br>
}<br>

<h2>⁡⁣⁢⁣3.What is a Sealed Modifier?⁡</h2><br>
In programming languages like Java the "Sealed Modifiers" are used to restrict the Inheritance of the class<br>
ex:<br>
Final Keyword is used in Java instead of 'Sealed'<br>
When a class is declared final, it means that it cannot be subclassed (no other class can inherit from it). This prevents extension of the class hierarchy beyond that point.<br>
<br><br>
final class FinalClass {<br>
    // Class implementation<br>
}<br>
<br>
// Cannot subclass FinalClass because it is final<br>
// class SubClass extends FinalClass { } // This will result in a compilation error<br>

<h2>⁡⁣⁢⁣4.⁡⁡⁣⁢⁣How can we call a Base Method without creating an Instance(Object)?⁡</h2><br>
Sure! Here’s how you can call a base method in Java using both static and instance methods.<br>

<h3>⁡⁢⁣⁣Calling a static method:⁡</h3><br>
You can call a static method of the base class directly using the class name without creating an instance.<br>
<br>
class BaseClass {<br>
    public static void staticMethod() {<br>
        System.out.println("BaseClass static method");<br>
    }<br>
}<br>
<br>
public class Main {<br>
    public static void main(String[] args) {<br>
        BaseClass.staticMethod();  // Calling the static method directly<br>
    }<br>
}<br>

<h3>⁡⁢⁣⁣Calling an instance method from a subclass:⁡</h3><br>
To call an instance method from the base class in a subclass, you use the `super` keyword within an instance method of the subclass.<br>
<br>
class BaseClass {<br>
    public void instanceMethod() {<br>
        System.out.println("BaseClass instance method");<br>
    }<br>
}<br>
<br>
class SubClass extends BaseClass {<br>
    public void callBaseInstanceMethod() {<br>
        super.instanceMethod();  // Calling the instance method of the base class<br>
    }<br>
}<br>
<br>
public class Main {<br>
    public static void main(String[] args) {<br>
        SubClass sub = new SubClass();<br>
        sub.callBaseInstanceMethod();  // Calling the method in the subclass that calls the base class method<br>
    }<br>
}<br>

<h2>⁡⁣⁢⁣5.What is the diffrence between New and Override?⁡</h2><br>

<h3>⁡⁢⁣⁣Method Overriding:⁡</h3><br>
- Subclass provides a specific implementation of a non-static method from the superclass.<br>
- Uses the `@Override` annotation.<br>
- Allows the subclass method to be called via a superclass reference.<br>
- Example:<br>
  @Override<br>
  public void display() { /* ... */ }<br>
<br>
<h3>⁡⁢⁣⁣Method Hiding:⁡</h3><br>
- Subclass defines a static method with the same signature as a static method in the superclass.<br>
- Does not use the `@Override` annotation.<br>
- The superclass method is called via superclass reference, and subclass method via subclass reference.<br>
- Example:<br>
  public static void display() { /* ... */ };<br>

  <h2>⁡⁣⁢⁣6.Why does Java doesnot support Multiple Inheritance⁡</h2><br>
  Java does not support multiple inheritance of classes to avoid the complexity and ambiguity that arise from it. Here are the key reasons simplified:<br>
<br>
<h3>⁡⁢⁣⁣Diamond Problem:⁡</h3><br>
⁡⁢⁣⁣Ambiguity:⁡ <br>
If two classes have a method with the same name, and a third class inherits from both, it’s unclear which method to use. This is known as the diamond problem.<br>
Example: <br>
  class A { void show() {} }<br>
  class B extends A { void show() {} }<br>
  class C extends A { void show() {} }<br>
  class D extends B, C { }  // Which show() should D inherit?<br>
<br>
⁡⁢⁣⁣Complexity:⁡<br>
Code Complexity: Managing multiple inheritance can make the code more complex and harder to maintain.<br>
Example: Handling state and behavior from multiple parent classes can lead to intricate and error-prone code.<br>
<br>
<h3>⁡⁢⁣⁣Alternatives in Java:⁡</h3><br>
⁡⁢⁣⁣Interface:⁡<br>
 Java allows a class to implement multiple interfaces, providing a way to achieve multiple inheritance of type without the issues of multiple inheritance of implementation.<br>
Example:<br>
  interface A { void show(); }<br>
  interface B { void display(); }<br>
  class C implements A, B {<br>
      public void show() { /* ... */ }<br>
      public void display() { /* ... */ }<br>
  }<br>
<br>
By using interfaces, Java provides a way to achieve similar functionality without the complications associated with multiple inheritance of classes.<br>

<h2>⁡⁣⁢⁣7.If class A inherits from class B,then what are all the things that the class A Inherits from class B?⁡</h2><br>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Inheritance in Java</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
            margin-bottom: 20px;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>

<h2>Inherited and Not Inherited Aspects in Java Class Inheritance</h2>

<table>
    <thead>
        <tr>
            <th>Inherited from Parent Class</th>
            <th>Not Inherited from Parent Class</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>
                <ul>
                    <li>Fields (Variables):
                        <ul>
                            <li>Non-private fields and methods (default, protected, public)</li>
                            <li>Private fields and methods can be accessed via public/protected methods in superclass</li>
                        </ul>
                    </li>
                    <li>Methods:
                        <ul>
                            <li>Non-private methods (includes constructors, regular methods, static methods)</li>
                        </ul>
                    </li>
                    <li>Nested Classes:
                        <ul>
                            <li>Nested classes of the superclass are inherited</li>
                        </ul>
                    </li>
                    <li>Interfaces Implemented by Superclass:
                        <ul>
                            <li>Interfaces implemented by the superclass</li>
                        </ul>
                    </li>
                </ul>
            </td>
            <td>
                <ul>
                    <li>Private Members:
                        <ul>
                            <li>Fields and methods declared as private in the superclass</li>
                        </ul>
                    </li>
                    <li>Constructors:
                        <ul>
                            <li>Constructors are not inherited; each subclass defines its own</li>
                        </ul>
                    </li>
                    <li>Static Members:
                        <ul>
                            <li>Static fields and methods are inherited, resolved at compile time</li>
                            <li>Resolved based on reference type, not object type</li>
                        </ul>
                    </li>
                    <li>Initializer Blocks:
                        <ul>
                            <li>Instance and static initializer blocks are not inherited</li>
                        </ul>
                    </li>
                    <li>Final Members:
                        <ul>
                            <li>Final fields and methods can be inherited but not modified</li>
                        </ul>
                    </li>
                </ul>
            </td>
        </tr>
    </tbody>
</table>

</body>
</html>

<h2>⁡⁣⁢⁣8.What is Object Slicing⁡</h2><br>
Object Slicing in C++:<br>

What happens:<br>
When you assign a derived class object to a base class object, only the base class part of the object is copied. Any additional data or behavior specific to the derived class is lost.<br>
Example:<br>
⁡⁢⁣<h3>⁣Object Slicing in C++:</h3>⁡<br>
<br>
class Base {<br>
public:<br>
    int baseValue;<br>
};<br>
<br>
class Derived : public Base {<br>
public:<br>
    int derivedValue;<br>
};<br>
<br>
int main() {<br>
    Derived d;<br>
    d.baseValue = 1;<br>
    d.derivedValue = 2;<br>
<br>
    Base b = d; // Object slicing occurs here<br>
    // b.baseValue = 1 (copied from d), but b has no derivedValue<br>
<br>
    return 0;<br>
}<br>
<br>
 <h3>⁡⁢⁣⁣Object Slicing in Java:⁡⁡</h3><br>
<br>
Difference: Java does not have object slicing in the same way because of how it handles objects and inheritance.<br><br>
Example:<br>
class Base {<br>
    int baseValue;<br>
}<br>
<br>
class Derived extends Base {<br>
    int derivedValue;<br>
}<br>
<br>
public class Main {<br>
    public static void main(String[] args) {<br>
        Derived d = new Derived();<br>
        d.baseValue = 1;<br>
        d.derivedValue = 2;<br>
<br>
        Base b = d; // No object slicing in Java<br>
        // b.baseValue = 1 (same as d.baseValue)<br>
        // b cannot access d.derivedValue directly<br>
<br>
        System.out.println(b.baseValue); // Outputs 1<br>
        // System.out.println(b.derivedValue); // Error in Java, b doesn't have derivedValue<br>
<br>
    }<br>
}<br>
<br>
<h3>⁡⁢⁣⁣Simplified Explanation:⁡</h3><br>
<br>
<h3>⁡⁢⁣⁣C++:⁡</h3><br>
Object slicing happens when you copy a derived class object into a base class object, causing the loss of derived class-specific data.<br>
  <br>
<h3>⁡⁢⁣⁣Java:⁡</h3><br>
Object slicing isn't a concern because Java objects are referenced by their actual type, even when referenced by a superclass type. This means you can assign a `Derived` object to a `Base` reference, but you can only access members defined in `Base`.<br>
<br>
In essence, object slicing is a concept specific to C++ due to its handling of object copying and inheritance, whereas Java's approach with references and inheritance means this concept doesn't apply in the same way.<br>

<h2>⁡⁣⁢⁣9.How to hide Base Class Methods in Java?⁡</h2><br>
In Java, you cannot directly "hide" base class methods in the same way you might in languages like C++ using the `private` keyword for methods in the base class. However, you can achieve similar effects using method overriding and access modifiers. Here are a few approaches:<br>
<br>
<h3>⁡⁢⁣⁣Method Overriding⁡</h3><br>
<br>
In Java, if you have a method in a base class (superclass) that you want to "hide" in a subclass (derived class), you can use method overriding. Method overriding allows a subclass to provide a specific implementation of a method that is already defined in its superclass.<br>
<br>
class Base {<br>
    public void display() {<br>
        System.out.println("Base class method");<br>
    }<br>
}<br>
<br>
class Derived extends Base {<br>
    @Override<br>
    public void display() {<br>
        System.out.println("Derived class method");<br>
    }<br>
}<br>
<br>
public class Main {<br>
    public static void main(String[] args) {<br>
        Base b = new Base();<br>
        b.display(); // Output: "Base class method"<br>
<br>
        Derived d = new Derived();<br>
        d.display(); // Output: "Derived class method"<br>
<br>
        Base bd = new Derived(); // Polymorphic assignment<br>
        bd.display(); // Output: "Derived class method" (dynamic dispatch)<br>
    }<br>
}<br>
<br>
In this example:<br>
The `display()` method in `Derived` overrides the `display()` method in `Base`.<br>
When you call `display()` on an object of `Derived`, it executes the method from `Derived`, not from `Base`.<br>
<br>
<h3>⁡⁢⁣⁣Access Modifiers⁡</h3><br>
<br>
Another approach to controlling method visibility is through access modifiers (`public`, `protected`, `private`, and default access). By using `private` or `protected` access modifiers in the base class, you can restrict access to methods in subclasses:<br>
<br>
class Base {<br>
    protected void display() {<br>
        System.out.println("Base class method");<br>
    }<br>
}<br>
<br>
class Derived extends Base {<br>
    @Override<br>
    protected void display() {<br>
        System.out.println("Derived class method");<br>
    }<br>
}<br>
<br>
public class Main {<br>
    public static void main(String[] args) {<br>
        Base b = new Base();<br>
        b.display(); // Compilation error: display() has protected access in Base<br>
<br>
        Derived d = new Derived();<br>
        d.display(); // Output: "Derived class method"<br>
<br>
        Base bd = new Derived();<br>
        bd.display(); // Output: "Derived class method"<br>
    }<br>
}<br>
<br>
In this example:<br>
- The `display()` method in `Base` is `protected`, so it is accessible within `Base` and its subclasses like `Derived`.<br>
- Attempting to call `b.display()` directly in `Main` results in a compilation error because `display()` is not accessible from outside `Base` or its subclasses.<br>
<br>
<h3>Conclusion:</h3><br>
While Java does not have a direct mechanism to "hide" methods from a superclass in the same way C++ can with `private` methods, you can achieve similar behavior through method overriding and access modifiers (`protected` or `private` for inner classes). Method overriding allows you to provide specialized implementations in subclasses, and access modifiers help control visibility and access levels. These mechanisms together enable you to effectively manage method visibility and behavior in Java class hierarchies.<br>