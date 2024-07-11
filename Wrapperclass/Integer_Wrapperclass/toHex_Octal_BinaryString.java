package Wrapperclass.Integer_Wrapperclass;

public class toHex_Octal_BinaryString {

    public static void main(String[] args) {
        String hex = Integer.toHexString(50);
        String octal = Integer.toOctalString(50);
        String binary = Integer.toBinaryString(50);

        System.out.println("Hex String :"+hex);
        System.out.println("Octal String :"+octal);
        System.out.println("Binary String :"+binary);
    }
}