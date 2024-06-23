<h2><u>Dynamic-polymorphism/Run-time Polymorphism</u></h2> <br>
This is achieved by Method Overriding .<br>
ex:<br>
Method Overloading and method overriding using instance methods
<br>
<hr>
<h2><u>Static-Polyorphism/Compiletime Polymorpism</u></h2><br>
This is achieved by Method Overloading and Operator Overloading.<br>
But Java doesn't support Operartor Overloading.<br>
ex:<br>
Method Overloading and method Overriding using static methods and method overloading using private and final methods
<br>
<hr>
Private methods cannot be overridden because they are not accessible to subclasses, but they can be overloaded within the same class since overloading is determined by method signature at compile time.
<hr>
<table border="1">
  <tr>
    <th>Feature</th>
    <th>Compile-Time Polymorphism</th>
    <th>Runtime Polymorphism</th>
  </tr>
  <tr>
    <td>Mechanism</td>
    <td>
      <ul>
        <li>Method Overloading: Multiple methods with the same name but different parameters within the same class.</li>
        <li>Operator Overloading: Using the same operator for different data types.</li>
      </ul>
    </td>
    <td>
      Method Overriding: A subclass provides a specific implementation of a method that is already defined in its superclass.
    </td>
  </tr>
  <tr>
    <td>Decision Made</td>
    <td>At compile time</td>
    <td>At runtime</td>
  </tr>
  <tr>
    <td>Examples</td>
    <td>Method overloading, operator overloading</td>
    <td>Method overriding, polymorphic behavior through interfaces and abstract classes</td>
  </tr>
</table>
