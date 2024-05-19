//⁡⁣⁣⁢Illustartion of Methods With ReturnType and With Parameter List⁡
package Methods.Returntype_Parameterlist;
    //⁡⁣⁣⁢⁡⁣⁣⁢--->Note:⁡
    //make sure to have different class names in differnt java files
    //same class names is leading to and error even though the java files are different
class Case{
    //we are declaring the variables within the method 
    double sum(double num1,double num2){
        double result = num1 +num2 ;
        return result;
    }
}
public class WR_WP {
    public static void main(String[] args) {
        Case z = new Case();
        //passing the values to the method[Sum()]
        double x = z.sum(1.2, 3.2);
        System.out.println("Sum:"+x);
    }
}
