package Inheritance.Types_of_Inheritance;
//⁡⁣⁣⁢--->Note:⁡
//Hierarchical inheritance happens when multiple 
//classes inherit from a single superclass. 
//This establishes a tree-like structure.

//⁡⁣⁢⁣Super Class⁡
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

//⁡⁣⁢⁣Sub-Class1⁡
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

//⁡⁣⁢⁣Sub-Class2⁡
class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
}

public class Hierarchial_Inheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        Cat myCat = new Cat();
        
        myDog.eat();  // Inherited method from Animal
        myDog.bark(); // Method from Dog class
        
        myCat.eat();  // Inherited method from Animal
        myCat.meow(); // Method from Cat class
    }
}
