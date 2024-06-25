<h1>Abstract Keyword</h1>
Abstract Class is broadly classified into 2 categories
<ol>
<li>Abstract Class</li>
<li>Abstract Methods</li>
</ol><br>
<h2>Characteristics of Abstract Keyword</h2>
⁡⁢⁣⁣1.A͟b͟s͟t͟r͟a͟c͟t c͟l͟a͟s͟s c͟a͟n͟n͟o͟t b͟e I͟n͟s͟t͟a͟n͟t͟i͟a͟t͟e͟d d͟i͟r͟e͟c͟t͟l͟y⁡ i.e cannot have object but it can operated by having the extended subclass<br>
2.⁡⁢⁣⁣A͟b͟s͟t͟r͟a͟c͟t m͟e͟t͟h͟o͟d͟s d͟o͟n͟o͟t h͟a͟v͟e b͟o͟d͟y⁡,it is declared using abstract keyword and is ended by a 
Semicolon instead of method body and Subclasses of an abstract class must provide a concrete(normal)
implementation of all abstract methods that are defined in the parent class.<br>
3.⁡⁢⁣⁣A͟b͟s͟t͟r͟a͟c͟t c͟l͟a͟s͟s c͟a͟n h͟a͟v͟e b͟o͟t͟h a͟b͟s͟t͟r͟a͟c͟t m͟e͟t͟h͟o͟d͟s a͟s w͟e͟l͟l a͟s C͟o͟n͟c͟r͟e͟t(͟n͟o͟r͟m͟a͟l͟)͟m͟e͟t͟h͟o͟d͟s⁡,
the normal methods can be implemented in the abstarct class itself whereas the abstract methods cannot be implemented in 
the Abstract class<br>
4.⁡⁢⁣⁣A͟b͟s͟t͟r͟a͟c͟t c͟l͟a͟s͟s c͟a͟n h͟a͟v͟e C͟o͟n͟s͟t͟r͟u͟c͟t͟o͟r͟s⁡ it also similar to that of the methods u need to instantiate them in sub class<br>
5.⁡⁢⁣⁣A͟b͟s͟t͟r͟a͟c͟t c͟l͟a͟s͟s c͟a͟n c͟o͟n͟t͟a͟i͟n i͟n͟s͟t͟a͟n͟c͟e v͟a͟r͟i͟a͟b͟l͟e͟s⁡,whih can be used by both abstract class and the sub class<br>
6.⁡⁢⁣⁣A͟b͟s͟t͟r͟a͟c͟t c͟l͟a͟s͟s c͟a͟n i͟m͟p͟l͟e͟m͟e͟n͟t i͟n͟t͟e͟r͟f͟a͟c͟e⁡<br>

<h2>⁡⁣⁢⁣Abstarct Methods:⁡</h2>
Sometimes we just need to declare the method in super class only<br>
At that time we use Abstract keyword<br>
Since these methods would not be having method body they need to be Overrided by the Subclass to implement them<br>

<h3>⁡⁢⁣⁣Important rules for Abstract Methods:⁡</h3>
<ol>
<li>Any class that has got one or more than one has to declared as Abstract Class</li>
<li>The following are some illegal combinations with Abstract Keyword</li>
<ul>
<li>Final</li>
<li>abstract native</li>
<li>abstract Synchornized</li>
<li>absttract static</li>
<li>abstract private</li>
<li>abstract Strict</li>
</ul>
</ol>
<br>

<h2>Abstract Class:</h2>
An abstract class is declared using the abstract keyword.<br>
an abstract class is a class that cannot be instantiated on its own and is intended to be subclassed. It can contain both abstract methods (methods without a body) and concrete methods (methods with a body). Abstract classes are used to define a common interface for a group of subclasses.<br>