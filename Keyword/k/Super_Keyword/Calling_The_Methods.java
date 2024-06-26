package Inheritance.Super_Keyword;
class Parent {
    void mssg() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    void mssg(){
        System.out.println("Child class methods");
    }
    void display() {
        // Calling the parent class method
        super.mssg(); 
        mssg();
    }
}

public class Calling_The_Methods {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
