package Interfaces;
//⁡⁣⁣⁢--->Note:⁡
//Multilevel inheritance occurs when a class is derived from a
// class that is also derived from another class.
// This forms a chain of inheritance.
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("The puppy weeps.");
    }
}

public class Multilevel_Inheritance {
    public static void main(String[] args) {
        Puppy myPuppy = new Puppy();
        myPuppy.eat();  // Inherited method from Animal
        myPuppy.bark(); // Inherited method from Dog
        myPuppy.weep(); // Method from Puppy class
    }
}
