package Wrapperclass.Common_Methods_Constructors;

public class hashcode {
    public static void main(String[] args) {
        short value = 10;
        Short x = new Short(value);
        int y = x.hashCode();
        System.out.println("Hashcode of short value: " + y);
    }
}
