package Wrapperclass.Common_Methods_Constructors;

public class Compareto {
    public static void main(String[] args) {
        //syntax:
        //public int compareTo(WrapperClass shortObject)
        

        //Consider an example corresponding to the short object
        //lly we can compare objects with different WrapperClass like int ,char,String etc...
        Short s1 = new Short("100");
        Short s2 = new Short("100");

        int x = s1.compareTo(s2);
        System.out.println("Comapring s1 and s2 is " + x);
    }
}
