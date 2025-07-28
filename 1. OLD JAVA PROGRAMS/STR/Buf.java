package STR;
import java.io.*;
public class Buf{
    public static void main(String[] args) {
        //It is also a part part of String but in string the charsequence is immutable(Not cahngeable) but in 
        //String_buffer the char sequence is mutable(Changable)
        StringBuffer sb = new StringBuffer("Hello ");
        //There several ways to manipulate string buffer 
        
        //1.append()
        sb.append("Java");
        System.out.println(sb);

        // //2.insert()
        // sb.insert(1,"Dinesh");
        // System.out.println(sb);

        // //3.replace()
        // sb.replace(1,3,"Java");
        // System.out.println(sb);

        // //4.delete()
        // sb.delete(1, 3);
        // System.out.println(sb);

        // //5.reverse()
        // sb.reverse();
        // System.out.println(sb);
    }
    
}
