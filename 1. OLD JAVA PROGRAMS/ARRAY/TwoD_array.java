package ARRAY;
import java.util.Scanner;
/**
 * 2d_array
 */
public class TwoD_array {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the Number of rows:");
        int rows = x.nextInt();
        System.out.print("Enter the Number of columns: ");
        int columns = x.nextInt();

        //Declaring an 2d array
        int arr[][] = new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print("Element"+" "+"["+(i+1)+"]"+"["+(j+1)+"]"+" "+":");
                arr[i][j] = x.nextInt();
            }
        }

        //displaying the 2d array!
        System.out.println("The 2d array of"+rows+" "+"rows and"+columns+" "+"colums is:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.println("Element"+" "+"["+(i+1)+"]"+"["+(j+1)+"]"+" "+":"+arr[i][j]);
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
        
    }
}