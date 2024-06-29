<h1>⁡⁣⁢⁣Exception Handliing⁡</h1>
<h2>⁡⁣⁢⁣What are Java Exception⁡</h2>
An Exception is an unwanted and unexpected event that occurs during the compiling of code which disrupts the flow of the normal code<br>
Exception handling is one of the effective method to deal with runtime errors like ClassNotFoundException,IOException,SQLException etc..., so that the regular flow of the application is preversed<br>
When an exception occurs within a method it creates an object it is called exception object.<br>

<h2>⁡⁣⁢⁣Major reasons why an exception Occurs⁡</h2>
<ol>
<li>Invalid user input</li>
<li>Device failure</li>
<li>Loss of network connection</li>
<li>Physical limitations (out-of-disk memory)</li>
<li>Code errors</li>
<li>Opening an unavailable file</li>
</ol>

<h2>⁡⁣⁢⁣Difference between An Error and Exception⁡</h2>
<h3>⁡⁢⁣⁣Error:⁡</h3>
 An Error indicates a serious problem that a reasonable application should not try to catch.
<h3>⁡⁢⁣⁣Exception:⁡</h3>
 Exception indicates conditions that a reasonable application might try to catch.

 <h2>⁡⁣⁢⁣Hierarchy for Exceptions and Errors⁡</h2>
 <img src="https://media.geeksforgeeks.org/wp-content/uploads/20230613122108/Exception-Handling-768.png" alt="Hierarchy for Errors and Exceptions" width="498" height="300">
 Here Throwable is a class that represent all types of Errors and Exceptiosn that can occur in Java.

 <h2>⁡⁣⁢⁣Types of Exceptions⁡</h2>
  <img src="https://media.geeksforgeeks.org/wp-content/uploads/20230714113547/Exceptions-in-Java-1-768.png" alt="Types of Exception" width="598" height="300">

<h3>⁡⁢⁣⁣Built-in Exception:⁡</h3>
These Exceptions are available in Java libraries these are suitable to explain certain exceptions<br>
The Built-in Exceptions are classified into 2 types-<br>
<ol>
<li>⁡⁢⁢⁢Chechked Exceptions⁡</li>
<ul>
<li>These Exceptiosna are also called as Compile-time Exceptiosn because these are found during the compile-time by the compiler</li>
<li>Checked Exceptionis furher divide into two types-</li>
<ul>
<li>Fullly Checked</li>
<ul><li>A Fully checked Exception is an checked exception it's child classes are also checked like IO Exception and Interupted Exception</li></ul>
<li>Partially Checked</li>
<ul><li>A Partially Checked Exception is an Exception where only some of it's child classes are checked</li></ul>
</ul>
</ul>

<li>⁡⁢⁢⁢Unchecked Exceptions⁡</li>
<ul><li>It is opposite to the Checked Exceptions unlike checked exceptions they don't require to be fixed because they don't disrupt the program</li>
<li>These exceptions are runtime exceptions that are not required to be caught or declared in a throws clause</li>
<ul><li>ArrayIndexOutOfBoundsException: This exception is thrown when you attempt to access an array index that is out of bounds.</li>
<li>NullPointerException: This exception is thrown when you attempt to access a null object reference.</li>
<li>ArithmeticException: This exception is thrown when you attempt to divide by zero or perform an invalid arithmetic operation.</li></ul>
</ul>
</ol>

<h3>⁡⁢⁣⁣User-Defined Exception⁡</h3>
Some Built-in java exception sometimes cannot cannot be able to describe situation in such cases the programer can make exceptions

<h2>⁡⁣⁢⁣Hierarchy of Java Exception classes⁡</h2>
  <img src="https://static.javatpoint.com/core/images/hierarchy-of-exception-handling.png" alt="Hierarchy between exception classes" width="482" height="550">

<h2>⁡⁣⁢⁣Built-in Exception⁡</h2>

<h2>⁡⁣⁢⁣Exception Handling in Java⁡</h2>
When there is an exception the programmer must carefully design the program to handle exceptions<br>
There are 3 steps to handle an Exeption<br>
<ol>
<li>⁡⁢⁣⁣⁡⁢⁣⁣⁡⁢⁣⁣⁡⁢⁣⁣try Block⁡⁡⁡</li>
<ul><li>A programmer should look for the statement that can throw an exception  and has possibilty of throwing the exception, Such statements should be written in 'try' block</li>
<li>It contain the statement that throws an exception</li>
<li>Simple we can say that the try block contains a set of statements where an exception can occur.</li>
<li>try block must be followed by catch</li>
<li>try{<br>
----Statements---<br>
}<br>
</li>
<li>The most important feature of the 'try' block is that it will not terminate the program even when there is an exception inside it i.e, if an exception occurs in 'try' block it move on to 'Catch' block</li>
<li>When JVM understad that there is an exception then it stores in the exception details in the exception strack and move to the 'Catch' block</li></ul>
<li>⁡⁢⁣⁣⁡⁢⁣⁣⁡⁢⁣⁣catch Block⁡⁡⁡⁡</li>
<ul>
<li>The Catch block contains the code that handles the exception by declaring the exception within the parameter</li>
<li>You can have multiple exceptions in Catch bllock to handle different types of exceptiions</li>
<li>try {<br>
    // risky code<br>
} catch (ExceptionType1 e1) {<br>
    // handle exception type 1<br>
} catch (ExceptionType2 e2) {<br>
    // handle exception type 2<br>
}<br>
</li>
</ul>
<li>  <img src="https://static.javatpoint.com/core/images/java-try-catch-block.png" alt="Internal work of try-catch block" width="600" height="384"></li>
<li>⁡⁢⁣⁡⁢⁣⁣⁡⁢⁣⁣throw Block⁡⁡⁡</li>
<ul>
<li>The Throw Keyword is used to transfer control form try to catch</li>
<li>This is used to manually throw an exception. It's like saying, "Something went wrong, and I'm explicitly telling you what it is."</li>
</ul>
<li>⁡⁢⁣⁣throws Block⁡<li>
<ul><li>This is used in the method signature to indicate that the method might throw certain exceptions, letting the caller know they need to handle or declare these exceptions.</li></ul>
</ol>

<h2>⁡⁣⁢⁣⁡⁣⁢⁣Different types of Built-in Exceptions⁡⁡⁣⁢⁣:⁡⁡⁡</h2>
  <img src="https://media.geeksforgeeks.org/wp-content/uploads/20230714113547/Exceptions-in-Java-1-768.png" alt="Types of Exception" width="598" height="300">
<h2>⁡⁣⁢⁣->Checked Exceptions⁡</h2>
<h2>⁡⁣⁢⁣-->Arithmetic Exception:⁡⁡⁡</h2>
<h3>⁡⁢⁣⁣Case 1:⁡</h3>
public class Ex1 {<br>
<br>
    public static void main(String[] args) {<br>
        int x = 50/0;<br>
        System.out.println(x);<br>
        System.out.println("The is not termiinated");<br>
    }<br>
}<br>
<h4>⁡⁢⁢⁢Output:⁡</h4>⁡
Exception in thread "main" java.lang.Error: Unresolved compilation problem:<br>
at Exception_Handling.Ex1.main(Ex1.java:5)<br>

<h3>⁡⁢⁣⁣Case 2:⁡⁢⁢⁡⁢⁢⁢"The code is not terminated", is printed.⁡⁡</h3>
public class Ex1 {<br>
    public stativ void main(string[]args){<br>
        //Now consider the below code<br>
        try{<br>
            //we thought that the this expression can throw the exception so we place this bit of code in try block<br>
            int x = 50/0;<br>
        }<br>
        //in this catch block we write what kind of exception that is to be handled sinece we are dealing with the <br>
        //integers and number we used the Arithmetic Exception<br>
        catch(ArithmeticException e){<br>
            System.out.println(e);<br>
        }<br>
        System.out.println("the code is not terminated");<br>
    }<br>
}<br>
<h4>⁡⁢⁢⁢Output:⁡⁡</h4>⁡
java.lang.ArithmeticException: / by zero<br>
the code is not terminated<br>

<h3>⁡⁢⁣⁣Case 3:⁡⁢⁢⁢"The code is not terminated", is not printed bcoz it's in try block.⁡⁡⁡</h3>⁢
public class Ex1 {<br>
    public stativ void main(string[]args){<br>
         //Now consider 
        try{
            //The print statement "the code is not terminated", is brought inside the try block
            int x = 50/0;
            System.out.println("the code is not terminated");
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }<br>
}<br>
<h4>⁡⁢⁢⁡⁢⁢⁢Output:⁡⁡⁡</h4>⁡
java.lang.ArithmeticException: / by zero<br>


<h2>⁡⁣⁢⁣Advantages and Disadvantages⁡</h2>
<table>
    <thead>
        <tr>
            <th>Advantages</th>
            <th>Disadvantages</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>Improves program structure by separating error handling code from regular code.</td>
            <td>Can make code harder to understand if exceptions are overused or misused.</td>
        </tr>
        <tr>
            <td>Provides a mechanism to signal errors from one part of a program to another, improving code modularity.</td>
            <td>Exception handling can add overhead to the program, affecting performance.</td>
        </tr>
        <tr>
            <td>Allows for handling errors gracefully and providing meaningful messages to users.</td>
            <td>Unchecked exceptions can lead to unexpected program behavior if not properly managed.</td>
        </tr>
        <tr>
            <td>Facilitates debugging by allowing developers to catch and handle exceptions appropriately.</td>
            <td>Complex exception handling logic can lead to increased code complexity.</td>
        </tr>
        <tr>
            <td>Helps in resource management by ensuring resources are properly closed even in case of errors.</td>
            <td>Exception handling can sometimes mask the actual problem, making it harder to identify the root cause.</td>
        </tr>
    </tbody>
</table>

<h2>⁡⁣⁢⁣Methods to print Exception Information⁡</h2>