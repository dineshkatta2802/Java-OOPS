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

<h2>Note:</h2>
The method names should be same in Super and Subclass to call

<h2>Generalization of Objects</h2>
package Type_Casting;<br>
We know that for Typcasting objects we need some relation between two classes<br>
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
<h2>Note:</h2>
Assigning the sub class object "Dog" to the variable of super class<br>
here we make the Object of Sublass and Object of super class same<br>
Now,calling subclass method with superclass Object<br>
The method names should be same in Super and Sub class<br>
<br>
The above Declaration of object can also be done in the following way<br>
Animal myAnimal = new Dog();<br>
myAnimal.makesound();<br>