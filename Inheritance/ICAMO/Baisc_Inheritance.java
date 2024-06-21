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
    void display_Student(){
        display();
        System.out.println("Student ID:"+Student_id);
    }
}
public class Baisc_Inheritance {

    public static void main(String[] args) {
        Student s1  = new Student();
        s1.Name = "Dinesh";
        s1.age = 18;
        s1.Student_id = 123456;
        s1.display_Student();
    }
}