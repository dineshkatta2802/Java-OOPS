/*Consider an person named Raju is an object that actually exist in physical world 
 * now Raju has some properties like name age color sex etc...
 * and Raju also conatin some action like walking drinking running etc...
 * And we see that an another person named ravi does have same properties and functions just like Raju
 */

    /*⁡⁣⁣⁢--->Note:⁡
  * Here the Properties are Variables and 
  * The Action are called the Methods in Java language
  */
package Classesandobjects;
import java.util.Scanner;

class person {
//lets creates some Properties-Variables along with datatype
String name;
int age;

//lets Create some Actions-Methods

//⁡⁣⁣⁢--->Note:⁡
//here "Void" is used because there it neither gives us any output result 
//nor it takes any input data from user 
void talk(){
    System.out.println("Hello there I'm"+name);
    System.out.println("My age is"+age);
}
}
public class CO {
public static void main(String[] args) {
    //lets Initialize the object 
    person p1 = new person();

    //lets take the name and the age of the person p1 from the user
    //Initializing scanner class
    Scanner z = new Scanner(System.in);
    System.out.println("Enter the Name of the person p1:");
    String x = z.nextLine();
    System.out.println("Enter the age of the person p1:");
    int y = z.nextInt();

    p1.name = x;
    p1.age = y;

    //once the input are takes lets call the talk() method
    p1.talk();
    

}
}