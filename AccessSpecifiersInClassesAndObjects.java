// class person{
//     //properties-Variables
//     //--->Note:
//     //The Name and the age has been declared within the class
// String name = "Ravi";
// int age = 18;

// //Actions-Methods
// void talk(){
//     System.out.println("Hello my name is"+name);
//     System.out.println("My age is"+age);

// }

// }
// public class AccessSpecifiersInClassesAndObjects {
//     public static void main(String[] args) {
//         person p1 = new person();
//         //Name and age has been declared and intialized after the object is created
//         p1.name = "Raju";
//         p1.age = 20;
//     }
// }

//--->Note:
//In the above code in person class the name and teh age has been specified: Ravi and 18
//and the same name and age has again specified after initializing and declaring the object :Raju and 20
//But we get the Output as Raju and 20

//The above example shows that the data is not encrypted or protected
//thus there is no securit for data Ravi and 18
//Since the protection of data is very important to secure the divulge and sensitive info we use 
//"Private": Access Specifier while declaring variable

//Now consider the same code that is similar to the above code
class person{
    //properties-Variables
    //--->Note:
    //The Name and the age has been declared within the class
private String name = "Ravi";
private int age = 18;

//Actions-Methods
void talk(){
    System.out.println("Hello my name is"+name);
    System.out.println("My age is"+age);

}

}
public class AccessSpecifiersInClassesAndObjects {
    public static void main(String[] args) {
        person p1 = new person();
        //Name and age has been declared and intialized after the object is created
        p1.name = "Raju";
        p1.age = 20;
        // here the error is thrown since the name and age property i.e, variables has been 
        //declared and protected permanently
    }
}



