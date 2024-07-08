<h1>⁡⁣⁢⁣Wrapper class⁡</h1>
Wrapper class is a mechanism in which you can convert objects to Primitive data types and primitive types to Objects.<br>
The conversion is done using <b>"Auto-boxing and Unboxing"</b> methods.<br>

<h2>⁡⁣⁢⁣Where do we use Wrapper class⁡</h2>
<ol><li>⁡⁢⁣⁣Collections Framework/Collection API:⁡</li>
<ul><li>Collections in java like 'Arraylist','Haspmap'...etc doenot deal with primitive datatype so we need to conver the datatype to object.</li>
<li>ArrayList<Integer> numbers = new ArrayList<>();<br>
numbers.add(5); // Autoboxing converts int 5 to Integer object<br></li>
</ul>
<li>⁡⁢⁣⁣Change in value in Methods/Utility Methods:⁡</li>
<ul><li>Java supports only call by value. So, if we pass a primitive value, it will not change the original value. But, if we convert the primitive value in an object, it will change the original value.</li>
<li>int i = Integer.parseInt("123"); // Converts a String to an int</li></ul>
<li>⁡⁢⁣⁣Serialization and Synchornization/Object Methods:⁡</li>
<ul>
<li>Note:</li>
<ul><li>Serialization in Java is the concept of representing an object’s state as a byte stream. The byte stream has all the information about the object. Usually used in Hibernate, JMS, JPA, and EJB, serialization in Java helps transport the code from one JVM to another and then de-serialize it there.</li></ul>
</ul>
</ol>