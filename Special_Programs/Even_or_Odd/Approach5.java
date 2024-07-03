package Special_Programs.Even_or_Odd;
//Illustrating Wether the number is even or odd by using brute force
import java.util.Scanner;

public class Approach5 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the value of x:");
        int a = x.nextInt();

        if(a>=0){
            if(Integer.toBinaryString(a).endsWith("0")){
                System.out.println("Even");
            }
            else{
                System.out.println("Odd");
            }
        }
        else{
            System.out.println("Zero");
        }

    }
}
