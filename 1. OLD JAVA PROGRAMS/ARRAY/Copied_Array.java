package ARRAY;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Copied_Array
 */
public class Copied_Array {

    public static void main(String[] args) {
        Scanner x = new Scanner (System.in);
        System.out.print("Enter the size of the array:");
        int size = x.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elemntes of the array!");
        for(int i=0;i<size;i++){
            System.out.print("Element"+" "+(i+1)+" "+":");
            arr[i] = x.nextInt();
        }
        System.out.println("--->Original Array:");
        for(int i=0;i<size;i++){
            System.out.println("Element"+" "+(i+1)+" "+":"+arr[i]);
        }

        int copy[] = Arrays.copyOf(arr, size);
        System.out.println("--->Copied Array:");
        for(int i=0;i<size;i++){
            System.out.println("Element"+" "+(i+1)+" "+":"+copy[i]);
        }
        //-----------------------------------------------------------------
        System.out.println("Array elements between Specified index values");
        System.out.println("Integer Array: "+ Arrays.toString(Arrays.copyOfRange(arr, 1, 3)));
    }
}