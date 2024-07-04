<h1>⁡⁣⁢⁣Exception Handliing⁡</h1>
 <h2>⁡⁣⁢⁡⁣⁢⁣Hierarchy for Exceptions and Errors⁡</h2>
 <img src="https://media.geeksforgeeks.org/wp-content/uploads/20230613122108/Exception-Handling-768.png" alt="Hierarchy for Errors and Exceptions" width="498" height="300">
 <br>
 Here Throwable is a class that represent all types of Errors and Exceptions Classes that can occur in Java.
<hr>
<h2>⁡⁣⁢⁣Difference between An Error and Exception⁡</h2>
<h3>⁡⁢⁣⁣Error:⁡</h3>
 An Error indicates a serious problem that a reasonable application should not try to catch.
 It is of 3 types:<br>
 <ol>
 <li>⁡⁢⁢⁢Compile-Time Error⁡</li>
 <ul><li>These are Syntactcal errors due to which the program fails to compile</li>
 <li>Example:<br>
  forgetting Semicolon(;)</li>
  <li>Finding and correcting them are pretty easy</li></ul>
 <li>⁡⁢⁢⁢Run-Time Error⁡</li>
 <ul><li>It is occured due to inefficiency of computer system to execute a particular statement.</li>
 <li>Example:<br>
 Insufficient space to store memory</li>
 <li>Run-Time Errors are not detedted by Java compiler they are only detected by JVM during Run-Time</li></ul>
 <li>⁡⁢⁢⁢Logical Error⁡</li>
 <ul>
 <li>They depict the flaws in logic of the program.</li>
 <li>Example:<br>
 The programmer might be using wrong formulae or design of the program itself is wrong</li>
 <li>These are not detected by Java Compiler or JVM, it is the responsibility of the programer to find it solely</li>
 </ul>
 </ol>
<h3>⁡⁢⁣⁣Exception:⁡</h3>
<ol>
<li>An Exception is an unwanted and unexpected event that occurs during the compiling of code which disrupts the flow of the normal code</li>
<li>Exception handling is one of the effective method to deal with runtime errors like ClassNotFoundException,IOException,SQLException etc..., so that the regular flow of the application is preversed</li>
<li>When an exception occurs within a method it creates an object it is called exception object.</li>
<li> Exception indicates conditions that a reasonable application might try to catch.</li>
 <li>An Exception is a Run-Time Error.</li>
<li> Almost all Exceptions are found in Run-time and Some Exception are found by Java Compiler.</li>
<li> The Exceptiosn that are checked by Java compiler during Compilation-time are called <b>"Checked Exceptions"</b></li>
<li> The Exceptions that are checked by JVM are called <b>"Unchecked Exceptions"</b></li>
 </ol>
<hr>
<h2>⁡⁣⁢⁣⁡⁣⁢⁣Major reasons why an exception Occurs⁡⁡</h2>
<ol>
<li>Invalid user input</li>
<li>Device failure</li>
<li>Loss of network connection</li>
<li>Physical limitations (out-of-disk memory)</li>
<li>Code errors</li>
<li>Opening an unavailable file</li>
</ol>
<hr>

 <h2>⁡⁣⁢⁣Types of Exceptions⁡</h2>
  <img src="https://media.geeksforgeeks.org/wp-content/uploads/20230714113547/Exceptions-in-Java-1-768.png" alt="Types of Exception" width="598" height="300">
<br>
<h2>⁡⁣⁢⁣Hierarchy of Java Exception classes⁡</h2>
  <img src="https://static.javatpoint.com/core/images/hierarchy-of-exception-handling.png" alt="Hierarchy between exception classes" width="482" height="550">
<hr>

<h3>⁡⁢⁣⁣Built-in Exception:⁡</h3>
These Exceptions are available in Java libraries these are suitable to explain certain exceptions<br>
The Built-in Exceptions are classified into 2 types-<br>
<ol>
<li>⁡⁢⁢⁢Chechked Exceptions⁡</li>
<ul>
<li>These Exceptiosn are also called as Compile-time Exceptiosn because these are found during the compile-time by the compiler</li>
<li>These Exceptions need to be handled by the programmer or throw them without handling them</li>
<li>Exmaple:<br>
"public static void main(String []args) throws IOException"<br>
In this line the "IOException" is one of the example of checked Exceptions,So we can throw out of the main() without handling them</li>
<li>if the above exceptions is not handled and thrown then the Java Compiler will give an Error.</li>
<li>Checked Exceptionis furher divide into two types-</li>
<ul>
<li>Fullly Checked</li>
<ul><li>A Fully checked Exception is an checked exception it's child classes are also checked like IO Exception and Interupted Exception</li></ul>
<li>Partially Checked</li>
<ul><li>A Partially Checked Exception is an Exception where only some of it's child classes are checked</li></ul>
</ul>
</ul>

<li>⁡⁢⁢⁢Unchecked Exceptions⁡</li>
<ul><li>Unchecked Exceptions and errors are unrecoverable and programmer cannot do anything</li>
<li>It is opposite to the Checked Exceptions unlike checked exceptions they don't require to be fixed because they don't disrupt the program</li>
<li>The Program gets executed evenn withn the Unchecked Exceptions</li>
<li>These exceptions are runtime exceptions that are not required to be caught or declared in a throws clause</li>
<ul><li>ArrayIndexOutOfBoundsException: This exception is thrown when you attempt to access an array index that is out of bounds.</li>
<li>NullPointerException: This exception is thrown when you attempt to access a null object reference.</li>
<li>ArithmeticException: This exception is thrown when you attempt to divide by zero or perform an invalid arithmetic operation.</li></ul>
</ul>
</ol>

<h3>⁡⁢⁣⁣User-Defined Exception⁡</h3>
Some Built-in java exception sometimes cannot cannot be able to describe situation in such cases the programer can make exceptions
<hr>

<h2>⁡⁣⁢⁣Exception Handling in Java⁡</h2>
When there is an exception the programmer must carefully design the program to handle exceptions<br>
There are 3 steps to handle an Exeption<br>
Consider the program<br>
<br>
<h3>Code:</h3>
public class x {<br>
    public static void main(String[] args) {<br>
        System.out.println("Opened files");<br>
        int n = args.length;<br>
        System.out.println("n="+n);<br>
        int a = 45/n;<br>
        System.out.println("a="+a);<br>
        System.out.println("Closes files");<br>
    }<br>
}<br>
<h3>Output:</h3>
Opened files<br>
n=0<br>
Exception in thread "main" java.lang.<br>ArithmeticException: / by zero at Exception_Handling.x.main(x.java:8)<br>
<br>
In this example we can see that the n value is zero and the subsequent statements in the program are not executed.<br>
When there is an exception the files are not closed and the threads are terminated abnormally and this may lead to many other software problems.<br>
**Clossing the Opened filesand stopping the running threadsand releasing teh used memory is called <b>"CleanedUp Operations"</b>.<br>
***Therefore ist is important to design the program in such a way that even if there is an exception all cleaup operations should be performed and only program should be terminated,this process is called <b>"Exception Handling" </b><br>

<hr>
<ol>
<li>⁡⁢⁣⁣⁡⁢⁣⁣⁡⁢⁣⁣⁡⁢⁣<b>⁣⁡⁢⁣⁣try Block:⁡</b>⁡</li>
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
<li>⁡⁢⁣⁣⁡⁢⁣⁣⁡⁢⁣<b>⁣⁡⁢⁣⁣catch Block:⁡</b>⁡⁡⁡⁡</li>
<ul>
<li>The Catch block contains the code that handles the exception by declaring the exception within the parameter</li>
<li>You can have multiple exceptions in Catch bllock to handle different types of exceptiions</li>
<li>try {<br>
    // risky code<br>    
} <br>
catch (ExceptionType e) {<br>
    // handle exception<br> 
    }<br> 
    <li>When JVM understad that there is an exception then it stores in the exception details in the exception stack and move to the 'Catch' block</li>
    <li>Here <b>'e'</b> has the exception details that refers to the exception stack.</li>
</li>
</ul>
  <img src="https://static.javatpoint.com/core/images/java-try-catch-block.png" alt="Internal work of try-catch block" width="600" height="384">
<li>⁡⁢⁣⁡⁢⁣⁣⁡⁢⁣<b>⁣⁡⁢⁣⁣throw Block:⁡</b>⁡</li>
<ul>
<li>The Throw Keyword is used to transfer control form try to catch</li>
<li>This is used to manually throw an exception. It's like saying, "Something went wrong, and I'm explicitly telling you what it is."</li>
<li>This is used explicitly</li>
<li>public class TestThrow1 {   <br>
    //function to check if person is eligible to vote or not   <br>
    public static void validate(int age) {  <br>
        if(age<18) {  <br>
            //throw Arithmetic exception if not eligible to vote  <br>
            throw new ArithmeticException("Person is not eligible to vote");    <br>
        }  <br>
        else {  <br>
            System.out.println("Person is eligible to vote!!");  <br>
        }  <br>
    }  <br>
    //main method  <br>
    public static void main(String args[]){  <br>
        //calling the function  <br>
        validate(13);  <br>
        System.out.println("rest of the code...");    <br>
  }    <br>
} <br>   </li>
</ul>
<li><b>⁡⁢⁣⁣throws Block:</b>⁡</li>
<ul><li>This is used in the method signature to indicate that the method might throw certain exceptions, letting the caller know they need to handle or declare these exceptions.</li>
<li>When we dont use try-catch to handle the exception we can use <b>"throws"</b> keyword </li>
<li>import java.io.IOException;  <br>
class Testthrows1{  <br>
  void m()throws IOException{  <br>
    throw new IOException("device error");//checked exception  <br>
  }  <br>
  void n()throws IOException{  <br>
    m();  <br>
  }  <br>
  void p(){  <br>
   try{  <br>
    n();  <br>
   }catch(Exception e){System.out.println("exception handled");}  <br>
  }  <br>
  public static void main(String args[]){  <br>
   Testthrows1 obj=new Testthrows1();  <br>
   obj.p();  <br>
   System.out.println("normal flow...");  <br>
  }  <br>
}<br>  </li></ul>

<li><b>⁡⁢⁣⁣finally Block:⁡</b></li>
<ul><li>The statmenst in the finally block are executed wether there is an exception or not</li>
<li>It ensures all the opened files are closed properly and stops the running threads</li>
</ul>
</ol>
<hr>
<h2>⁡⁣⁢⁣⁡⁣⁢⁣Different types of Built-in Exceptions⁡⁡⁣⁢⁣:⁡⁡⁡</h2>
  <img src="https://media.geeksforgeeks.org/wp-content/uploads/20230714113547/Exceptions-in-Java-1-768.png" alt="Types of Exception" width="598" height="300">
  <hr>
<h2>⁡⁣⁢⁣<b>Checked Exceptions</b>⁡</h2>
<h3>⁡⁣⁢⁣Class Not Found Exception:⁡</h3>
This Exception is raised when we try to access a class whose definition is not found<br>
<br>
public class Class_Not_Found {<br>
    public static void main(String[] args) {<br>
        // Java program to demonstrate ClassNotFoundException <br>
		try{ <br>
			Class.forName("Class1");<br>
		} <br>
		catch(ClassNotFoundException e){ <br>
			System.out.println(e); <br>
			System.out.println("Class Not Found..."); <br>
		} <br>
<br>
    }<br>
}<br>

<h4>⁡⁢⁢⁢Output:⁡</h4>
Class Not Found...<br>
⁡⁣⁣⁢------------------------------------------------------------------------------------------⁡

<h3>⁡⁣⁢⁣⁡⁣⁢⁣IO Exception:⁡⁡</h3>
It is thrown when an input-output operation failed or interrupted<br>
<br>
import java.util.Scanner;<br>

public class IOException {<br>
    public static void main(String[] args) {<br>
        // Java program to demonstrate IOException<br>
<br>
		// Create a new scanner with the specified String <br>
		// Object <br>
		Scanner scan = new Scanner("Hello Geek!"); <br>
<br>
		// Print the line <br>
		System.out.println("" + scan.nextLine()); <br>
<br>
		// Check if there is an IO exception <br>
		System.out.println("Exception Output: "<br>
						+ scan.ioException()); <br>
<br>
		scan.close();<br>
<br>
    }<br>
}<br>

<h4>⁡⁢⁢⁢Output:⁡</h4>
Hello Geek!<br>
Exception Output: null<br>
⁡⁣⁣⁢------------------------------------------------------------------------------------------⁡
<h3>⁡⁣⁢⁣File not Found Exception⁡</h3>
This Exception is raised when a file is not accessible or does not open.<br>
<br>
//Java program to demonstrate FileNotFoundException <br>
import java.io.File; <br>
import java.io.FileNotFoundException; <br>
import java.io.FileReader; <br>
<br>
class File_Not_Found { <br>
<br>
	public static void main(String args[]) { <br>
		try { <br>
<br>
			// Following file does not exist <br>
			File file = new File("E://file.txt"); <br>
<br>
			FileReader fr = new FileReader(file); <br>
		} catch (FileNotFoundException e) { <br>
		System.out.println("File does not exist"); <br>
		} <br>
	} <br>
} <br>

<h4>⁡⁢⁢⁢Output:⁡</h4>
File does not exist<br>
⁡⁣⁣⁢--------------------------------------------------------------------------------------------------------------------------------------------------------------<br> ⁢--------------------------------------------------------------------------------------------------------------------------------------------------------------
<br>
<h2><b>⁡⁣⁢⁣Unchecked Exceptions⁡</b></h2>
<h3>⁡⁣⁢⁣Arithmetic Exception:⁡⁡⁡</h3>
It is thrown when an exceptional condition has occurred in an arithmetic operation.<br>
<h4>⁡⁢⁣⁣Case 1:⁡</h4>
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

<h4>⁡⁢⁣⁣Case 2:⁡⁢⁢⁡⁢⁢⁢"The code is not terminated", is printed.⁡⁡</h4>
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

<h4>⁡⁢⁣⁣Case 3:⁡⁢⁢⁢"The code is not terminated", is not printed bcoz it's in try block.⁡⁡⁡</h4>⁢
public class Ex1 {<br>
    public stativ void main(string[]args){<br>
         //Now consider <br>
        try{<br>
            //The print statement "the code is not terminated", is brought inside the try block<br>
            int x = 50/0;<br>
            System.out.println("the code is not terminated");<br>
        }<br>
        catch(ArithmeticException e){<br>
            System.out.println(e);<br>
        }<br>
    }<br>
}<br>
<h4>⁡⁢⁢⁡⁢⁢⁢Output:⁡⁡⁡</h4>⁡
java.lang.ArithmeticException: / by zero<br>
⁡⁣⁣⁢------------------------------------------------------------------------------------------⁡
<h3>⁡⁣⁢⁣Null Pointer Exception:⁡</h3>
This exception is raised when referring to the members of a null object. <br>
Null represents nothing<br>
//Java program to demonstrate NullPointerException <br>
class NullPointer_Demo <br>
{ <br>
	public static void main(String args[]) <br>
	{ <br>
		try { <br>
			String a = null; //null value <br>
			System.out.println(a.charAt(0)); <br>
		} catch(NullPointerException e) { <br>
			System.out.println("NullPointerException.."); <br>
		} <br>
	} <br>
} <br>

<h4>⁡⁢⁢⁡⁢⁢⁢Output:⁡⁡⁡</h4>⁡
NullPointerException..<br>
⁡⁣⁣⁢------------------------------------------------------------------------------------------⁡
<h3>⁡⁣⁢⁣StringIndexOutOfBound Exception:⁡</h3>
It is thrown when an attempt is made to access an invalid index in a string<br>
Suppose the String length is 5 but if we ask to print the character at index 10 it throws <b>StringIndexOutOfBound</b> i.e, we cannot accesseither negative or graeter than equal to to the length of string<br>
<br>
public class StringIndexOutOfBound {<br>
    public static void main(String[] args) {<br>
        String str= "Hello";<br>
        //here the string length is 5<br>
        try{<br>
            System.out.println(str.charAt(10));<br>
            //System.out.println(str.charAt(-1));<br>
            //System.out.println(str.charAt(5));<br>
        }<br>
        catch(StringIndexOutOfBoundsException e){<br>
            System.out.println("Exception Caught:"+e.getMessage());<br>
        }<br>
    }<br>
}<br>

  <h4>Output:</h4>
  Exception Caught: String index out of range: 10<br>
⁡⁣⁣⁢------------------------------------------------------------------------------------------⁡
<h3>⁡⁣⁢⁣ArrayIndexOutOfBound:⁡</h3>
It is thrown to indicate that an array has been accessed with an illegal index. The index is either negative or greater than or equal to the size of the array.<br>
<br>
public class ArrayIndexOutOfBound {<br>
    public static void main(String[] args) {<br>
        try{<br>
            int a[] = new int[5];<br>
            a[6] = 9;<br>
        }<br>
        catch(ArrayIndexOutOfBoundsException e){<br>
            System.out.println("The Array index is out of bound");<br>
        }<br>
    }<br>
}<br>

<h4>⁡⁢⁢⁢Output:⁡</h4>
The Array index is out of bound
<hr>

<h2>⁡⁣⁢⁣Multiple Catch⁡</h2>
 <img src="https://static.javatpoint.com/core/images/multiple-catch-block-in-java.png" alt="Multiple Catch" width="600" height="393">
 <br>
 public class MultipleCatchBlock1 {  <br>
  <br>
    public static void main(String[] args) {  <br>
          <br>
           try{    <br>
                int a[]=new int[5];    <br>
                a[5]=30/0;    <br>
               }    <br>
               catch(ArithmeticException e)  <br>
                  {  <br>
                   System.out.println("Arithmetic Exception occurs");  <br>
                  }    <br>
               catch(ArrayIndexOutOfBoundsException e)  <br>
                  {  <br>
                   System.out.println("ArrayIndexOutOfBounds Exception occurs");  <br>
                  }    <br>
               catch(Exception e)  <br>
                  {  <br>
                   System.out.println("Parent Exception occurs");  <br>
                  }             <br>
               System.out.println("rest of the code");    <br>
    }  <br>
}  <br>

<hr>

<h2>⁡⁣⁢⁣throw v/s throws⁡</h2>
<table class="alt">
<tbody><tr>
<th>Sr. no.</th>
<th>Basis of Differences</th>
<th>throw</th>
<th>throws</th>
</tr>
<tr>
<td>1.</td>
<td>Definition</td>
<td>Java throw keyword is used throw an exception explicitly in the code, inside the function or the block of code.</td>
<td>Java throws keyword is used in the method signature to declare an exception which might be thrown by the function while the execution of the code. </td>
</tr>
<tr>
<td>2.</td>
<td>Usage</td>
<td>Type of exception Using throw keyword, we can only propagate unchecked exception i.e., the checked exception cannot be propagated using throw only.</td>
<td>Using throws keyword, we can declare both checked and unchecked exceptions. However, the throws keyword can be used to propagate checked exceptions only.</td>
</tr>
<tr>
<td>3.</td>
<td>Syntax</td>
<td>The throw keyword is followed by an instance of Exception to be thrown.</td>
<td>The throws keyword is followed by class names of Exceptions to be thrown.</td>
</tr>
<tr>
<td>4.</td>
<td>Declaration</td>
<td>throw is used within the method.</td>
<td>throws is used with the method signature.</td>
</tr>
<tr>
<td>5.</td>
<td>Internal implementation</td>
<td>We are allowed to throw only one exception at a time i.e. we cannot throw multiple exceptions.</td>
<td>We can declare multiple exceptions using throws keyword that can be thrown by the method. For example, main() throws IOException, SQLException.</td>
</tr>
</tbody></table>
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


