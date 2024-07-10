package Wrapperclass.Byte_Wrapperclass;

public class decode {
    public static void main(String[] args) {
        try {
            String octal = "0o36";
            String hex = "ox1E";
            String binary = "0b11110";
            String decimal = "30";

            Byte octalBytes = Byte.decode(octal);
            Byte hexBytes = Byte.decode(hex);
            Byte binaryBytes = Byte.decode(binary);
            Byte decimalBytes = Byte.decode(decimal);

            System.out.println("Octal: " + octalBytes);
            System.out.println("Hexadecimal: " + hexBytes);
            System.out.println("Binary: " + binaryBytes);
            System.out.println("Decimal: " + decimalBytes);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid octal, hexadecimal, binary, or decimal number.");
        } finally {
            System.out.println("This is the way to use parseStrings");
        }

        try {
            String invalidString = "invalid";
            Byte invalidByte = Byte.decode(invalidString);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid octal, hexadecimal, binary, or decimal number.");
        }
    }
}