// ⁡⁣⁣⁢Illustartion of Method Without Return Type and Without Parameter list⁡
package Methods.Returntype_Parameterlist;
class sample {
//Lets create an Instance Variable 
double num1,num2;
sample(double x,double y){
    num1 = x;
    num2 = y;
}
void sum(){
    double result = num1 + num2;
    System.out.println("Sum = "+result);
}
}
public class WOR_WOP {

    public static void main(String[] args) {
        sample x = new sample(1.2, 3.2);
        x.sum();
    }
}
