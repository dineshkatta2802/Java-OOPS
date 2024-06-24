<h1>Type Casting in Java</h1>

Converting one datatype to another datatype is called Type Casting or simple Casting.<br>
We know that in Java we have 2 typed of datatypes:<br>
<ol>
<li>Pimitive datatype</li>
<li>Refernced or Advanced Datatypes</li>
</ol>
<br>

<h2>Casting Primitive Datatypes:</h2>
Casting of Primitive Datatypes is categorized into 2 types:<br>
<ol>
<li>Implict Casting(Automatic/Widening Casting)</li>
<ul>
<li>Converting Lower datatype to Higher Datatype</li>
</ul>
<li>Explict Casting(Narrow Casting)</li>
<ul>
<li>Converting Higher datatype to Lower Datatype</li>
</ul>
</ol>
<br>

Primitives datatypes are also classified into 2 more type they are:
<ol>
<li>Lower types-Less memory and represent less digits</li>
<li>Higher types-More memory and represent more digits</li>
</ol>
<br>

<h3>Hierarchy of Primitive Datatypes:</h3>
<h3>byte -> short -> char -> int -> long -> float -> double</h3>
Lower<--------------------------------------------------------------->Higher<br>

<h3>Widening or Automatic or Implict Casting:</h3>
Java automatically handles this conversion without requiring explicit syntax<br>
This type of casting is safe because no data is lost.<br>
Example:<br>
int a = 10;<br>
double b = a; // Implicit casting from int to double<br>

<h4>Types of Implicit Casting:</h4>
byte to short, int, long, float, double<br>
short to int, long, float, double<br>
char to int, long, float, double<br>
int to long, float, double<br>
long to float, double<br>
float to double<br>

<h3>Narrowing or Explic Casting</h3>
This type of casting must be explicitly specified in the code to inform the compiler of the developer’s intent.<br>
Explicit casting can potentially lose data or cause precision issues, so it should be used with caution.<br>
Example:<br>
double x = 10.5;<br>
int y = (int) x; // Explicit casting from double to int<br>

<h4>Types of Explicit Casting:</h4>
double to float, long, int, short, byte<br>
float to long, int, short, byte<br>
long to int, short, byte<br>
int to short, byte<br>
short to byte<br>
