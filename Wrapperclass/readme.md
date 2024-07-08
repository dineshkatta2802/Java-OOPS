<h1>⁡⁣⁢⁣Wrapper class⁡</h1>
Wrapper class is a mechanism in which you can convert objects to Primitive data types and primitive types to Objects.<br>
The conversion is done using <b>"Auto-boxing and Unboxing"</b> methods.<br>

<h2>⁡⁣⁢⁣Auto-Boxing:⁡</h2>
The automatic conversion of primitive datatype to that of the corresponding object type in Java.lang pacakge is called Auto-Boxing.<br>
Like char to Character ,byte to Bytes.<br>
Example:<br>
<pre>
public class Autoboxing {<br>
    public static void main(String[] args) {<br>
        //lets illustarte a simple example of Auto-Boxing<br>
        int x = 5;<br>
        double y = 10.23;<br>
        char z = 'D';<br>
<br>
        Integer a = x;<br>
        Double b = y;<br>
        Character c = z;<br>
<br>
        System.out.println(a);<br>
        System.out.println(b);<br>
        System.out.println(c);<br>
    }<br>
<br>
}<br>
</pre>
</style>
<h2>⁡⁣⁢⁣Un-Boxing:⁡</h2>
It is the Opposite to that of the Auto-Boxing<br>
The automatic conversion of Wrapper class to that of the  corresponding Primitive dastatype type in Java.lang pacakge is called Un-Boxing.<br>
Like char to Character ,byte to Bytes.<br>
Example:<br>
<pre>import java.nio.charset.CharacterCodingException;<br>
<br>
public class Unboxing {<br>
    public static void main(String[] args) {<br>
        //Illustatin a simple example of Un-Boxing<br>
        Integer a = 100;<br>
        Double b = 10.23;<br>
        Character c = 'X';<br>
<br>
        int x = a;<br>
        double y = b;<br>
        char z = c;<br>
<br>
        System.out.println(x);<br>
        System.out.println(y);<br>
        System.out.println(z);<br>
    }<br>
}<br>
</pre>



<h2>⁡⁣⁢⁣Where do we use Wrapper class⁡</h2>
<ol><li>⁡⁢⁣⁣Collections Framework/Collection API:⁡</li>
<ul><li>Collections in java like 'Arraylist','Haspmap'...etc doenot deal with primitive datatype so we need to conver the datatype to object.</li>
<pre>
<li>ArrayList<Integer> numbers = new ArrayList<>();<br>
numbers.add(5); // Autoboxing converts int 5 to Integer object<br></li>
</pre>
</ul>
<li>⁡⁢⁣⁣Change in value in Methods/Utility Methods:⁡</li>
<ul><li>Java supports only call by value. So, if we pass a primitive value, it will not change the original value. But, if we convert the primitive value in an object, it will change the original value.</li>
<pre>
<li>int i = Integer.parseInt("123"); // Converts a String to an int</li></ul>
</pre>
<li>⁡⁢⁣⁣Serialization and Synchornization/Object Methods:⁡</li>
<ul>
<li>⁡⁢⁢⁢Note:⁡</li>
<ul><li>Serialization in Java is the concept of representing an object’s state as a byte stream. The byte stream has all the information about the object. Usually used in Hibernate, JMS, JPA, and EJB, serialization in Java helps transport the code from one JVM to another and then de-serialize it there.</li>
<li>De-serialization is the exact opposite.</li>
<li><img src="https://media.geeksforgeeks.org/wp-content/cdn-uploads/gq/2016/01/serialize-deserialize-java.png" alt="Serialization and Deserialization" width="629" height="417"></li></ul>
<li>Java synchronization works with objects in Multithreading.</li>
</ul>
</ol>

<h2>⁡⁢⁣⁣⁡⁣⁢⁣List of Wrapper Class⁡⁡</h2>
The eight classes of the java.lang package are known as wrapper classes in Java. The list of eight wrapper classes are given below
<img src="https://media.geeksforgeeks.org/wp-content/uploads/Wrapper.png">