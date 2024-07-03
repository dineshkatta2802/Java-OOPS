package Special_Programs.Biggest_Among_Three_Numbers;
import java.io.*;
import java.util.Scanner;

class Approach2 {
    // Function to find the biggest of three numbers
    static int biggestOfThree(int x, int y, int z)
    {

        return z > (x > y ? x : y) ? z : ((x > y) ? x : y);
    }

    // Main driver function
    public static void main(String[] args)
    {

        Scanner x = new Scanner(System.in);

        // Variable holding the largest number
        int largest;
        System.out.print("Enter the value of a:");
        int a = x.nextInt();
        System.out.print("Enter the value of b:");
        int b = x.nextInt();
        System.out.print("Enter the value of c:");
        int c = x.nextInt();
        // Calling the above function in main
        largest = biggestOfThree(a, b, c);

        // Printing the largest number
        System.out.println(largest+ " is the largest number.");
    }
}
