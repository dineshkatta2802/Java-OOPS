<h1>Some important Quetsions for Interview?</h1><br>

<h2>1.Can OOPS exist without Inheritance</h2><br>
Yes, object-oriented programming (OOP) can exist without inheritance. Inheritance is just one feature of OOP where a class can inherit attributes and methods from another class. OOP can still utilize other fundamental concepts like encapsulation, polymorphism, and abstraction without inheritance. However, inheritance can often provide a convenient way to model relationships between classes and reuse code.<br>

<h2>2.Real life example of Multiple Inheritance</h2><br>
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
