package Stacks.Operators;
import java.util.*;
public class sizeof {
    public static void main(String[] args) {

        Stack<String> s = new Stack<>();
        s.push("Apple");
        s.push("Mango");
        s.push("Grapes");
        s.push("Banana");

        int x = s.size();
        System.out.println("Size of the stack is: "+x);
    }
}
