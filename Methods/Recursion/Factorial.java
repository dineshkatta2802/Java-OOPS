package Methods.Recursion;

import java.util.Scanner;

public class Factorial {
    //Lets create a method i.e a function that performs the factorial
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }

    }
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("ENter the number to calculate the factorial:");
        int number = x.nextInt();
        System.out.println("Factorial:"+factorial(number));
    }
}
