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



<h2>Comparison of Packages in Java</h2>

<table>
    <tr>
        <th>Aspect</th>
        <th>Description</th>
    </tr>
    <tr>
        <td>Definition</td>
        <td>A package in Java is a namespace that organizes a set of related classes and interfaces. It helps in preventing naming conflicts and can be used to control access.</td>
    </tr>
    <tr>
        <td>Characteristics</td>
        <td>Packages help in grouping related classes and interfaces, provide access protection, and help in organizing code. They can be nested and are hierarchical.</td>
    </tr>
    <tr>
        <td>Properties</td>
        <td>Packages have unique names, follow a directory structure, can contain sub-packages, and help in encapsulation and modularization of code.</td>
    </tr>
    <tr>
        <td>What</td>
        <td>Packages are used to group related classes and interfaces together, making code more manageable and readable.</td>
    </tr>
    <tr>
        <td>Where</td>
        <td>Packages are defined at the top of Java source files using the `package` keyword. They correspond to directories on the file system.</td>
    </tr>
    <tr>
        <td>How</td>
        <td>To create a package, use the `package` keyword followed by the package name. Classes and interfaces are then declared within this package. To use a class from a package, use the `import` keyword.</td>
    </tr>
    <tr>
        <td>When</td>
        <td>Packages are used when there is a need to organize a large number of related classes and interfaces, to avoid naming conflicts, and to provide access control.</td>
    </tr>
    <tr>
        <td>Why</td>
        <td>Using packages improves code organization, readability, and maintainability. They help in avoiding class name conflicts and provide a way to control access to classes.</td>
    </tr>
    <tr>
        <td>Example</td>
        <td>
            <pre>
<code>package com.example.animals;

public class Dog {
    public void bark() {
        System.out.println("Woof!");
    }
}

import com.example.animals.Dog;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.bark();
    }
}
</code>
            </pre>
        </td>
    </tr>
</table>

