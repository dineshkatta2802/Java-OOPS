package ARRAY;

import java.util.Arrays;
import java.util.Scanner;

public class equals {
    public static void main(String[] args) {
        Scanner x = new Scanner (System.in);
        System.out.print("Entre the size1 of the array");
        int size1 = x.nextInt();
        int arr1[] = new int[size1];
        System.out.println("Enter the elemnest of the array:");
        for(int i=0;i<size1;i++){
            System.out.print("Elments"+" "+(i+1)+" "+":");
            arr1[i]=x.nextInt();
        }
        for(int i=0;i<size1;i++){
            System.out.println("Elements"+" "+(i+1)+" "+":"+arr1[i]);
        }


        System.out.print("Entre the size2 of the another array:");
        int size2 = x.nextInt();
        int arr2[] = new int[size2];
        System.out.println("Enter the elemnest of the array:");
        for(int i=0;i<size2;i++){
            System.out.print("Elments"+" "+(i+1)+" "+":");
            arr2[i]=x.nextInt();
        }
        for(int i=0;i<size2;i++){
            System.out.println("Elements"+" "+(i+1)+" "+":"+arr2[i]);
        }

        System.out.println("Integer array on comparision:"+Arrays.equals(arr1, arr2));
    }
}
