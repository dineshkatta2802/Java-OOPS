package Stacks.Operations;
import java.util.*;
public class push_pop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the size of the stack
        int n = scanner.nextInt();
        
        // Initialize the stack
        Stack<Integer> stack = new Stack<>();
        
        // Read the elements and push them onto the stack
        for (int i = 0; i < n; i++) {
            int element = i+1;
            System.out.print(stack.push(element)+" ");
        }
        
        System.out.println();
        // Print the elements of the stack in LIFO order (reverse of input)
        Stack<Integer> reverseStack = new Stack<>();
        while (!stack.isEmpty()) {
            int element = stack.pop();
            System.out.print(element+ " ");
            reverseStack.push(element);  // Push elements onto another stack to reverse them
        }
    }
}

