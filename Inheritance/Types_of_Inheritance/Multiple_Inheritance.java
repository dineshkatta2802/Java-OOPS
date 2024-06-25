package Inheritance.Types_of_Inheritance;
// Define an interface for all animals
interface Animal {
    void eat();  // Method to eat
    void sleep();  // Method to sleep
}

// Define an interface for pets
interface Pet {
    void play();  // Method to play
    void makeSound();  // Method to make sound
}

// Dog class implementing both Animal and Pet interfaces
class Dog implements Animal, Pet {
    private String name;

    // Constructor
    public Dog(String name) {
        this.name = name;
    }

    // Implementation of Animal interface methods
    @Override
    public void eat() {
        System.out.println(name + " is eating.");
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    // Implementation of Pet interface methods
    @Override
    public void play() {
        System.out.println(name + " is playing.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof!");
    }
}

// Main class to demonstrate usage
public class Multiple_Inheritance {
    public static void main(String[] args) {
        // Create an instance of Dog
        Dog dog = new Dog("Buddy");

        // Display details using interface methods
        dog.eat();
        dog.sleep();
        dog.play();
        dog.makeSound();
    }
}
