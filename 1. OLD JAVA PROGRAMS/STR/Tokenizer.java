package STR;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Tokenizer {
    public static void main(String[] args) {
        Scanner x =  new Scanner(System.in);
    System.out.println("Enter the string:");
    String s = x.nextLine();
    StringTokenizer y = new StringTokenizer(s);

    //--->hasMoreTokens();
    String t = " ";
    System.out.println(s.hasMoreTokens());
    System.out.println(t.hasMoreTokens());
            System.out.println();
    //nextTokens();
    while(s.hasMoreTokens()){
        System.out.println("Next Tokens:"+s.nextTokens());
    }
            System.out.println();
    //countTokens();
    int z = s.countTokens();
    System.out.println("Number of tokens:"+z);
    }
    
}

