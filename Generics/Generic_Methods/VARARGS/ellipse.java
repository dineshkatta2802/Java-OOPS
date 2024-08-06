package Generics.Generic_Methods.VARARGS;

public class ellipse {
    static <T> void print(T ... v){
        for(T x : v){
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        print(9);
        print(1,2,3,4,5);
        print('D','I','N','E','S','H');
    }
}
