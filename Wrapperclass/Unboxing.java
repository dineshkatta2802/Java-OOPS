package Wrapperclass;

import java.nio.charset.CharacterCodingException;

public class Unboxing {
    public static void main(String[] args) {
        //Illustatin a simple example of Un-Boxing
        Integer a = 100;
        Double b = 10.23;
        Character c = 'X';

        int x = a;
        double y = b;
        char z = c;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
