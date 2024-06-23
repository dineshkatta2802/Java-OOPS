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