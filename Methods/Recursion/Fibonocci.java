package Methods.Recursion;
import java.util.Scanner;
public class Fibonocci {
    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the number:");
        int number = x.nextInt();
        for(int i=0;i<=number;i++){
            System.out.println(fibonacci(i)+" ");
        }
    }
}
