package Generics.Generic_Methods.VARARGS;

public class obj {
    static  void print(Object ... v){
        for(Object x : v){
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        print(9);
        print(1,"String",3,'h',5);
        print('D',"Helllo",'N','4','S','H');
    }
}
