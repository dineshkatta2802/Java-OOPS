package SPECIAL_LOOP_PROGRAMS;
import java.util.Scanner;
public class Amstrong {
    public static void main(String[] args) {
    Scanner x=new Scanner(System.in);
    System.out.println("Enter the Number:");
    int a=x.nextInt();
    int r,arm=0,temp=a;

    while(a>0){
        r=a%10;
        arm=(r*r*r)+r;
        a=a/10;
    }
    if(temp==arm){
        System.out.println("Amstrong Number!");
    }
    else{
        System.out.println("Not Amstrong Number!");
    }

    }
}
