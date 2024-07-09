package Wrapperclass.Character_Wrapperclass;

public class isWhiteSpace {
    public static void main(String[] args) {
        System.out.println(Character.isWhitespace('A'));
        System.out.println(Character.isWhitespace(9));
        System.out.println(Character.isWhitespace('9'));
        System.out.println(Character.isWhitespace(' '));
        System.out.println(Character.isWhitespace('\t'));
        System.out.println(Character.isWhitespace('\n'));
        System.out.println(Character.isWhitespace('\r'));
        System.out.println(Character.isWhitespace('\u00A0'));
    }
}
