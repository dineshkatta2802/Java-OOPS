The final keyword in java is used to restrict the user. The java final keyword can be used in many context. Final can be:
<br>
variable<br>
method<br>
class<br>

<u>1.Final Varible:</u><br>
When a variable is declared as final, its value cannot be changed once it is initialized. This makes the variable a constant.<br>
ex:<br>
final int MAX_VALUE = 100;<br>
<hr>
<u>2.Final Method:</u><br>
When a method is declared as final, it cannot be overridden by subclasses. This is useful for preventing changes to the method's implementation in derived classes.<br>
If you make any method as final, you cannot override it.<br>
<br>
ex:<br>
class Parent {<br>
    public final void display() {<br>
        System.out.println("This is a final method.");<br>
    }<br>
}<br>
<hr>
<u>3.Final Class:</u><br>
When a class is declared as final, it cannot be subclassed. This is used to prevent inheritance and ensure the class's implementation remains unchanged.<br>
If you make any class as final, you cannot extend it.<br>
ex:<br>
public final class UtilityClass {<br>
    // Class contents<br>
}<br>
