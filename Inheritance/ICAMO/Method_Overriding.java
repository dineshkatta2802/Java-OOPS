package Inheritance.ICAMO;
//⁡⁣⁣⁢Base Class⁡
class Person{
    //Two Instance variabes are created
    String Name;
    int age;

    void display(){
        System.out.println("Name:"+Name);
        System.out.println("Age:"+age);
    }
}

//⁡⁣⁣⁢Derived Class⁡
//Craeting the extended class
class Student extends Person{
    int Student_id;
    //Overriding the displat method of the parent class
    @Override
    //⁡⁣⁣⁢--->Note:⁡
    //@Override annotation is a useful tool for ensuring that methods are 
    //correctly overridden, improving code clarity, and providing compile-time checks to prevent errors.

    void display(){                                         //⁡⁣⁣⁢--->Note:⁡
        super.display();                                    //The only diffrence between the Basic inheritance is that
        System.out.println("Student ID:"+Student_id);       //the methods in the Parent class(Super class) and the
    }                                                       //child class(sub class) are same ,so it is called
}                                                           //⁡⁣⁢⁣Method Overriden⁡ and we can see the method that is beign
public class Method_Overriding {                            //called in Child class,which here is Student class is 
                                                            //"super.display", which is actually the parent class method
    public static void main(String[] args) {
        Student s1  = new Student();
        s1.Name = "Dinesh";
        s1.age = 18;
        s1.Student_id = 123456;
        s1.display();//Calls the Overriden method of the Student Class
    }
}



