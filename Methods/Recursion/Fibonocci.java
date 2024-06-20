package Methods.Recursion;
import java.util.Scanner;
public class Fibonocci {
    public static int fibonacci(int n){
    //⁡⁣⁣⁢Note:⁡⁡
    //Here the Keyword "static" has been used becoz it has to be called without the help of object and 
    //no object is create d in the main class
    //"int" is the return type of the method
    //"public" is the access specifier
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
