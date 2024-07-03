package Special_Programs.Even_or_Odd;
//Illustrating wether the b=number is even or odd using Bitwise XOR operator
import java.util.Scanner;

public class Approach4 {
    public static void main(String[] args) {
                Scanner x = new Scanner(System.in);
        System.out.print("Enter the value of x:");
        int a = x.nextInt();

        if((a^1)==a+1){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
