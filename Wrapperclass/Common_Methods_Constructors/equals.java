package Wrapperclass.Common_Methods_Constructors;

public class equals {
    public static void main(String[] args) {
        //Consider an example corresponding to the short object
        //lly we can compare objects with different WrapperClass like int ,char,String etc...
        Short s1 = new Short("100");
        Short s2 = new Short("100");

        boolean x = s1.equals(s2);
        System.out.println("Is s1 and s2 equal " + x);
        
    }
}
