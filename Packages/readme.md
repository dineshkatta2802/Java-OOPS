<h1>⁡⁣⁢⁣Packages⁡</h1>
The Directory or folder is also called a package<br>
It is a mechanism to encapsulate the class, interface and sub classes<br>
Exmaple:<br>
java.io.*;<br>
here java is a directory and io is the sub direactory<br>

<h2>⁡⁣⁢⁣Why do  we use Packages⁡</h2>
<ol>
<li>To prevent naming conflict</li>
<li>Code Organisation makes searching and using easier</li>
<li>Data Encapsulation</li>
<li>Access Control </li>
<li>Reusability</li>
</ol>
<h2>⁡⁣⁢⁣How Packages work?⁡</h2>
Package names and directory names are similar,suppose college.staff.CSE is a package then we have got three directories
i.e,CSE present inside staff ,staff present inside college directory and the college directory is accessible through ⁡⁢⁣⁣CLASSPATH⁡(It is an Environment variable that tells Java compiler where to look for the class files to import.CLASSPATH which is generally set to directory or JAR files).<br>

<h2>⁡⁣⁢⁣Packages Naming convention⁡</h2>
 Packages are named in reverse order of domain names, i.e., org.geeksforgeeks.practice. For example, in a college, the recommended convention is college.tech.cse, college.tech.ee, college.art.history, etc.<br>

 <h2>⁡⁣⁢⁣Types of Packages⁡</h2>
 <img src="https://media.geeksforgeeks.org/wp-content/uploads/java-types-of-packages.jpg" alt="Types fo Inheritance" width="424" height="300">
 <br>
<h3>⁡⁢⁣⁣Built-in Packages⁡</h3>
These packages consist of a large number of classes which are a part of Java API.Some of the commonly used built-in packages are:
<h4>⁡⁢⁢⁢java.lang:⁡</h4> 
lang stands for language<br>
It has got wrapper class which convert primary datatype to objects.<br>
Contains language support classes(e.g classes which defines primitive data types, math operations). This package is automatically imported.
<h4>⁡⁢⁢⁢java.io:⁡</h4> 
Contains classes for supporting input / output operations.<br>
This Package contains streams which represent the flow of data from one place to another place.
<h4>⁡⁢⁢⁡⁢⁢⁢java.text:⁡⁡</h4> 
This package has 2 important classes ,"DateFormat" to format Date and time and "Number Format" to format numeric values.
<h4>⁡⁢⁢⁢java.util:⁡</h4> 
Contains utility classes which implement data structures like Linked List,Stacks,Queues,Hashtable,Vector etc.. Dictionary and support ; for ate / Time operations.
<h4>⁡⁢⁢⁢java.applet:⁡</h4> 
Applets are programs which come from a server into a client and get executed in client computer.<br>
Contains classes for creating Applets.
<h4>⁡⁢⁢⁢java.awt:⁡</h4> 
AWT-Abstract windows tool kit<br>
Used to develop GUI(Graphic User Interface)<br>
Contain classes for implementing the components for graphical user interfaces (like button , ;menus etc).
<h4>⁡⁢⁢⁢java.swing⁡⁡⁢⁢⁢:⁡</h4>
It is just like java.awt which is used to develop the GUI.<br>
It is an extended package of java.awt.
<h4>⁡⁢⁢⁢java.net:⁡</h4> 
net-network<br>
Client-Server Computing is done by this package.<br>
Contain classes for supporting networking operations.
<h4>⁡⁢⁢⁢⁡⁢⁢⁢java.sql:⁡⁡</h4> 
sql-Structure query language<br>
This package helps to comment database like Oracle or Sybase,retrive the data from them and use it in java program.

<h3>⁡⁢⁣⁣User-defined Packages⁡</h3>
These are the packages that are defined by the user.<br>
/* import 'MyClass' class from 'names' myPackage */<br>
import myPackage.MyClass;<br>
<br>
public class PrintName <br>
{<br>
   public static void main(String args[]) <br>
   {       <br>
      // Initializing the String variable <br>
      // with a value <br>
      String name = "GeeksforGeeks";<br>
      <br>
      // Creating an instance of class MyClass in <br>
      // the package.<br>
      MyClass obj = new MyClass();<br>
      <br>
      obj.getNames(name);<br>
   }<br>
}<br>

<h2>⁡⁣⁢⁣Imporant points:⁡</h2>
<ol>
<li>Every class is part of some package.</li>
If no package is specified, the classes in the file goes into a special unnamed package (the same unnamed package for <li>all files).</li>
<li>All classes/interfaces in a file are part of the same package. Multiple files can specify the same package name.</li>
If package name is specified, the file must be in a subdirectory called name (i.e., the directory name must match the <li>package name).</li>
<li>We can access public classes in another (named) package using: package-name.class-name</li>
</ol>

<h2>Comparision table</h2>
    <table>
        <tr>
            <th>Criteria</th>
            <th>Details</th>
        </tr>
        <tr>
            <td>Definition</td>
            <td>A package in Java is a namespace that organizes a set of related classes and interfaces. It is used to avoid naming conflicts and to control access to classes, interfaces, and other packages.</td>
        </tr>
        <tr>
            <td>Characteristics</td>
            <td>
                <ul>
                    <li>Logical grouping of classes and interfaces.</li>
                    <li>Prevents naming conflicts.</li>
                    <li>Facilitates code reusability and maintenance.</li>
                    <li>Provides access protection.</li>
                </ul>
            </td>
        </tr>
        <tr>
            <td>Properties</td>
            <td>
                <ul>
                    <li>Packages can be nested.</li>
                    <li>Java provides a standard package hierarchy (e.g., java.lang, java.util).</li>
                    <li>Package names are typically written in all lower-case letters.</li>
                    <li>Custom packages can be created by developers.</li>
                </ul>
            </td>
        </tr>
        <tr>
            <td>What</td>
            <td>Packages are used to group related classes and interfaces together in a logical manner.</td>
        </tr>
        <tr>
            <td>Where</td>
            <td>Packages are declared at the top of a Java source file using the `package` keyword.</td>
        </tr>
        <tr>
            <td>How</td>
            <td>Packages are created using the `package` keyword followed by the package name. Classes within the package are referenced by their fully qualified names or imported using the `import` statement.</td>
        </tr>
        <tr>
            <td>When</td>
            <td>Packages are typically created when organizing large projects, or when creating libraries or APIs to be used across different projects.</td>
        </tr>
        <tr>
            <td>Why</td>
            <td>To avoid naming conflicts, to control access to classes and interfaces, to organize code logically, and to enhance code reusability and maintainability.</td>
        </tr>
        <tr>
            <td>Advantages</td>
            <td>
                <ul>
                    <li>Avoids naming conflicts.</li>
                    <li>Improves code organization.</li>
                    <li>Facilitates code reuse and maintainability.</li>
                    <li>Provides access control through package-private visibility.</li>
                </ul>
            </td>
        </tr>
        <tr>
            <td>Disadvantages</td>
            <td>
                <ul>
                    <li>Can make code navigation more complex if not organized properly.</li>
                    <li>May lead to dependency issues if packages are not managed correctly.</li>
                </ul>
            </td>
        </tr>
        <tr>
            <td>Example</td>
            <td>
                <pre>
package com.example.animals;

public interface Animal {
    void eat();
    void sleep();
}

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}
                </pre>
            </td>
        </tr>
    </table>

