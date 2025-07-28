package TEST_PROGRAMS;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Input{//make sure u dont use the class name as the file name!!!
    public static void main(String[] args)throws IOException {
        //Java programm illustrating the scanner class
        Scanner x = new Scanner(System.in);
        System.out.println("Enter your lucky Number:");
        int a = x.nextInt();
        System.out.println("Your lucky number is:"+a);

        
        //Similarly to read a character or sequence of character we use Buffrered Reader
        System.out.println("Enter any word:");
        BufferedReader y = new BufferedReader(new InputStreamReader(System.in));
        Y str = y.readLine();
        System.out.println("The Entered String is:"+str);
    }
}