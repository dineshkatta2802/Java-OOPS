package Inheritance.ICAMO;

// Base class
class Person {
    String name;
    int age;

    // Base class constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Derived class
class Student extends Person {
    int studentId;

    // Derived class constructor
    Student(String name, int age, int studentId) {
        super(name, age);  // Calling the base class constructor
        this.studentId = studentId;
    }

    void display_Student() {
        super.display();
        System.out.println("Student ID: " + studentId);
    }
}
//⁡⁣⁣⁢--->Note:⁡
//The only diffrence between the Basic inheritance or the Method Overriding 
//is that we dont need to declare and enter each detail while calling method
//all this taken care by constructor and we do know that the JVM call the constructor 
//automatically so we just declare the instance variable directly while object creation

public class Constructors_Inheritance {
    public static void main(String[] args) {
        Student s1 = new Student("Dinesh", 18, 123456);
        s1.display_Student();
//⁡⁣⁣⁢⁡⁣⁣⁢--->Note:⁡
//We Dont require all this shit
//s1.Name = "Dinesh";
//s1.age = 18;
//s1.Student_id = 123456;
//s1.display_Student()
    }
}
