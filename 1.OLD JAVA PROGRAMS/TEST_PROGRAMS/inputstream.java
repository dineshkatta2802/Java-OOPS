package TEST_PROGRAMS;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * inputstream
 */
public class inputstream {    
    public static void main(String[] args)throws IOException 
    //--->Note:
    //Since we dont know about Exceptionhandling to handle exceptions that 
    //are thrown by "read()" and "readLine()" method of BuffredReader class we write --"throws IOException"--

    //--->Note:
    //InputStreamReader x =new InputStreamReader(System.in);
    //BufferedReader br = new BufferedReader(x);
    //the above 2 mentioned lines can be written in single phrase as
    //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //--->Character:
        System.out.println("1.--->Character");
        System.out.println("Enter any single character:");
        char ch = (char)br.read();
        //--->Note:
        //As we can see Char ch = (char)br.read();
        //Basically the above line is
        //char ch = br.read()
        //here the read() method reads the single character but it returns ASCII
        //so convert the ASCII to char(Type Casting) we use char keyword after equals
        System.out.println(ch);

        //--->String
        System.out.println("--->2.String");

        System.out.println("Enter the String:");
        String str = br.readLine();
        System.out.println(str);

        // //--->Integer
        // System.out.println("--->3.Integer");
        // System.out.println("Enter the Integer:");
        // int n = Integer.parseInt(br.readLine());
        // //--->Note:
        // //As we can see int n = Integer.parseInt(Br.readLine());
        // //Basically the above line is 
        // //String str = br.readLine(); and
        // //int n =Integer.parseInt(str);
        // //The above 2 lines can be written as 
        // //int n = Integer.parseInt(br.readLine());
        // //Here the parseInt is the static method of Integer class
        // //Here the String is getting converted from String to int(Type Casting)
        // System.out.println(n);

        //--->Note:
        //|||ly it is the same case as Int for Double,Float,byte,short,long,Boolean
        //So instead of int we replace with the respective keyword

            /*`BufferedReader` and `Scanner` are both classes in Java used for reading input from various sources such as files, streams, or the console. However, they have some differences in their usage and functionalities:

1. **Functionality:**
   - `BufferedReader`: It reads text from a character-input stream, buffering characters so as to provide for the 
   efficient reading of characters, arrays, and lines.
   - `Scanner`: It breaks its input into tokens using a delimiter pattern, which by default matches whitespace.
    It provides methods like `nextInt()`, `nextDouble()`, `nextLine()`, etc., to read different types of data.

2. **Efficiency:**
   - `BufferedReader` is generally more efficient when you need to read large amounts of text from a source like a 
   file because it buffers the input, reducing the number of I/O operations.
   - `Scanner` is less efficient compared to `BufferedReader` when reading from large sources because of the overhead 
   involved in tokenizing the input.

3. **Parsing:**
   - `BufferedReader` does not provide parsing capabilities directly. You typically use it in conjunction with other 
   classes like `Integer.parseInt()` or `Double.parseDouble()` to parse strings into specific data types.
   - `Scanner` has built-in parsing capabilities. It can parse primitive types and strings directly using its 
   `nextXXX()` methods.

4. **Usability:**
   - `BufferedReader` is commonly used for reading lines of text from a file or a stream.
   - `Scanner` is more versatile and is commonly used when you need to parse different types of data from a source, 
   such as when processing user input from the console.

5. **Error Handling:**
   - `BufferedReader` throws `IOException`, which needs to be handled or declared.
   - `Scanner` does not throw checked exceptions by default for input operations. Instead, it provides methods like 
   `hasNextLine()` to check if there is more input available.

In summary, if you need to read large amounts of text efficiently from a source like a file, `BufferedReader` is 
typically preferred. If you need to parse different types of data or process user input from the console, `Scanner`
 provides more convenient methods for this purpose. */
    }
}