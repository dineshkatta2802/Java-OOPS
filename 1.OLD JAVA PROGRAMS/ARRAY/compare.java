package ARRAY;
import java.util.Arrays;
import java.util.Scanner;

public class compare {
    public static void main(String[] args) {
        Scanner x =  new Scanner(System.in);
        System.out.print("Enter the size1 of the array:");
        int size1 = x.nextInt();
        int intArr1[] = new int[size1];
        System.out.println("Entre the elements of the first array:");
        for(int i=0;i<size1;i++){
            System.out.print("Element"+" "+(i+1)+" "+":");
            intArr1[i] = x.nextInt();
        }
        for(int i=0;i<size1;i++){
            System.out.println("Elments at"+" "+(i+1)+" "+":"+intArr1[i]);
        }
//------------------------------------------------------------------------
        System.out.print("Enter the size2 of another array:");
        int size2 = x.nextInt();
        int intArr2[] = new int[size2];
        System.out.println("Enter the elemnets of the second array");
        for(int i=0;i<size2;i++){
            System.out.print("Element"+" "+(i+1)+" "+":");
            intArr2[i] = x.nextInt();
        }
        for(int i=0;i<size1;i++){
            System.out.println("Elments at"+" "+(i+1)+" "+":"+intArr2[i]);
        }

        System.out.println("Comparing the Array 1 and array 2");
        System.out.println("Integera array on comparision:"+Arrays.compare(intArr1, intArr2));
    }
}
