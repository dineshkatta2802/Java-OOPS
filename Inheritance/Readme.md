<h2>⁡⁣⁣⁢Inheritance⁡</h2>
<br>
Inheritance is the one of the method through which we can actually relate an object of a class
It's IS-A relationship which is parent shild relationship.
<br>
Deriving a new class from existing class such that the new class aquire all the features of existing classes is called Inheritance
<br>
<hr>
<h3><u>Key points in java</u>⁡</h3><br>
<u>⁡⁣⁣⁢Super class and sub class:⁡</u><br>
The superclass (or parent class) is the class whose properties and methods are inherited by another class.<br>
The subclass (or child class) is the class that inherits the properties and methods from the superclass.<br>
<pre>
<u>Syntax:</u>
⁡⁣⁢⁣class Superclass {
    // fields and methods
}

class Subclass extends Superclass {
    // additional fields and methods
}⁡
</pre>
<pre>
⁡⁣⁣⁢Note:⁡<br>
Subclasses inherit all <u>⁡⁣⁢⁣public and protected</u>⁡ members of the superclass. Private members are not directly accessible but can be accessed through public or protected getter and setter methods.<br>
Withe the help of <u>⁡⁣⁢⁣"Super"</u>⁡ Keyword we can access the super(parent) class methods and constructors<br>
</pre>
<hr>
Why do we use Inheritance?<br>
Code Reusability<br>
Polymorphism-Runtime Polymorphism,Method Overriding<br>
Encapsulation and Abstraction<br>
<hr>
Can OOP's Exists without Inheritance?<br>
Yes, OOP can exist without inheritance by using encapsulation, abstraction, and polymorphism through interfaces and<br>composition. These principles enable robust object-oriented design without requiring a class hierarchy.<br>
<hr>
There are several types of inheritance
<ol>
<li>Single Inheritance</li>
<li>Multiple Inheritance</li>
<li>Multilevel Inheritance</li>
<li>Hirerarchial Inheritance</li>
</ol><br>
Java doesnot support Multiple Inheritance<br>
<hr>
Why Multiple Inheritance is not supported by java?

<hr>
<h2>⁡⁣⁢⁣Limitations of Inheritance?⁡</h2><br>
1.Tight Coupling:<br> Inheritance creates strong dependencies between classes.<br>
2.Fragile Base Class Problem:<br> Changes in a superclass can break subclasses.<br>
3.Limited Scope for Reuse:<br> Inheritance only supports "is-a" relationships.<br>
4.Single Inheritance Limitation:<br> Java does not support multiple inheritance.<br>
5 Increased Complexity:<br> Deep hierarchies make code harder to understand.<br>
6.Liskov Substitution Principle Violations:<br> Subclasses might not behave as expected from their superclass.<br>

