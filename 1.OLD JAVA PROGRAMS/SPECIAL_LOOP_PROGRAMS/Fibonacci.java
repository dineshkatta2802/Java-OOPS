package SPECIAL_LOOP_PROGRAMS;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("enter the valu of n:");
        int n=x.nextInt();
        int a=0,b=1;
        int fib;
        for (int i = 2; i < n; i++)
    {
        fib = a + b;
        a = b;
        b = fib;
System.out.println("fib="+fib);
    }
    }
}
