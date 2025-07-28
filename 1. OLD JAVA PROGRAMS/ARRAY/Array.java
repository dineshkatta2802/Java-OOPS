package ARRAY;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int size= x.nextInt();
        int marks[] = new int[size];
        //enter the marks
        for(int i=0; i<size ;i++){
            marks[i]=x.nextInt();
        }
        //display the marks
        for(int i=0;i<size;i++){
            System.out.println(marks[i]);
        }
    }
}
