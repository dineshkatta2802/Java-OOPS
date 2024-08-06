package Generics.Class;
class x <T> {
    private T y;
    //constructor
    x(T t){
        y = t;
    }

    //method
    public void print(){
        System.out.println(y);
    }
}
public class ex1 {
    public static void main(String[] args) {
        x z = new x(20);
        z.print();
        }
    }

