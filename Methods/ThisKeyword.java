package Methods;
class sample{
    //Creating Instance Variables 
    int a ;
    int b;

    //creating parameterised constructor
    sample(int a,int b){
        this.a = a;
        this.b = b;
    }

    void show(){
        System.out.println("a="+a+" b="+b);
    }

    //⁡⁣⁣⁡⁣⁣⁢--->Note:⁡
    /*As we could see here the instance variables and the parametere of the constructors are same 
    *which we dont take usually 
    *Suppose consider this code
⁡⁣⁢⁣    class sample{
        int num1;
        int num2;

        sample(int x,int y){
            num1 = x;
            num2 = y;
        }

        void show(){
            System.out.println("The values of num1 ="+num1+"and values of num2 ="+num2);
        }
    }

    public class ex{
        public static voiod main (string args[]{
            sample x = new sample(10,20);
            x.show();
        }
    }⁡

    In the above code you can see that the instance variables and parameter variables are totally different
    so you can easily pass the parameter values when we create an object

    Now,
    Coming back to our code we see that the instance variable and the parameter are the same 
    so it's just like
⁡⁣⁢⁣    class sample{
        int a;
        int b;

        sample(int a,int b){
            a=a;
            b=b;
        }
    }⁡

    You can see that the instance variable is assigned to same variables which are bascically poarameter

    so whe you use some show or display method to display the variables then it shows "null"
    i.e,
    ⁡⁣⁢⁣void show(){
        system.out.println("a="+a+"b="+b);
    }⁡
    you get output as
⁡⁣⁢⁣    a=0
    b=0⁡

    so inorder to avoid this problem we use "this" key word
    ⁡⁣⁡⁣⁢⁣    class sample{
        int a;
        int b;

        sample(int a,int b){
            this.a = a;
            this.b = b;
        }

        void show(){
            System.out.println("a="+a+"b="+b);
        }
    }

    public class ex{
        public static voiod main (string args[]{
            sample x = new sample(10,20);
            x.show();
        }
    }⁡

    Now here,
    ⁡⁣⁢⁣⁡⁣⁢⁣"this.a"⁡⁡ and ⁡⁣⁢⁣⁡⁣⁢⁣"this.b"⁡⁡ refers to instance variables and here ⁡⁣⁢⁣⁡⁣⁢⁣"a"⁡⁡ and ⁡⁣⁢⁣"b"⁡ refers to parameters 
    you get output as
    ⁡⁣⁢⁣a=10
    b=20⁡
    */
}
public class ThisKeyword {
    public static void main(String[] args) {
        sample x = new sample(10, 20);
        x.show();
    }
}
