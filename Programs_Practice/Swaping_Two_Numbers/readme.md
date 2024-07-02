<h1>⁡⁣⁢⁣Swapping of two of Numbers⁡</h1>
We have got 3 main approachs:
<ol><li>Creating auxilary memory cell</li>
<li>Without creating the auxilary memory</li>
<li>Using Exclusise OR Operator</li></ol>

<h2>⁡⁣⁢⁣Approach 1:⁡</h2>
        int temp;<br>
        temp = a;<br>
        a = b;<br>
        b = temp;<br>

<h2>⁡⁣⁢⁣Approach 2:⁡</h2>
        a = a-b;<br>
        b = a+b;<br>
        a = b-a;<br>

<h2>⁡⁣⁢⁣Approach 3:⁡</h2>
        a =a^b;<br>
        b =a^b;<br>
        a =a^b;<br>