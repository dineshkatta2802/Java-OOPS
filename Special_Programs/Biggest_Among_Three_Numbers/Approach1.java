package Special_Programs.Biggest_Among_Three_Numbers;

import java.util.Scanner;
class calc{
    calc(int a,int b,int c){
        
        if(a>=b && a>=c){
            System.out.println("a:"+a);
        }
        else if (b>=a && b>=c) {
            System.out.println("b:"+b);
        }
        else{
            System.out.println("c:"+c);
        }
    }
}

public class Approach1 {
    public static void main(String[] args) {
        //Without using class and object
        // Scanner x = new Scanner(System.in);
        // System.out.print("Entre the value of a:");
        // int a = x.nextInt();

        // System.out.print("Entre the value of b:");
        // int b = x.nextInt();

        // System.out.print("Entre the value of c:");
        // int c = x.nextInt();

        // if(a>=b && a>=c){
        //     System.out.println("a:"+a);
        // }
        // else if (b>=a && b>=c) {
        //     System.out.println("b:"+b);
        // }
        // else{
        //     System.out.println("c:"+c);
        // }

//Using class and object
        calc z = new calc(10, 50, 96);
    }
}
