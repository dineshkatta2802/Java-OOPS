package Special_Programs.Swaping_Two_Numbers;

import java.util.Scanner;

//Illustreating the Swapping of two numbers by using third variable
class Swapping{
    static void Swapping(int a,int b){
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("Value of a:"+a+" Value of b:"+b);

    }
}
public class Approach1 {
    public static void main(String[] args) {
        Scanner x = new Scanner (System.in);
        System.out.print("Enter the value of a:");
        int a = x.nextInt();
        System.out.print("Entre the value of b:");
        int b = x.nextInt();

        Swapping y = new Swapping();
        y.Swapping(a,b);
    }
}
