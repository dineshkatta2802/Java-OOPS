package OOPS.METHODS;

/**
 * Box
 */
class Box {
    double width;
    double height;
    double length;

    void volume(){
        System.out.println("Volume of the Box is:"+height*width*length);
    }
}

public class COM {
    public static void main(String[] args) {
        
        Box mybox = new Box();

        mybox.width=10;
        mybox.height=20;
        mybox.length=30;

        mybox.volume();
    }
}
