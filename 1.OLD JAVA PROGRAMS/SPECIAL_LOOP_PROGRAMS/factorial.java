/**
 * factorial
 */
import java.util.Scanner;
public class factorial {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = x.nextInt();
        int b=1;
        for(int i=1;i<=a;i++){
            b=b*i;
        }
        System.out.println("The factorial of"+a+"is:"+b);
    }
}