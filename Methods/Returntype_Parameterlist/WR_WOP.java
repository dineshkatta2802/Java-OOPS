// ⁡⁣⁣⁢Illustrating the Method With Return Type and Without Parameter List⁡
package Methods.Returntype_Parameterlist;

class example {
    double num1, num2;
    //⁡⁣⁣⁢--->Note:⁡
    //make sure to have different class names in differnt java files
    //same class names is leading to and error even though the java files are different
    example(double x, double y) {
        num1 = x;
        num2 = y;
    }
    //⁡⁣⁣⁢--->Note:⁡
    //Since we have return type instead of using void we used double to return value
    double sum() {
        double result = num1 + num2;
        return result;
    }
}

public class WR_WOP {
    public static void main(String[] args) {
        example z = new example(1.2, 3.2);
        //⁡⁣⁣⁢--->Note:⁡
        //Since in the Sum() method we didnot use the Syatem.out.println()
        //to print the result since we have return instead
        double result_value = z.sum();
        //To print the value in result which has been returened lets 
        //assign another variable to print the value in the result variable
        System.out.println("Sum: " + result_value);
    }
}

