package Wrapperclass.Byte_Wrapperclass;

public class valueOf {
    public static void main(String[] args) {
        byte x = 20;
        Byte b = Byte.valueOf(x);
        System.out.println("Byte value: " + b);

        //similarly we can eben convert the byte into other primitive types
        short s = b.shortValue();
        int i = b.intValue();
        long l = b.longValue();
        float f = b.floatValue();
        double d = b.doubleValue();
        System.out.println("Short value: " + s);
        System.out.println("Integer value: " + i);
        System.out.println("Long value: " + l);
        System.out.println("Float value: " + f);
        System.out.println("Double value: " + d);
    }
}
