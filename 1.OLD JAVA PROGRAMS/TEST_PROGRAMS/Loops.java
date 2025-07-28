package TEST_PROGRAMS;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = x.nextInt();

        //Using while loop
        while (a<10) {
            System.out.println(a);
            a++;
        }
        
        //Using for loop
        for(int i=0;i<a;i++){
            System.out.println("Hello!");
        }

        //Using do-while loop
        int i = 0 ;
        do {
            System.out.println("Hello!");
            i++;
        } while (i<=a);
    }
}
