<h1>⁡⁣⁢⁣Stacks⁡</h1>
It is a part of Linear data structure that is used to store the collection of objects<br>
It follows <b>FILO(First-In-Last-Out) or LIFO(Kast-In-Last-Out)</b> princple.<br>
It provides different operations like Push ,Pop ,IsEmpty ,IsFull etc...<br>
It is under the package of "java.util"<br>
<img src="https://static.javatpoint.com/core/images/java-stack.png" alt="Stack" width="500" height="400">
<br>
<img src="https://media.geeksforgeeks.org/wp-content/uploads/20240606180735/Stack-representation-in-Data-Structures-(1).webp" alt="Stack" width="314" height="300">
<br>
<img src="https://static.javatpoint.com/core/images/java-stack2.png" alt="Java Stack">

<img src="https://static.javatpoint.com/core/images/java-stack3.png" alt="Java Stack">

<h2>⁡⁢⁣⁣Empty Stack⁡</h2>
If stack has no elements it is called Empty stack and the value of Top is "-1".
<img src="https://static.javatpoint.com/core/images/java-stack3.png" alt="Java Stack">

<br>
<h2>⁡⁣⁢⁣Applications of Stack⁡</h2>
<ol>
<li>Recursion</li>
<li>Express evaluating and Parsing</li>
<li>Depth-First Search</li>
<li>Undo/Redo Operations</li>
<li>Browser History</li>
<li>Function Calls</li>
</ol>

<h2>⁡⁣⁢⁣Types of Stack DataStructures⁡</h2>
<ol>
<li>⁡⁢⁣⁣<b>⁡⁢⁣⁣Fixed Size Stack:⁡</b><br>
As the name suggests that the size of the stack cannot be grow or shrinked dynamically<br>
If the Stack is full and if an elements is made to add then,Overflow occurs
</li>
<li><b>⁡⁢⁣⁣Dynamic Size Stack:⁡</b><br>
As the name suggests that the size of the stack can be grown or shrinked dynamically<br>

</li>
</ol>

<!-- TABLE-->
<h2>⁡⁣⁢⁣Methods in stack⁡</h2>

<table class="alt">
<tbody><tr>
<th>Method</th>
<th>Modifier and Type</th>
<th>Method Description</th>
</tr>
<tr>
<td><a href="#empty">empty()</a></td>
<td>boolean</td>
<td>The method checks the stack is empty or not.</td>
</tr>
<tr>
<td><a href="#push">push(E item)</a></td>
<td>E</td>
<td>The method pushes (insert) an element onto the top of the stack.</td>
</tr>
<tr>
<td><a href="#pop">pop()</a></td>
<td>E</td>
<td>The method removes an element from the top of the stack and returns the same element as the value of that function.</td>
</tr>
<tr>
<td><a href="#peek">peek()</a></td>
<td>E</td>
<td>The method looks at the top element of the stack without removing it.</td>
</tr>
<tr>
<td><a href="#search">search(Object o)</a></td>
<td>int</td>
<td>The method searches the specified object and returns the position of the object.</td>
</tr>
</tbody>
</table>
<br>

<h2>⁡⁣⁢⁣⁡⁣⁢⁣Creating a Stack⁡⁡</h2>
<pre>
Syntax:
Stack s = new Stack();
or
Stack<E> s = new Stack<E>();
E is the type of the object
</pre>
<ol>
<li>
<h3>⁡⁢⁣⁣⁡⁢⁣⁣empty():⁡</h3>
It tell us wether the given stack is empty or not.
<pre>
Syntax:
public Boolean empty()
</pre>
<img src="https://media.geeksforgeeks.org/wp-content/uploads/20240606181101/isEmpty-Operation-in-Stack-(1).webp" alt="Stack is empty" width="419" height="300">
</li>


<li>
<h3>⁡⁢⁣⁣Push() and Pop():⁡</h3>
<pre>
Syntax:
-push():
public E push (E items)

-pop():
public E pop (E items)
</pre>
<img src="https://media.geeksforgeeks.org/wp-content/uploads/20240606180844/Push-Operation-in-Stack-(1).webp" alt="Push elements into stack" width="419" height="300">

<img src="https://media.geeksforgeeks.org/wp-content/uploads/20240606180943/Pop-Operation-in-Stack-(1).webp" alt="Pop elements into stack" width="419" height="300">
</li>
<li>
<h3>Example using the Push(),Pop(),empty():</h3>
<pre>
Exmaple:
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            int element = i+1;
            System.out.print(stack.push(element)+" ");
        }
        
        System.out.println();

        Stack<Integer> reverseStack = new Stack<>();
        while (!stack.isEmpty()) {
            int element = stack.pop();
            System.out.print(element+ " ");
            reverseStack.push(element);  
        }
    }
}

</pre>
</li>

<li>
<h3>⁡⁢⁣⁣Search():⁡</h3>
<pre>
Syntax:
public int search(Object o)  
</pre>
<pre>
Example:

package Stacks.Methods;
import java.util.*;
public class Search {
    public static void main(String[] args) {

        Stack<String> s = new Stack<>();
        s.push("Apple");
        s.push("Mango");
        s.push("Grapes");
        s.push("Banana");

        int location = s.search("Apple");
        //we get the o/p as 4 bcoz the apple is the 
        //bottom elemnnt in the stack 
        System.out.println("Location:"+location);
    }
}
</pre>
</li>
</ol>

<h2>⁡⁣⁢⁣Stack Operation⁡</h2>
<ol>
<li>
<h3>⁡⁢⁣⁣Sizeof():⁡</h3>
<pre>
Syntax:
public int size()  
</pre>
<pre>
Example:

package Stacks.Operators;
import java.util.*;
public class sizeof {
    public static void main(String[] args) {

        Stack<String> s = new Stack<>();
        s.push("Apple");
        s.push("Mango");
        s.push("Grapes");
        s.push("Banana");

        int x = s.size();
        System.out.println("Size of the stack is: "+x);
    }
}
</pre>
</li>
</ol>
