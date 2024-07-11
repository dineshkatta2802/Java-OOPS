package Wrapperclass.Short_Wrapperclass;

public class constructor1 {

    public static void main(String[] args) {
        short x = 10;
        Short wrapper = new Short(x);
        System.out.println("short object: " + wrapper);

        //llly short string constructor
        Short y= new Short("10");
        System.out.println("short object as string: " + y);
    }
}