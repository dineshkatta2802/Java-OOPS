<h1>⁡⁣⁢⁣Wrapper class⁡</h1>
Wrapper class is a mechanism in which you can convert objects to Primitive data types and primitive types to Objects.<br>
The conversion is done using <b>"Auto-boxing and Unboxing"</b> methods.<br>
All the Wrapper classes are present in Java.lang.package<br>

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
<ul><pre>
<li>⁡⁢⁢⁢Note:⁡</li>
<ul><li>Serialization in Java is the concept of representing an object’s state as a byte stream.<br>
The byte stream has all the information about the object. <br>
Usually used in Hibernate, JMS, JPA, and EJB, serialization in Java helps transport the code from one JVM to another and then de-serialize it there.</li></pre>
<li>De-serialization is the exact opposite.</li>
<li><img src="https://media.geeksforgeeks.org/wp-content/cdn-uploads/gq/2016/01/serialize-deserialize-java.png" alt="Serialization and Deserialization" width="629" height="417"></li></ul>
<li>Java synchronization works with objects in Multithreading.</li>
</ul>
</ol>

<h2>⁡⁢⁣⁣⁡⁣⁢⁣List of Wrapper Class⁡⁡</h2>
The eight classes of the java.lang package are known as wrapper classes in Java. The list of eight wrapper classes are given below
<img src="https://media.geeksforgeeks.org/wp-content/uploads/Wrapper.png">

<h2>⁡⁣⁢⁣Differenyt ways to create instance of Wrapper class⁡</h2>
There are different ways to create instances of     wrapper classes,they are as follows:
<ol>
<li>Using Constructors</li>
<li>Using ValuOfMethod</li>
<li>Auto-Boxing</li>
<li>Parsing Strings</li>
</ol>

<h3>⁡⁢⁣⁣Using Constructors:⁡</h3>
<pre>
Syntax:
ClassnName Object = new ClassName(Argument);
</pre>
<pre>Example:
Integer x = new Integer(5);</pre>

<h3>⁡⁢⁣⁣⁡⁢⁣⁣Using valueOfMethds:⁡</h3>
It is more efficient than that of the constructors.
<pre>
Syntax:
ClassnName Object = ClassName.valueOf(Argument);
</pre>
<pre>Example:
Integer x = Integer.valueOf(5);</pre>

<h3>⁡⁢⁣⁣Auto-Boxing:⁡</h3>
<pre>
Example:
Integer x = 10; 
Double  y = 10.23; 
Boolean z = true; 
</pre>

<h3>⁡⁢⁣⁣Parsing Strings:⁡</h3>
Wrapper classes provide static methods to convert strings to their corresponding wrapper objects.
<pre>
Integer x = Integer.parseInt("10");
Double  y = Double.parseDouble("10.23");
Boolean z = Boolean.parseBoolean("true");
</pre>

<h3>⁡⁢⁣⁣Example using all the instance Methods:⁡</h3>
<pre>
package Wrapperclass;

public class WrapperCreationExample {
    public static void main(String[] args) {
        // Using Constructor (Deprecated)
        Integer x1 = new Integer(10); // Deprecated since Java 9
        Double y1 = new Double(10.5);  // Deprecated since Java 9

        // Using valueOf method
        Integer x2 = Integer.valueOf(10);
        Double y2 = Double.valueOf(10.5);
        Boolean z2 = Boolean.valueOf(true);

        // Using Autoboxing
        Integer x3 = 10; // Autoboxing
        Double y3 = 10.5; // Autoboxing
        Boolean z3 = true; // Autoboxing

        // Parsing Strings
        Integer x4 = Integer.parseInt("10");
        Double y4 = Double.parseDouble("10.5");
        Boolean z4 = Boolean.parseBoolean("true");

        // Display the values
        System.out.println("Integer object using Constructor: " + x1);
        System.out.println("Double object using Constructor: " + y1);
System.out.println();
        System.out.println("Integer object using valueOf: " + x2);
        System.out.println("Double object using valueOf: " + y2);
        System.out.println("Boolean object using valueOf: " + z2);
System.out.println();
        System.out.println("Integer object using Autoboxing: " + x3);
        System.out.println("Double object using Autoboxing: " + y3);
        System.out.println("Boolean object using Autoboxing: " + z3);
System.out.println();
        System.out.println("Integer object using parseInt: " + x4);
        System.out.println("Double object using parseDouble: " + y4);
        System.out.println("Boolean object using parseBoolean: " + z4);
    }
}
</pre>

<h2>⁡⁣⁢⁡⁣⁢⁣Important Character Class Methods ⁡⁡</h2>
Character class provides several methods to manipulate characters<br>
The Character is immutable methods that cannot be changed<br>
<h3>⁡⁢⁣⁣Methods of character class:⁡</h3>
<ol>
<li><h4><b>⁡⁢⁣⁣⁡⁢⁢⁢boolean isLetter(char ch):⁡⁡⁡</b></h4>
ch - identifier<br>
It returns <b>true</b> if the character is alphabet ,if not it returns <b>false</b>.<br>
<pre>
public class isLetter {
    public static void main(String[] args) {
        System.out.println(Character.isLetter('A'));
        System.out.println(Character.isLetter('0'));
    }
}
</pre>

</li>
<li><h4><b>⁡⁢⁢⁢boolen isLetterOrDigit(char ch):⁡⁡⁡</b></h4>
ch - identifier<br>
It returns <b>true</b> if the character is alphabet or digit ,if not it returns <b>false</b>.<br>
<pre>
<pre>
public class isLetterorDigit {

    public static void main(String[] args) {
        System.out.println(Character.isLetterOrDigit('A'));
        System.out.println(Character.isLetterOrDigit('0'));
    }
}
</pre>
</li>
<li><h4><b>⁡⁢⁢⁢boolean isDigit(char ch):⁡⁡</b></h4>
ch - identifier<br>
It returns <b>true</b> if the character is digit ,if not it returns <b>false</b>.<br>
<pre>

public class isDigit {

    public static void main(String[] args) {

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('0'));
    }
}
</pre>
</li>
<li><h4><b>⁡⁢⁢⁢boolen isWhiteSpace(char ch):⁡⁡</b></h4>
ch - identifier<br>
It returns <b>true</b> if the character is a White Space ,if not it returns <b>false</b>.<br>
<pre>
public class isWhiteSpace {
    public static void main(String[] args) {
        System.out.println(Character.isWhitespace('A'));
        System.out.println(Character.isWhitespace(9));
        System.out.println(Character.isWhitespace('9'));
        System.out.println(Character.isWhitespace(' '));
        System.out.println(Character.isWhitespace('\t'));
        System.out.println(Character.isWhitespace('\n'));
        System.out.println(Character.isWhitespace('\r'));
        System.out.println(Character.isWhitespace('\u00A0'));
    }
}
</pre>
</li>
<li><h4>⁡⁢⁣<b>⁡⁢⁢⁢boolean isUppercase(char ch):⁡⁡⁡</b></h4>
ch - identifier<br>
It returns <b>true</b> if the character is a uppercase alphabet ,if not it returns <b>false</b>.<br>
<pre>
public class isUppercase {
    public static void main(String[] args) {
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isUpperCase('a'));
    }
}
</pre>
</li>
<li><h4><b>⁡⁢⁢⁢boolean isLowecase(char ch):⁡⁡</b></h4>
ch - identifier<br>
It returns <b>true</b> if the character is a Lowecase alphabet ,if not it returns <b>false</b>.<br>
<pre>
public class isLowercase {
    public static void main(String[] args) {
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.isLowerCase('a'));
    }
}

</pre>
</li>
<li><h4><b>⁡⁢⁢⁢char toUppercase(charch):⁡⁡</b></h4></li>
ch - identifier<br>
It converts the <b>Lowercase</b> character to the <b>Uppercase</b>.<br>
<pre>
public class toUppecase {
    public static void main(String[] args) {
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toUpperCase(96));
    }
}
</pre>
<li><h4><b>⁡⁢⁣⁣⁡⁢⁣⁡⁢⁢⁢char toLowercase(charch):⁡⁡⁡</b></h4></li>
ch - identifier<br>
It converts the <b>Uppercase</b> character to the <b>Lowercase</b>.<br>
<pre>
public class toLowercase {
    public static void main(String[] args) {
        System.out.println(Character.toLowerCase('A'));
        System.out.println(Character.toLowerCase(96));
        System.out.println(Character.toLowerCase('a'));
    }
}
</pre>
<li><h4><b>char charValue():</b></h4></li>
 This method returns the primitive char value represented by this object.
 <pre>
public class charValue {
    public static void main(String[] args) {
        Character c = new Character('z');
        System.out.println("Character value: " + c.charValue());
    }
}
 </pre>
</ol>
<h3>⁡⁣⁢⁣These are other Character-Wrapper class methods⁡</h3>
<pre>
<table>
<thead>
<tr>
<th>S. No.</th>
<th>Method</th>
<th>Description</th>
</tr>
</thead>
<tbody>
<tr>
<td>1.</td>
<td><a href="https://www.geeksforgeeks.org/java-character-charcount-with-examples/" previewlistener="true"><strong>static int charCount?(int codePoint)</strong></a></td>
<td>This method determines the number of char values needed to represent the specified character (Unicode code point).</td>
</tr>
<tr>
<td>2.</td>
<td><a href="https://www.geeksforgeeks.org/character-charvalue-in-java-with-examples/" previewlistener="true"><strong>char charValue?()</strong></a></td>
<td>This method returns the value of this Character object.</td>
</tr>
<tr>
<td>3.</td>
<td><strong>static int codePointAt?(char[] a, int index)</strong></td>
<td>This method returns the code point at the given index of the char array.</td>
</tr>
<tr>
<td>4.</td>
<td><strong>static int codePointAt?(char[] a, int index, int limit)</strong></td>
<td>This method returns the code point at the given index of the char array, where only array elements with an index less than the limit can be used.</td>
</tr>
<tr>
<td>5.</td>
<td><strong>static int codePointAt?(CharSequence seq, int index)</strong></td>
<td>This method returns the code point at the given index of the CharSequence.</td>
</tr>
<tr>
<td>6.</td>
<td><strong>static int codePointBefore?(char[] a, int index)</strong></td>
<td>This method returns the code point preceding the given index of the char array.</td>
</tr>
<tr>
<td>7.</td>
<td><strong>static int codePointBefore?(char[] a, int index, int start)</strong></td>
<td>This method returns the code point preceding the given index of the char array, where only array elements with index greater than or equal to start can be used.</td>
</tr>
<tr>
<td>8.</td>
<td><strong>static int codePointBefore?(CharSequence seq, int index)</strong></td>
<td>This method returns the code point preceding the given index of the CharSequence.</td>
</tr>
<tr>
<td>9.</td>
<td><strong>static int codePointCount?(char[] a, int offset, int count)</strong></td>
<td>This method returns the number of Unicode code points in a subarray of the char array argument.</td>
</tr>
<tr>
<td>10.</td>
<td><strong>static int codePointCount?(CharSequence seq, int beginIndex, int endIndex)</strong></td>
<td>This method returns the number of Unicode code points in the text range of the specified char sequence.</td>
</tr>
<tr>
<td>11.</td>
<td><strong>static int codePointOf?(String name)</strong></td>
<td>This method returns the code point value of the Unicode character specified by the given Unicode character name.</td>
</tr>
<tr>
<td>12.</td>
<td><strong>static int compare?(char x, char y)</strong></td>
<td>This method compares two char values numerically.</td>
</tr>
<tr>
<td>13.</td>
<td><strong>int compareTo?(Character anotherCharacter)</strong></td>
<td>This method compares two Character objects numerically.</td>
</tr>
<tr>
<td>14.</td>
<td><a href="https://www.geeksforgeeks.org/character-digit-in-java-with-examples/" previewlistener="true"><strong>static int digit?(char ch, int radix)</strong></a></td>
<td>This method returns the numeric value of the character ch in the specified radix.</td>
</tr>
<tr>
<td>15.</td>
<td><a href="https://www.geeksforgeeks.org/character-digit-in-java-with-examples/" previewlistener="true"><strong>static int digit?(int codePoint, int radix)</strong></a></td>
<td>This method returns the numeric value of the specified character (Unicode code point) in the specified radix.</td>
</tr>
<tr>
<td>16.</td>
<td><a href="https://www.geeksforgeeks.org/character-equals-method-in-java-with-examples/" previewlistener="true"><strong>boolean equals?(Object obj)</strong></a></td>
<td>This method compares this object against the specified object.</td>
</tr>
<tr>
<td>17.</td>
<td><strong>static char forDigit?(int digit, int radix)</strong></td>
<td>This method determines the character representation for a specific digit in the specified radix.</td>
</tr>
<tr>
<td>18.</td>
<td><a href="https://www.geeksforgeeks.org/character-getdirectionality-method-in-java-with-examples/" previewlistener="true"><strong>static byte getDirectionality?(char ch)</strong></a></td>
<td>This method returns the Unicode directionality property for the given character.</td>
</tr>
<tr>
<td>19.</td>
<td><a href="https://www.geeksforgeeks.org/character-getdirectionality-method-in-java-with-examples/" previewlistener="true"><strong>static byte getDirectionality?(int codePoint)</strong></a></td>
<td>This method returns the Unicode directionality property for the given character (Unicode code point).</td>
</tr>
<tr>
<td>20.</td>
<td><strong>static String getName?(int codePoint)</strong></td>
<td>This method returns the Unicode name of the specified character codePoint, or null if the code point is unassigned.</td>
</tr>
<tr>
<td>21.</td>
<td><strong>static int getNumericValue?(char ch)</strong></td>
<td>This method returns the int value that the specified Unicode character represents.</td>
</tr>
<tr>
<td>22.</td>
<td><strong>static int getNumericValue?(int codePoint)</strong></td>
<td>This method returns the int value that the specified character (Unicode code point) represents.</td>
</tr>
<tr>
<td>23.</td>
<td><a href="https://www.geeksforgeeks.org/character-equals-method-in-java-with-examples/" previewlistener="true"><strong>static int getType?(char ch)</strong></a></td>
<td>This method returns a value indicating a character’s general category.</td>
</tr>
<tr>
<td>24.</td>
<td><a href="https://www.geeksforgeeks.org/character-equals-method-in-java-with-examples/" previewlistener="true"><strong>static int getType?(int codePoint)</strong></a></td>
<td>This method returns a value indicating a character’s general category.</td>
</tr>
<tr>
<td>25.</td>
<td><a href="https://www.geeksforgeeks.org/character-hashcode-in-java-with-examples/" previewlistener="true"><strong>int hashCode?()</strong></a></td>
<td>This method returns a hash code for this Character; equal to the result of invoking charValue().</td>
</tr>
<tr>
<td>26.</td>
<td><a href="https://www.geeksforgeeks.org/character-hashcode-in-java-with-examples/" previewlistener="true"><strong>static int hashCode?(char value)</strong></a></td>
<td>This method returns a hash code for a char value; compatible with Character.hashCode().</td>
</tr>
<tr>
<td>27.</td>
<td><strong>static char highSurrogate?(int codePoint)</strong></td>
<td>This method returns the leading surrogate (a high surrogate code unit) of the surrogate pair representing the specified supplementary character (Unicode code point) in the UTF-16 encoding.</td>
</tr>
<tr>
<td>28.</td>
<td><strong>static boolean isAlphabetic?(int codePoint)</strong></td>
<td>This method determines if the specified character (Unicode code point) is an alphabet.</td>
</tr>
<tr>
<td>29.</td>
<td><strong>static boolean isBmpCodePoint?(int codePoint)</strong></td>
<td>This method determines whether the specified character (Unicode code point) is in the Basic Multilingual Plane (BMP).</td>
</tr>
<tr>
<td>30.</td>
<td><strong>static boolean isDefined?(char ch)</strong></td>
<td>This method determines if a character is defined in Unicode.</td>
</tr>
<tr>
<td>31.</td>
<td><strong>static boolean isDefined?(int codePoint)</strong></td>
<td>This method determines if a character (Unicode code point) is defined in Unicode.</td>
</tr>
<tr>
<td>32.</td>
<td><a href="https://www.geeksforgeeks.org/character-ishighsurrogate-method-in-java-with-examples/" previewlistener="true"><strong>static boolean isHighSurrogate?(char ch)</strong></a></td>
<td>This method determines if the given char value is a Unicode high-surrogate code unit (also known as a leading-surrogate code unit).</td>
</tr>
<tr>
<td>33.</td>
<td><a href="https://www.geeksforgeeks.org/character-isidentifierignorable-in-java-with-examples/" previewlistener="true"><strong>static boolean isIdentifierIgnorable?(char ch)</strong></a></td>
<td>This method determines if the specified character should be regarded as an ignorable character in a Java identifier or a Unicode identifier.</td>
</tr>
<tr>
<td>34.</td>
<td><a href="https://www.geeksforgeeks.org/character-isidentifierignorable-in-java-with-examples/" previewlistener="true"><strong>static boolean isIdentifierIgnorable?(int codePoint)</strong></a></td>
<td>This method determines if the specified character (Unicode code point) should be regarded as an ignorable character in a Java identifier or a Unicode identifier.</td>
</tr>
<tr>
<td>35.</td>
<td><strong>static boolean isIdeographic?(int codePoint)</strong></td>
<td>This method determines if the specified character (Unicode code point) is a CJKV (Chinese, Japanese, Korean, and Vietnamese) ideograph, as defined by the Unicode Standard.</td>
</tr>
<tr>
<td>36.</td>
<td><a href="https://www.geeksforgeeks.org/character-isisocontrol-method-with-examples-in-java/" previewlistener="true"><strong>static boolean isISOControl?(char ch)</strong></a></td>
<td>This method determines if the specified character is an ISO control character.</td>
</tr>
<tr>
<td>37.</td>
<td><a href="https://www.geeksforgeeks.org/character-isisocontrol-method-with-examples-in-java/" previewlistener="true"><strong>static boolean isISOControl?(int codePoint)</strong></a></td>
<td>This method determines if the referenced character (Unicode code point) is an ISO control character.</td>
</tr>
<tr>
<td>38.</td>
<td><a href="https://www.geeksforgeeks.org/character-isjavaidentifierpart-method-in-java-with-examples/" previewlistener="true"><strong>static boolean isJavaIdentifierPart?(char ch)</strong></a></td>
<td>This method determines if the specified character may be part of a Java identifier as other than the first character.</td>
</tr>
<tr>
<td>39.</td>
<td><a href="https://www.geeksforgeeks.org/character-isjavaidentifierpart-method-in-java-with-examples/" previewlistener="true"><strong>static boolean isJavaIdentifierPart?(int codePoint)</strong></a></td>
<td>This method determines if the character (Unicode code point) may be part of a Java identifier as other than the first character.</td>
</tr>
<tr>
<td>40.</td>
<td><a href="https://www.geeksforgeeks.org/character-isjavaidentifierstart-method-in-java-2/" previewlistener="true"><strong>static boolean isJavaIdentifierStart?(char ch)</strong></a></td>
<td>This method determines if the specified character is permissible as the first character in a Java identifier.</td>
</tr>
<tr>
<td>41.</td>
<td><a href="https://www.geeksforgeeks.org/character-isjavaidentifierstart-method-in-java/" previewlistener="true"><strong>static boolean isJavaIdentifierStart?(int codePoint)</strong></a></td>
<td>This method determines if the character (Unicode code point) is permissible as the first character in a Java identifier.</td>
</tr>
<tr>
<td>42.</td>
<td><a href="https://www.geeksforgeeks.org/character-islowsurrogate-method-in-java-with-examples/" previewlistener="true"><strong>static boolean isLowSurrogate?(char ch)</strong></a></td>
<td>This method determines if the given char value is a Unicode low-surrogate code unit (also known as trailing-surrogate code unit).</td>
</tr>
<tr>
<td>43.</td>
<td><a href="https://www.geeksforgeeks.org/character-isletterordigit-in-java-with-examples/" previewlistener="true"><strong>static boolean isLetterOrDigit?(char ch)</strong></a></td>
<td>This method determines if the specified character is a letter or digit.</td>
</tr>
<tr>
<td>44.</td>
<td><a href="https://www.geeksforgeeks.org/character-isletterordigit-in-java-with-examples/" previewlistener="true"><strong>static boolean isLetterOrDigit?(int codePoint)</strong></a></td>
<td>This method determines if the specified character (Unicode code point) is a letter or digit.</td>
</tr>
<tr>
<td>45.</td>
<td><a href="https://www.geeksforgeeks.org/character-ismirrored-method-in-java/" previewlistener="true"><strong>static boolean isMirrored?(char ch)</strong></a></td>
<td>This method determines whether the character is mirrored according to the Unicode specification.</td>
</tr>
<tr>
<td>46.</td>
<td><a href="https://www.geeksforgeeks.org/character-ismirrored-method-in-java/" previewlistener="true"><strong>static boolean isMirrored?(int codePoint)</strong></a></td>
<td>This method determines whether the specified character (Unicode code point) is mirrored according to the Unicode specification.</td>
</tr>
<tr>
<td>47.</td>
<td><a href="https://www.geeksforgeeks.org/character-isspacecharchar-ch-method-java/" previewlistener="true"><strong>static boolean isSpaceChar?(char ch)</strong></a></td>
<td>This method determines if the specified character is a Unicode space character.</td>
</tr>
<tr>
<td>48.</td>
<td><a href="https://www.geeksforgeeks.org/character-isspacecharchar-ch-method-java/" previewlistener="true"><strong>static boolean isSpaceChar?(int codePoint)</strong></a></td>
<td>This method determines if the specified character (Unicode code point) is a Unicode space character.</td>
</tr>
<tr>
<td>49.</td>
<td><a href="https://www.geeksforgeeks.org/character-issupplementarycodepoint-method-in-java/" previewlistener="true"><strong>static boolean isSupplementaryCodePoint?(int codePoint)</strong></a></td>
<td>This method determines whether the specified character (Unicode code point) is in the supplementary character range.</td>
</tr>
<tr>
<td>50.</td>
<td><strong>static boolean isSurrogate?(char ch)</strong></td>
<td>This method determines if the given char value is a Unicode surrogate code unit.</td>
</tr>
<tr>
<td>51.</td>
<td><strong>static boolean isSurrogatePair?(char high, char low)</strong></td>
<td>This method determines whether the specified pair of char values is a valid Unicode surrogate pair.</td>
</tr>
<tr>
<td>52.</td>
<td><a href="https://www.geeksforgeeks.org/character-istitlecase-in-java-with-examples/" previewlistener="true"><strong>static boolean isTitleCase?(char ch)</strong></a></td>
<td>This method determines if the specified character is a titlecase character.</td>
</tr>
<tr>
<td>53.</td>
<td><a href="https://www.geeksforgeeks.org/character-istitlecase-in-java-with-examples/" previewlistener="true"><strong>static boolean isTitleCase?(int codePoint)</strong></a></td>
<td>This method determines if the specified character (Unicode code point) is a titlecase character.</td>
</tr>
<tr>
<td>54.</td>
<td><a href="https://www.geeksforgeeks.org/character-isunicodeidentifierpart-method-in-java-with-examples/" previewlistener="true"><strong>static boolean isUnicodeIdentifierPart?(char ch)</strong></a></td>
<td>This method determines if the specified character may be part of a Unicode identifier as other than the first character.</td>
</tr>
<tr>
<td>55.</td>
<td><a href="https://www.geeksforgeeks.org/character-isunicodeidentifierpart-method-in-java-with-examples/" previewlistener="true"><strong>static boolean isUnicodeIdentifierPart?(int codePoint)</strong></a></td>
<td>This method determines if the specified character (Unicode code point) may be part of a Unicode identifier as other than the first character.</td>
</tr>
<tr>
<td>56.</td>
<td><strong>static boolean isUnicodeIdentifierStart?(char ch)</strong></td>
<td>This method determines if the specified character is permissible as the first character in a Unicode identifier.</td>
</tr>
<tr>
<td>57.</td>
<td><strong>static boolean isUnicodeIdentifierStart?(int codePoint)</strong></td>
<td>This method determines if the specified character (Unicode code point) is permissible as the first character in a Unicode identifier.</td>
</tr>
<tr>
<td>58.</td>
<td><a href="https://www.geeksforgeeks.org/character-isvalidcodepoint-method-in-java-with-examples/" previewlistener="true"><strong>static boolean isValidCodePoint?(int codePoint)</strong></a></td>
<td>This method determines whether the specified code point is a valid Unicode code point value.</td>
</tr>
<tr>
<td>59.</td>
<td><strong>static char lowSurrogate?(int codePoint)</strong></td>
<td>This method returns the trailing surrogate (a low surrogate code unit) of the surrogate pair representing the specified supplementary character (Unicode code point) in the UTF-16 encoding.</td>
</tr>
<tr>
<td>60.</td>
<td><a href="https://www.geeksforgeeks.org/character-offsetbycodepoints-in-java-with-examples/" previewlistener="true"><strong>static int offsetByCodePoints?(char[] a, int start, int count, int index, int codePointOffset)</strong></a></td>
<td>This method returns the index within the given char subarray that is offset from the given index by codePointOffset code points.</td>
</tr>
<tr>
<td>61.</td>
<td><a href="https://www.geeksforgeeks.org/character-offsetbycodepoints-method-in-java/" previewlistener="true"><strong>static int offsetByCodePoints?(CharSequence seq, int index, int codePointOffset)</strong></a></td>
<td>This method returns the index within the given char sequence that is offset from the given index by codePointOffset code points.</td>
</tr>
<tr>
<td>62.</td>
<td><strong>static char reverseBytes?(char ch)</strong></td>
<td>This method returns the value obtained by reversing the order of the bytes in the specified char value.</td>
</tr>
<tr>
<td>63.</td>
<td><strong>static char[] toChars?(int codePoint)</strong></td>
<td>This method converts the specified character (Unicode code point) to its UTF-16 representation stored in a char array.</td>
</tr>
<tr>
<td>64.</td>
<td><strong>static int toChars?(int codePoint, char[] dst, int dstIndex)</strong></td>
<td>This method converts the specified character (Unicode code point) to its UTF-16 representation.</td>
</tr>
<tr>
<td>65.</td>
<td><strong>static int toCodePoint?(char high, char low)</strong></td>
<td>This method converts the specified surrogate pair to its supplementary code point value.</td>
</tr>
<tr>
<td>66.</td>
<td><strong>static char toTitleCase?(char ch)</strong></td>
<td>This method converts the character argument to titlecase using case mapping information from the UnicodeData file.</td>
</tr>
<tr>
<td>67.</td>
<td><strong>static int toTitleCase?(int codePoint)</strong></td>
<td>This method converts the character (Unicode code point) argument to titlecase using case mapping information from the UnicodeData file.</td>
</tr>
<tr>
<td>68.</td>
<td><a href="https://www.geeksforgeeks.org/character-valueof-in-java-with-examples/" previewlistener="true"><strong>static Character valueOf?(char c)</strong></a></td>
<td>This method returns a Character instance representing the specified char value.</td>
</tr>
</tbody>
</table>
</pre>

<h2>⁡⁣⁢⁡⁣⁢⁣⁡⁡⁣⁢⁣ImportantByte class Methods and Constructors⁡⁡</h2>
<ol>
<li>⁡⁢⁣<b>⁡⁢⁣⁣Constructors:⁡⁡</b></li>
<ul>
<li>⁡⁢⁢<b>⁢Byte(byte b):</b>⁡</li>
 Constructs a newly allocated Byte object that represents the specified byte value.
<ul>
    <li>
        <pre>
        Syntax:
        Byte(byte b)
        </pre>
        <pre>
        Example:
        public class constructor1 {
        public static void main(String[] args) {
            byte b = 10;
            Byte x = new Byte(b);
            System.out.println("The Byte value is " + x);
        }
    }
        </pre>
    </li>

</ul>
</ul>
<li><b>⁡⁢⁣⁣Methods:⁡</b></li>
<ol>
<li>
<h4><b>⁡⁢⁢⁢toString():⁡</b></h4>
<pre>
Syntax:
public String toString() 
</pre>
<pre>
public class toString {
    public static void main(String[] args) {
        Byte b = new Byte((byte)10);
        String x = b.toString();
        System.out.println("Byte to string: " + x);
    }
}
</pre>
InOrder to check the datatype od the variable follow the below code:
<pre>
//In order to find the datatype of the variable there are 2 methods 
//1.to create some functions to show the datatype 
//2.use getclass() and getName() 
<br>
//method 1
class sample {
    void displayType(int x){
        System.out.println("Integer ");
    }
    void displayType(double x){
        System.out.println("Double ");
    }
    void displayType(Float x){
        System.out.println("Float ");
    }
    void displayType(String x){
        System.out.println("String ");
    }
    void displayType(Character x){
        System.out.println("Character ");
    }

    void displayType(boolean x){
        System.out.println("Boolean ");
    }

}
public class How_To_know_datatype_of_variable {
    public static void main(String[] args) {

        sample y = new sample();
        int x = 10;
        double z = 10.5;
        boolean b = true;
        String s = "Hello";

        y.displayType(s);
        y.displayType(x);
        y.displayType(z);
        y.displayType(b);
<br>
        //method 2
        System.out.println("x datatype: " + ((Object)x).getClass().getName());
        System.out.println("s datatype: " +((Object)s).getClass().getName());
        System.out.println("z datatype: " +((Object)z).getClass().getName());
        System.out.println("b datatype: " +((Object)b).getClass().getName());
    }
}
<br>
Output:
String 
Integer 
Double
Boolean
x datatype: java.lang.Integer
s datatype: java.lang.String
z datatype: java.lang.Double
b datatype: java.lang.Boolean
</pre>
</li>
<hr>
<li>
<h4><b>⁡⁢⁢⁢⁡⁢⁢⁢valueOf() & valueOf(String str):⁡⁡</b></h4>
This function returns the Byte object initialized with the value provided.
<pre>
Syntax:
public static Byte valueOf(byte b)
</pre>
<pre>
Examples:
package Wrapperclass.Byte_Wrapperclass;

public class valueOf {
    public static void main(String[] args) {
        byte x = 20;
        Byte b = Byte.valueOf(x);
        System.out.println("Byte value: " + b);

        
        //similarly we can eben convert the byte into other primitive types

        short s = b.shortValue();
        int i = b.intValue();
        long l = b.longValue();
        float f = b.floatValue();
        double d = b.doubleValue();

        System.out.println("Short value: " + s);
        System.out.println("Integer value: " + i);
        System.out.println("Long value: " + l);
        System.out.println("Float value: " + f);
        System.out.println("Double value: " + d);
<br>
        //valueOf(String value)

        String y = "40";
        System.out.println("Byte object form string value: " + b);
        Byte c = Byte.valueOf(y);

        //Similarly we can convert the byte object string value into other primitive types

        short z = c.shortValue();
        int p = c.intValue();
        long q = c.longValue();
        float r = c.floatValue();
        double h = c.doubleValue();

        System.out.println("Short value: " + z);
        System.out.println("Integer value: " + p);
        System.out.println("Long value: " + q);
        System.out.println("Float value: " + r);
        System.out.println("Double value: " + h);
        
    }
}

<br>
Output:
<u>valuOf():</u>
Byte value: 20
Short value: 20
Integer value: 20
Long value: 20
Float value: 20.0
Double value: 20.0
<hr>
<u>valuOf(String str):</u>
Byte object form string value: 20
Short value: 40
Integer value: 40
Long value: 40
Float value: 40.0
Double value: 40.0
</pre>
</li>
<hr>
<li></li>
<hr>
<li></li>
<hr>
<li></li>
<hr>
<li></li>
<hr>
<li></li>
<hr>

</ol>
</ol>