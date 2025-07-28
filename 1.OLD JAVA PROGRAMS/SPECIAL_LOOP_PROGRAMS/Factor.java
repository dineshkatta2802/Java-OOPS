package SPECIAL_LOOP_PROGRAMS;
import java.util.Scanner;
public class Factor {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a =x.nextInt();

        for(int i=0;i<=a;i++){
            if(a % i==0){
                System.out.println("The factor of"+a+"is:"+i);
            }
        }
    }
}
