<h1>⁡⁣⁢⁣Swapping of two of Numbers⁡</h1>
We have got 3 main approachs:
<ol><li>Creating auxilary memory cell</li>
<li>Without creating the auxi;ary memory</li>
<li>Using Exclusise OR Operator</li></ol>

<h2>⁡⁣⁢⁣Approach 1:⁡</h2>
        int temp;
        temp = a;
        a = b;
        b = temp;

<h2>⁡⁣⁢⁣Approach 2:⁡</h2>
        a = a-b;
        b = a+b;
        a = b-a;

<h2>⁡⁣⁢⁣Approach 3:⁡</h2>
        a =a^b;
        b =a^b;
        a =a^b;