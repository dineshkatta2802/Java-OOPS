package OOPS;
import java.util.Scanner;

public class Groceries {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the no of Groceries:");
        int size = x.nextInt();

        //declaring an array!
        //Rates number array
        int Rate[] = new int[size];
        //Groceries list arry
        String Groceries_list[] = new String[size];

        System.out.println("Enter the Groceries:");
        for(int i=0;i<size;i++){
            System.out.print((i+1)+".");
            Groceries_list[i] = x.next();
        }

        System.out.println("Entre the groceries price:");
        for(int i=0;i<size;i++){
            System.out.print((i+1)+"."+Groceries_list[i]+":Rs");
            Rate[i]=x.nextInt();
        }
        
        //calculating the total rate of the groceries
        int T = 0;
        for(int i=0;i<size;i++){
            int T =+ Rate[i];
        }
        System.out.println("Total:"+T);
    }
}
