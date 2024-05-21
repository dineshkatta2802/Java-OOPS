package Methods.Passing_Methods;
class Interchanging{
    void swap(int a ,int b){
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println(a +"\t"+b);
    }
}
public class Passing_primitive_Datatype {
    public static void main(String[] args) {
        int c =10;
        int d=20;
        System.out.println(c+"\t"+d);
        Interchanging x = new Interchanging();
        x.swap(c, d);

    }
}
