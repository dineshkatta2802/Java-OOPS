<h1>Packages</h1>
The Directory or folder is also called a package<br>
It is a mechanism to encapsulate the class, interface and sub classes<br>
Exmaple:<br>
java.io.*;<br>
here java is a directory and io is the sub direactory<br>

<h2>Why do  we use Packages</h2>
<ol>
<li>To prevent naming conflict</li>
<li>Code Organisation makes searching and using easier</li>
<li>Data Encapsulation</li>
<li>Access Control </li>
<li>Reusability</li>
</ol>
<h2>How Packages work?</h2>
Package names and directory names are similar,suppose college.staff.CSE is a package then we have got three directories
i.e,CSE present inside staff ,staff present inside college directory and the college directory is accessible through ⁡⁢⁣⁣CLASSPATH⁡(It is an Environment variable that tells Java compiler where to look for the class files to import.CLASSPATH which is generally set to directory or JAR files).

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

