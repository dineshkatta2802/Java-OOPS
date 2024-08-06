package Generics.Generic_Methods.VARARGS;

public class array {
     static <T> void printing(T [] t){
        for(T x : t){
            System.out.println(x +" ");
        }
        System.out.println();
    } 
    public static void main(String[] args) {
        //Here we are using the wrapper class bcoz in gr=neric mthods to call it mjust be an object
        Integer Integer_Array[] = {1,2,3,4,5,6,7,8,9};
        Character Char_Array[] = {'H','E','L','L','O'};
        Double double_Array[] = {2.15,45.80,53.5478,51.23};
        System.out.println("Array contains:");
        printing(Integer_Array);
        printing(Char_Array);
        printing(double_Array);
    }
}
