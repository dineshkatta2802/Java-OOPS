package Wrapperclass.Integer_Wrapperclass;

public class constructor1 {
    public static void main(String[] args) {
        int x = 10;
        Integer wrapper = new Integer(x);
        System.out.println("short object: " + wrapper);

        //llly short string constructor
        Integer y= new Integer("10");
        System.out.println("short object as string: " + y);
    }
}
