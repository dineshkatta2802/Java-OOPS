package ARRAY;

import java.util.Arrays;
import java.util.Scanner;

public class binary_Search {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter size of array:");
        //Enter the size=a of the array!
        int a = x.nextInt();
        //Integer Array has been declared and intialized
        int intarr[] =new int[a];
        System.out.println("Enter the integer values in array:");
        //loop to enter the array values
        for(int i=0;i<a;i++){
            System.out.print("Enter"+" "+(i+1)+":");
            intarr[i]=x.nextInt();
        }
        //Displaying elements!
        for(int i=0;i<a;i++){
            System.out.println("Elements at"+" "+(i+1)+":"+" "+intarr[i]);
        }
        //now sorting the array!
        Arrays.sort(intarr);
        //now entering the any one of the value that has been enetred in array!
        System.out.print("Enter any value from the above array to find the index value:");
        int y = x.nextInt();
        //diaplaying the value at wht index
        System.out.println(y+" "+"Found at index"+" "+Arrays.binarySearch(intarr, y));
        
// ----------------------------------------------------------------------------------------------------------------------
// //--->Arrays.binary.Search(array,fromindex,toindex,to be found variable)
// Scanner x = new Scanner(System.in);
// System.out.print("Enter size of array:");
// //Enter the size=a of the array!
// int a = x.nextInt();
// //Integer Array has been declared and intialized
// int intarr[] =new int[a];
// System.out.println("Enter the integer values in array:");
// //loop to enter the array values
// for(int i=0;i<a;i++){
//     System.out.print("Enter"+" "+(i+1)+":");
//     intarr[i]=x.nextInt();
// }
// //Displaying elements!
// for(int i=0;i<a;i++){
//     System.out.println("Elements at"+" "+(i+1)+":"+" "+intarr[i]);
// }
// //now sorting the array!
// Arrays.sort(intarr);
// //now entering the any one of the value that has been enetred in array!
// System.out.print("Enter any value from the above array to find the index value:");
// int y = x.nextInt();
// //diaplaying the value at wht index
// System.out.println(y+" "+"Found at index"+" "+Arrays.binarySearch(intarr,2,4, y));

    }
}
