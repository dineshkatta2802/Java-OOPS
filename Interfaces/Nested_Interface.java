package Interfaces;
interface Animal {
    void eat();
    void sleep();
    default void move() {
        System.out.println("Moving...");
    }

    interface AnimalDetails {
        void displayDetails();
    }
}

class Dog implements Animal.AnimalDetails {
    private String name;

    Dog(String name) {
        this.name = name;
    }

    @Override
    public void displayDetails() {
        System.out.println("Dog name: " + name);
    }

    // Implementing Animal interface methods
    @Override
    public void eat() {
        System.out.println(name + " is eating");
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping");
    }
}

public class Nested_Interface {
    public static void main(String[] args) {
        Dog x = new Dog("Toddy");
        x.eat();
        x.sleep();
        x.displayDetails();
    }
}
