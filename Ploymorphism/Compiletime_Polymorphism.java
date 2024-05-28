package Ploymorphism;
//⁡⁣⁣⁢--->Note:⁡
//A  class having 2 or more methods with same name but different parameter list
//Also known as ⁡⁣⁢⁣Compile-time Polymorphism⁡

class Overloading{
    //Method Overloading with ⁡⁣⁢⁣different Parameteers⁡
    static int add(int a, int b){
        return a+b;
    }

    static int  add (int a, int b, int c){
        return a+b+c;
    }

    //Method Overloading with ⁡⁣⁢⁣differnt datatypes⁡
    static int mul(int a ,int b){
        return a*b;
    }

    static double mul(double a,double b, double c){
        return a*b*c;
    }

    // //Method Overloading with different Order of parameters
    // static void Student_id(int a , String b){
    //     System.out.println(a+" "+b); ;
    // }

    // static void Student_id(String  b ,int a){
    //     System.out.println(b+" "+a);
    // }
    
}
public class Compiletime_Polymorphism{
    public static void main(String[] args) {
        Overloading x = new Overloading();
        System.out.println(x.add(10,20));
        System.out.println(x.add(10, 20, 30));
        System.out.println(x.mul(10, 20));
        System.out.println(x.mul(10.2, 20.1, 30.12));
        // System.out.println(x.Student_id(10, "Dinesh"));  
        // System.out.println(x.Student_id("Dinesh", 20));  
    }
}
