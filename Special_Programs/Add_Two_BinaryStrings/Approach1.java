package Special_Programs.Add_Two_BinaryStrings;

import java.util.Scanner;

class Binary_Strings {
    Binary_Strings(String x, String y) {
        int num1 = Integer.parseInt(x, 2);
        System.out.println("First number (decimal): " + num1);
        int num2 = Integer.parseInt(y, 2);
        System.out.println("Second number (decimal): " + num2);
        int sum = num1 + num2;
        System.out.println("Sum (decimal): " + sum);
        String result = Integer.toBinaryString(sum);
        System.out.println("Sum (binary): " + result);
    }
}

public class Approach1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the String x(Binary):");
        String x = a.nextLine();
        System.out.print("Enter the String y(Binary):");
        String y = a.nextLine();
        Binary_Strings z = new Binary_Strings(x, y);
    }
}
