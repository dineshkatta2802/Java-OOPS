package SPECIAL_LOOP_PROGRAMS;
import java .util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Entre the Number:");
        int a = x.nextInt();
        int rem,b=0,temp=a;
        while (a>0) {
            rem = a%10;
            b=b*10+rem;
            a=a/10;
        }
        if(temp==b){
            System.out.print("Palindrome!");
        }
        else{
            System.out.print("Not Palindrome!");
        }
    }
}
