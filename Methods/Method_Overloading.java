package Methods;
//⁡⁣⁣⁢--->Note:⁡
//A  class having 2 or maore methos with same name but different parameter list
class Overloading{
    static int add(int a, int b){
        return a+b;
    }

    static int  add (int a, int b, int c){
        return a+b+c;
    }

    //Method Overloading with differnt datatypes
    static int mul(int a ,int b){
        return a*b;
    }

    static double mul(double a,double b, double c){
        return a*b*c;
    }
    
}
public class Method_Overloading {
    public static void main(String[] args) {
        Overloading x = new Overloading();
        System.out.println(x.add(10,20));
        System.out.println(x.add(10, 20, 30));
        System.out.println(x.mul(10, 20));
        System.out.println(x.mul(10.2, 20.1, 30.12));
    }
}
