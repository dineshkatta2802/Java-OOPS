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

<h2>⁡⁣⁢⁣Exception Handling in Java⁡</h2>
When there is an exception the programmer must carefully design the program to handle exceptions<br>
There are 3 steps to handle an Exeption<br>
<ol>
<li>⁡⁢⁣⁣Step-1:⁡</li>
<ul><li>A programmer should loo for the statement that can throw an exception  and has possibilty of throwing the exception, Such statements should be written in 'try' block</li>
<li>try{<br>
----Statements---<br>
}<br>
</li>
<li>The most important feature of the 'try' block is that it will not terminate the program even when there is an exception inside it</li></ul>
<li>⁡⁢⁣⁣Step-2⁡⁢⁣⁣:⁡⁡</li>
<li>⁡⁢⁣⁣Step-3:⁡</li>
</ol>