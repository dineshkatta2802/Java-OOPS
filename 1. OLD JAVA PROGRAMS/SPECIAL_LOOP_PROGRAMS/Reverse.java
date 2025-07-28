import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = x.nextInt();
        int rem,b=0;//the rem and b must be declatres outside while loop only!!!
        while(a!=0){
            rem = a%10;
            b = b*10+rem;
            a=a/10;           
        }
        System.out.print("REversed number is:"+b);
    }
}
