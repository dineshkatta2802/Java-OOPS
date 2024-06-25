<h1>⁡⁣⁢⁣Type Casting in Java⁡</h1>

Converting one datatype to another datatype is called Type Casting or simple Casting.<br>
We know that in Java we have 2 typed of datatypes:<br>
<ol>
<li>Pimitive datatype</li>
<li>Refernced or Advanced Datatypes</li>
</ol>
<br>

<h2>⁡⁣⁢⁣Casting Primitive Datatypes:⁡</h2>
Casting of Primitive Datatypes is categorized into 2 types:<br>
<ol>
<li>Implict Casting(Automatic/Widening Casting)</li>
<ul>
<li>Converting Lower datatype to Higher Datatype</li>
</ul>
<li>Explict Casting(Narrow Casting)</li>
<ul>
<li>Converting Higher datatype to Lower Datatype</li>
</ul>
</ol>
<br>

Primitives datatypes are also classified into 2 more type they are:
<ol>
<li>Lower types-Less memory and represent less digits</li>
<li>Higher types-More memory and represent more digits</li>
</ol>
<br>

<h3>⁡⁢⁣⁣Hierarchy of Primitive Datatypes:⁡</h3>
<h3>byte -> short -> char -> int -> long -> float -> double</h3>
Lower<--------------------------------------------------------------->Higher<br>

<h3>Widening or Automatic or Implict Casting:</h3>
Java automatically handles this conversion without requiring explicit syntax<br>
This type of casting is safe because no data is lost.<br>
Example:<br>
int a = 10;<br>
double b = a;  Implicit casting from int to double<br>

<h4>⁡⁢⁣⁡⁣⁣⁢Types of Implicit Casting:⁡⁡</h4>
byte to short, int, long, float, double<br>
short to int, long, float, double<br>
char to int, long, float, double<br>
int to long, float, double<br>
long to float, double<br>
float to double<br>

<h3>⁡⁢⁣⁣Narrowing or Explict Casting:⁡</h3>
This type of casting must be explicitly specified in the code to inform the compiler of the developer’s intent.<br>
Explicit casting can potentially lose data or cause precision issues, so it should be used with caution.<br>
Example:<br>
double x = 10.5;<br>
int y = (int) x;  Explicit casting from double to int<br>

<h4>⁡⁣⁣⁢Types of Explicit Casting:⁡⁡</h4>
double to float, long, int, short, byte<br>
float to long, int, short, byte<br>
long to int, short, byte<br>
int to short, byte<br>
short to byte<br>



<h2>⁡⁣⁢⁣Casting Referenced or Advanced Datatypes:⁡⁡</h2>
Here a "Class" is a  Reference Datatype<br>
Converting one  Class to another is also possibele but the "Classes should have some kind of relation i.e, thet can be Inherited".<br>
Consider,<br>
<ul>
<li>Fruit
<ul>
<li>Citrus
<ul>
<li>Lemon</li>
<li>Orange</li>
</ul>
</li>
<li>Non-Citrus
<ul>
<li>Banana</li>
<li>Mango</li></ul>
</li>
</ul>
</li>
</ul>
<br>
When we talk about the "Fruit" we are basically generalise all the fruits which fall under the Fruit Category,So here the Scope is "Widended"<br>
Whereas when talk about a specifically about some type of fruits like which are Citrus we actually come down to being specific eliminating other types<br>
This means that when we move from SuperClass to SubClass we become more speciifc.<br>
So just like the Type Casting in primitive type, we have 2 types in which the Refrenced Datatypes can be Casted<br>
<ol><li>Generalization</li>
<li>Specialisation</li></ol>
<br>
<h3>Generalisation:</h3>
It is the phenomenon in which a subclass is promoted to super class  and hence becoem generalise and safer.<br>
It is also called Upcasting or Widening.<br>
It's scope is Widening.<br>
Example:<br>
If we say lemon a s a fruit, there will no objection and the java compiler do the Implict Casting  and doesnot ask for cast operator.<br>
<h3>Specialization</h3>
It is  the phenomenon in which a Super class is converted to Sub class and hence become Specific and it not safe.<br>
It is also called Sowncasting or Narrowing.<br>
It's scope is Narrowing.<br>
Example:<br>
If we have to say fruit is a citrus fruit the java compiler asks to use Cast Operator specifically and we become more specific and we need to do Explict Casting.<br>

<h2>⁡⁢⁣⁣Note:⁡⁡</h2>
The method names should be same in Super and Subclass to call

<h2>⁡⁣⁢⁣Generalization of Objects⁡</h2>
package Type_Casting;<br>
We know that for Typcasting objects we need some relation betweeSn two classes<br>
like Inheritance<br>
//⁡⁣⁢⁣Super Class⁡<br>
class Animal{<br>
    void makesound(){<br>
        System.out.println("Animals eat!");<br>
    }<br>
    }<br>
    <br>
//⁡⁣⁢⁣Subclass⁡<br>
    class Dog extends Animal{<br>
        @Override<br>
    void makesound(){<br>
        System.out.println("Woof! Woof!");<br>
    }<br>
    }<br>
public class Widening_Object {<br>
<br>
    public static void main(String[] args) {<br>
        Dog Terex = new Dog();<br>
        Animal myAnimal = Terex;//Upcast to Animal<br>
        myAnimal.makesound();<br>
    }<br>
<br>
}<br>

<h2>⁡⁢⁣⁣Imp Note:⁡</h2>
Assigning the sub class object "Dog" to the variable of super class<br>
here we make the Object of Sublass and Object of super class same<br>
Now,calling subclass method with superclass Object<br>
The method names should be same in Super and Sub class<br>
<br>
The above Declaration of object can also be done in the following way<br>
Animal myAnimal = new Dog();<br>
myAnimal.makesound();<br>


<h2>⁡⁢⁣⁣Note:⁡</h2>
The above Declaration of object can also be done in the following way<br>
Dog Terex = new Dog();<br>
Assigning the sub class object "Dog" to the variable of super class<br>
Animal myAnimal = Terex;//Upcast to Animal<br>
here we make the Object of Sublass and Object of super class same<br>
Now,calling subclass method with superclass Object<br>
<br>
The method names should be same in Super and Sub class<br>
myAnimal.makesound();<br>


<h2>⁡⁣⁢⁣Specialization of Objects⁡</h2>
package Type_Casting;<br>
//We know that for Typcasting objects we need some relation between two classes<br>
//like Inheritance<br>
//⁡⁣⁢⁣Super Class⁡<br>
class Animal{<br>
    void makesound(){<br>
        System.out.println("Animals eat!");<br>
    }<br>
    }<br>
    <br>
//⁡⁣⁢⁣Subclass⁡<br>
    class Dog extends Animal{<br>
        @Override<br>
    void makesound(){<br>
        System.out.println("Woof! Woof!");<br>
    }<br>
<br>
    void fetch(){<br>
        System.out.println("fetch Balls");<br>
    }<br>
    }<br>
public class Narrowing_Object {<br>
<br>
    public static void main(String[] args) {<br>
        Animal myAnimal = new Dog();<br>
        myAnimal.makesound();<br>
        if (myAnimal instanceof Dog) {<br>
            Dog myDog = (Dog) myAnimal; // Downcasting<br>
            myDog.fetch(); // Outputs: Fetches ball<br>
        }<br>
    }<br>
<br>
}

<h2>⁡⁢⁣⁣Imp Note:⁡</h2>
Since we know that the DownCasting is "not safe"<br>
"Instance of" operator checks the if 'myAnimal' is actually the object of class 'Dog<br>
If the check passes, myAnimal is downcast to Dog using (Dog) myAnimal;<br>
This explicit cast allows us to treat myAnimal as a Dog.<br>
Now that myAnimal is downcast to Dog, we can call myDog.fetch()<br>
a method specific to the Dog class.<br>


<h2>⁡⁣⁢⁣Differentiate between Generalizationa and Specialization in java⁡</h2>
<!DOCTYPE html>
<html>
<head>
    <title>Generalization vs Specialization</title>
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

<h2>Generalization vs Specialization</h2>

<table>
    <tr>
        <th>Aspect</th>
        <th>Generalization</th>
        <th>Specialization</th>
    </tr>
    <tr>
        <td>Definition</td>
        <td>Generalization is the process of extracting common characteristics from two or more classes and combining them into a generalized superclass.</td>
        <td>Specialization is the process of creating new subclasses from an existing class, where the new subclasses inherit attributes and methods from the superclass but also add specific features.</td>
    </tr>
    <tr>
        <td>Purpose</td>
        <td>To reduce redundancy by abstracting common features (attributes and methods) into a superclass.</td>
        <td>To create specific classes that extend the functionality of the general class by adding unique attributes and methods.</td>
    </tr>
    <tr>
        <td>Direction</td>
        <td>Bottom-up</td>
        <td>Top-down</td>
    </tr>
    <tr>
        <td>Example</td>
        <td>Creating a general <code>Animal</code> class from <code>Dog</code>, <code>Cat</code>, and <code>Bird</code> classes.</td>
        <td>Creating <code>Dog</code>, <code>Cat</code>, and <code>Bird</code> classes from a general <code>Animal</code> class.</td>
    </tr>
    <tr>
        <td>Class Hierarchy</td>
        <td>General class (superclass) is at the top, specific classes (subclasses) are derived from it.</td>
        <td>Specific classes (subclasses) are at the bottom, derived from the general class (superclass) at the top.</td>
    </tr>
    <tr>
        <td>Real-world Analogy</td>
        <td>Creating a general "Vehicle" category that includes "Cars", "Bikes", and "Trucks".</td>
        <td>Starting with a general "Vehicle" and creating more specific categories like "Car", "Bike", and "Truck".</td>
    </tr>
</table>

</body>
</html>

<h2>⁡⁣⁢⁣Another Example of TypCasting⁡</h2>
// Importing input output classes<br>
import java.io.*;<br>
<br>
// Class 1<br>
// Parent class<br>
class Parent <br>
{<br>
<br>
// Function <br>
void show()<br>
{<br>
<br>
	// Print message for this class<br>
	System.out.println("Parent show method is called");<br>
}<br>
} <br>
<br>
// Class 2<br>
// Child class<br>
class Child extends Parent<br>
{<br>
<br>
	// Overriding existing method of Parent class<br>
	@Override<br>
<br>
	// Same Function which will override <br>
	// existing Parent class function<br>
	void show() <br>
	{<br>
<br>
	// Print message for this class<br>
	System.out.println("Child show method is called");<br>
	}<br>
<br>
}<br>
<br>
// Class3<br>
// Main class<br>
class GFG <br>
{<br>
<br>
	// Main driver method<br>
	public static void main(String[] args)<br>
	{<br>
	// Creating a Parent class object <br>
	// but referencing it to a Child class<br>
	Parent obj = new Child();<br>
	<br>
	// Calling the show() method to execute<br>
	obj.show();<br>
	}<br>
}<br>

<img src="https://media.geeksforgeeks.org/wp-content/uploads/20210119153952/Downcasting.jpg" alt="UpCasting and DOwncasting" width="596" height="300">

<h2>Advantages and Disadvantages of TypeCasting</h2>
    <table>
        <thead>
            <tr>
                <th>Advantages</th>
                <th>Disadvantages</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>Polymorphism: Allows objects to be treated as instances of their parent class, enabling method overriding and dynamic method invocation.</td>
                <td>Runtime Errors: Incorrect type casting can lead to <code>ClassCastException</code> at runtime.</td>
            </tr>
            <tr>
                <td>Code Reusability and Generalization: Enables methods and classes to be written in a generic way, facilitating the use of collections.</td>
                <td>Loss of Data: Casting from a larger data type to a smaller one can result in loss of information.</td>
            </tr>
            <tr>
                <td>Interoperability: Facilitates interaction between different data types, useful for integrating various systems or libraries.</td>
                <td>Code Clarity and Maintainability: Extensive use of type casting can make the code harder to read and maintain.</td>
            </tr>
            <tr>
                <td>Memory Management: Narrowing casting can save memory by converting a larger data type to a smaller one when the larger capacity is not needed.</td>
                <td>Type Safety Issues: Bypasses Java's type safety features, potentially leading to unpredictable behavior and bugs.</td>
            </tr>
            <tr>
                <td></td>
                <td>Performance Overhead: Type casting can introduce performance overhead due to additional checks and conversions.</td>
            </tr>
        </tbody>
    </table>


