package Constructors;
import java.util.Scanner;
class pattern{
    int n;
    pattern(){
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the number of Rows:");
        n = x.nextInt();
    }

    void Square(){
        System.out.println("Lets print a Square");
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    void Right_half_pyramid(){
        System.out.println("Lets print a Right half pyramid");
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
//⁡⁣⁣⁢--->Note:⁡
//One of the important pattern
    void Left_half_pyramid(){
        System.out.println("Lets print a Left half pyramid");
        for(int i=0;i<=n;i++){
            for(int j=2*(n-i);j>=0;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void Full_pyramid(){
        System.out.println("Lets print the Full pyramid");
        for(int i=0;i<n;i++){
            for(int j=n-i;j>=0;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void Inverted_Right_half_pyramid(){
        System.out.println("Lets print the Inverted Righht half pyramid");
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
            System.out.print("*");
            }
            System.out.println();
        }
        
    }

    void Inverted_Left_half_pyramid(){
        System.out.println("Lets print Inverted Left half Pyramid");
        int num = 2 * n - 2;
        for (int i=n;i>0;i--) {
            for (int j=0;j<n-i;j++) {
                System.out.print(" ");
            }
            num = num - 2;
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
public class Design_Genereation {
    public static void main(String[] args) {
        pattern desigPattern = new pattern();
        desigPattern.Square();
        desigPattern.Right_half_pyramid();
        desigPattern.Left_half_pyramid();
        desigPattern.Full_pyramid();
        desigPattern.Inverted_Right_half_pyramid();
        desigPattern.Inverted_Left_half_pyramid();
    }

}
