import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int N = x.nextInt();
        Stack<Integer> s = new Stack<>();

        // Push elements to the stack
        for (int i = 0; i < N; i++) {
            int ele = i + 1;
            s.push(ele);
        }

        // Print and reverse the stack
        Stack<Integer> temp = new Stack<>();
        while (!s.isEmpty()) {
            int element = s.pop();
            temp.push(element);
        }

        // Print the reversed stack elements
        while (!temp.isEmpty()) {
            System.out.print(temp.pop() + " ");
        }
    }
}
