package SPECIAL_LOOP_PROGRAMS;
import java.util.Scanner;
public class Tables {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Entre the Table value:");
        int a = x.nextInt();

        for(int i=0;i<=10;i++){
            int c=a*i;
            System.out.println(a+"*"+i+"="+c);
        }
    }
}
