package STR;

import java.util.StringJoiner;

public class Joiner {
    public static void main(String[] args) {
        StringJoiner Str1 = new StringJoiner("");
        Str1.add("Hello");
        Str1.add("Geeks");
        Str1.add("for");
        Str1.add("Geeks");
        System.out.println("The String Joiner 1:"+Str1.toString());
        System.out.println("The Length of the String:"+Str1.length());

        StringJoiner Str2 = new StringJoiner("");
        Str1.add("I'm");
        Str1.add("a");
        Str1.add("Computer");
        Str1.add("Geek");
        System.out.println("The String Joiner 1:"+Str2.toString());
        System.out.println("The Length of the String:"+Str2.length());

        StringJoiner Str = Str1.merge(Str2);
        System.out.println(Str.toString());
    }
}
