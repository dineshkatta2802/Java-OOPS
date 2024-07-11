package Wrapperclass.Common_Methods_Constructors;

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

        //valueOf(String value)
        String y = "40";
        System.out.println("Byte object form string value: " + b);
        Byte c = Byte.valueOf(y);

        //Similarly we can convert the byte object string value into other primitive types
        short z = c.shortValue();
        int p = c.intValue();
        long q = c.longValue();
        float r = c.floatValue();
        double h = c.doubleValue();
        System.out.println("Short value: " + z);
        System.out.println("Integer value: " + p);
        System.out.println("Long value: " + q);
        System.out.println("Float value: " + r);
        System.out.println("Double value: " + h);
        
    }
}
