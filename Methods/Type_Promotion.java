package Methods;
//⁡⁣⁣⁢--->Note:⁡
//Type promotion occurs when a smaller data type is automatically converted to a larger 
//data type during method invocation to match the method's parameter type. For example:
//byte can be promoted to short, int, long, float, or double.
//short can be promoted to int, long, float, or double.
//char can be promoted to int, long, float, or double.
//int can be promoted to long, float, or double.
class Test {
    void show(int a) {
        System.out.println("int argument: " + a);
    }

    void show(double a) {
        System.out.println("double argument: " + a);
    }

    void show(String a) {
        System.out.println("String argument: " + a);
    }
}
public class Type_Promotion {
    public static void main(String[] args) {
                Test obj = new Test();
        
                obj.show(10);       // Calls show(int a)
                obj.show(10.5);     // Calls show(double a)
                obj.show("Hello");  // Calls show(String a)
        
                byte b = 10;
                obj.show(b);        // Calls show(int a) due to type promotion
            }
        }
        