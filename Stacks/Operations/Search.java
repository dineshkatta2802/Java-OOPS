package Stacks.Operations;
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
