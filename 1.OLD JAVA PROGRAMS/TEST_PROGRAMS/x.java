package TEST_PROGRAMS;
import java.io.*;
public class x {
    public static void main(String[] args) {
        //It is also a part part of String but in string the charsequence is immutable(Not cahngeable) but in 
        //String_buffer the char sequence is mutable(Changable)
        StringBuffer sb = new StringBuffer("Hello ");
        //There several ways to manipulate string buffer 
        
        //1.append()
        sb.append("Java");
        System.out.println(sb);
    }
    
}
