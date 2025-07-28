package TEST_PROGRAMS;
public class Operators {
    public static void main(Y[]args){
        //As we could observe here we use + symbol instead of ','(comma)
        //--->Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        int a = 10;
        int b = 20;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        //--->Unary Operators
        System.out.println("Unary Operators:");
        int a = 10;
        int b = 10;
        System.out.println("Postincrement:"+(a++));  
        System.out.println("Preincrement:"+(++a));   
        System.out.println("Postdecrement:"+(b--));
        System.out.println("Predecrement:"+(--b));

        //--->Assignment operators
        System.out.println("Assignment Operators:");
        int a = 10;
        int x = 10;
        System.out.println("X+=a:"+(x+=a));
        System.out.println("X-=a:"+(x-=a));
        System.out.println("X*=a:"+(x*=a));
        System.out.println("X/=a:"+(x/=a));
        System.out.println("X%=a:"+(x%=a));

        //--->Relational Operators
        System.out.println("Relational Operators:");
        int a = 10;
        int b=5;
        System.out.println("a>b:"+(a>b));
        System.out.println("a<b:"+(a<b));
        System.out.println("a>=b:"+(a>=b));
        System.out.println("a<=b:"+(a<=b));
        System.out.println("a!=b:"+(a!=b));
        
        //--->Logical Operators
        System.out.println("Logical Operators:");
        int a = 10;
        int b = 5;
        System.out.println("(a>b)&&(b<a):"+(a>b&&b<a)); 
        System.out.println("(a<b)&&(b<a):"+(a<b&&b<a));
        System.out.println("(a>b)||(b<a):"+(a>b||b<a));
        System.out.println("(a>b)||(b<a):"+(a<b||b>a));
        System.out.println("(a!=b):"+(a!=b));

        //--->Ternary Operators
        System.out.println("Ternary Operators:");
        System.out.println("(a>b)?true:false ="+((a>b)?true:false));

        //--->Bitwise Operators
        System.out.println("Bitwise Operators:");
        int a = 0b1010;
        int b = 0b1100;
        System.out.println("a & b: " + (a & b));
        System.out.println("a | b: " + (a | b));
        System.out.println("a ^ b: " + (a ^ b));
        System.out.println("~a: " + (~a));

        //--->Shift Operators
        System.out.println("Shift Operators:");
        int a = 0b1010;
        int b = 0b1100;
        System.out.println("a << 2: " + (a << 2));
        System.out.println("a >> 1: " + (b >> 1));
        System.out.println("a >>> 1: " + (b >>> 1));
    }
    }


