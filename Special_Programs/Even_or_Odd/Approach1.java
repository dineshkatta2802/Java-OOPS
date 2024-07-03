package Special_Programs.Even_or_Odd;
//Illustrating Wether the number is even or odd by using brute force
import java.util.Scanner;

public class Approach1 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the value of x:");
        int a = x.nextInt();

        if(a%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
