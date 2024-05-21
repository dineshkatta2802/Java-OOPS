package Methods.TypesOfMethods;
//⁡⁣⁣⁢--->Note:⁡
//Declared bby ⁡⁣⁢⁣"Static"⁡ keyword
//Doesnot act upon instance variables
//The reason is that the JVM executes the static maethod and only then it creates the objects
class x{
    int y;
    x(int y){
        this.y = y;
    }
    static void access(){
        System.out.println(y);
    }
}
public class Static_Methods {
    public static void main(String[] args) {
        x z = new X(10);
        x.access();
    }
}
//In the above code the code has an error and cannot be executed

