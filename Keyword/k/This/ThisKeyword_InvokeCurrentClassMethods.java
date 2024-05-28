package Keyword.k.This;
class ICCM{
    //lets create a method named void
    void x(){
        System.out.println("Hello World");
    }

    void y(){
        this.x();// it can also be called by x();
        System.out.println("Fuck this world");
    }
}
public class ThisKeyword_InvokeCurrentClassMethods {
    public static void main(String[] args) {
        ICCM z = new ICCM();
        z.x();
        System.out.println("In this we just called x method only");
        z.y();
        System.out.println("In this we called the y method which has alo got x method invoked in it");
    }
}
