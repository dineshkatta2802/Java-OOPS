package Inheritance.ICAMO;
//⁡⁣⁣⁢Base Class⁡
class Person{
    //Two Instance variabes are created
    public String Name;
    private int age;

    //Using the Accessor and Mutator Methods
    //Accessor-Getter
    //Muttator-Setter
    public void setage(int age){
        this.age = age;
    }

    public int getage(){
        return age;
    }

    void display(){
        System.out.println("Name:"+Name);
        System.out.println("Age:"+age);
    }
}

//⁡⁣⁣⁢Derived Class⁡
//Creating the extended class
class Student extends Person{
    int Student_id;
    @Override
    //⁡⁣⁣⁡⁣⁣⁢--->Note:⁡
    //@Override annotation is a useful tool for ensuring that methods are 
    //correctly overridden, improving code clarity, and providing compile-time checks to prevent errors.
    void display(){
        super.display();
        System.out.println("Student ID:"+Student_id);
    }
}
public class Inheritance_AccessSpecifiers{

    public static void main(String[] args) {
        Student s1  = new Student();
        s1.Name = "Dinesh";
        s1.setage(20);
        s1.Student_id = 123456;
        s1.display();
    }
}