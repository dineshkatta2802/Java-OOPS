// package OOPS.METHODS;

// class phone{
//     //creating Attributes
//     String color;
//     double height;
//     int weight;
//     int memory;
//     int pixels;

//     //declaring methods
//     public void print_details(){
//         System.out.println(color);
//         System.out.println(height);
//         System.out.println(weight);
//         System.out.println(memory);
//         System.out.println(pixels);
//     }
// }
// public class Classes {

//     public static void main(String[] args) {
//         //Creating a new object called Samsung-phone
//         phone samsung = new phone();
//         //Setting the attributes to the samsung phone 
//         samsung.color = "white";
//         samsung.height = 15.6;
//         samsung.weight = 250;
//         samsung.memory = 128;
//         samsung.pixels = 50;

//         //Creating another new object
//         phone iphone = new phone();
//         //Setting attributes to the iphone 
//         iphone.color = "Black";
//         iphone.height = 12.7;
//         iphone.weight = 250;
//         iphone.memory = 512;
//         iphone.pixels = 120;

//         //Now withe the help of printdetails methods lets 
//         //gonna print the attribute of the declared objects
//         samsung.print_details();
//         iphone.print_details();

//     }
// }

//----------------------------------------------------------------------------------------------------------------------
//Let's create a new class called say car!
package OOPS.METHODS;

import java.util.Scanner;

//Let's create a Car class
class car{
    String model;
    int YOM;//Year of Manufacture
    String color;
    String Fuel_type;
    int ground_Clearance;

    public void print_details(){
        System.out.println(model);
        System.out.println(YOM);
        System.out.println(color);
        System.out.println(Fuel_type);
        System.out.println(ground_Clearance);
    }
}
public class Classes {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        //BMW object is created
        car BMW =new car();
        //Setting attributes
        System.out.println("Enter the Model of Car:");
        BMW.model =x.next();
        System.out.println("Enter the Year of Manufacture:");
        BMW.YOM = x.nextInt();
        System.out.println("Enter the Color of the Car:");
        BMW.color = x.next();
        System.out.println("Enter the Fuel_Type:");
        BMW.Fuel_type = x.next();
        System.out.println("Enter the Ground clearence:");
        BMW.ground_Clearance = x.nextInt();

        car Supra =new car();
        //Setting attributes
        System.out.println("Enter the Model of Car:");
        Supra.model =x.next();
        System.out.println("Enter the Year of Manufacture:");
        Supra.YOM = x.nextInt();
        System.out.println("Enter the Color of the Car:");
        Supra.color = x.next();
        System.out.println("Enter the Fuel_Type:");
        Supra.Fuel_type = x.next();
        System.out.println("Enter the Ground clearence:");
        Supra.ground_Clearance = x.nextInt();

        car Bugatti =new car();
        //Setting attributes
        System.out.println("Enter the Model of Car:");
        Bugatti.model =x.next();
        System.out.println("Enter the Year of Manufacture:");
        Bugatti.YOM = x.nextInt();
        System.out.println("Enter the Color of the Car:");
        Bugatti.color = x.next();
        System.out.println("Enter the Fuel_Type:");
        Bugatti.Fuel_type = x.next();
        System.out.println("Enter the Ground clearence:");
        Bugatti.ground_Clearance = x.nextInt();

        car Macleran =new car();
        //Setting attributes
        System.out.println("Enter the Model of Car:");
        Macleran.model =x.next();
        System.out.println("Enter the Year of Manufacture:");
        Macleran.YOM = x.nextInt();
        System.out.println("Enter the Color of the Car:");
        Macleran.color = x.next();
        System.out.println("Enter the Fuel_Type:");
        Macleran.Fuel_type = x.next();
        System.out.println("Enter the Ground clearence:");
        Macleran.ground_Clearance = x.nextInt();

        //Now lets print the details entered
        BMW.print_details();
        Supra.print_details();
        Bugatti.print_details();
        Macleran.print_details();
    }
}