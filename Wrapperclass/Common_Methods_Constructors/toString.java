package Wrapperclass.Common_Methods_Constructors;

public class toString {
    public static void main(String[] args) {
        //llly we can change the Wrapperclass for other classes

        Byte b = new Byte((byte)10);
        String x = b.toString();
        System.out.println("Byte to string: " + x);
        //In Order to check the datatype of the variable follow the belw code
        System.out.println("Now wht is the datatype of b:" +((Object)b).getClass().getName());
        System.out.println("Now wht is the datatype of x:" +((Object)x).getClass().getName());

    }
}
