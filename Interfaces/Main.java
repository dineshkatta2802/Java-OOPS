package Interfaces;
// Animal.java
public interface Animal {
    void eat();
    void makeSound();
}

// Dog.java
public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

// Cat.java
public class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

// AnimalService.java
public class AnimalService {
    private Animal animal;

    public AnimalService(Animal animal) {
        this.animal = animal;
    }

    public void performActions() {
        animal.eat();
        animal.makeSound();
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();  // Create a Dog object
        AnimalService dogService = new AnimalService(dog);  // Create AnimalService for the Dog
        dogService.performActions();  // Perform actions (eat and make sound) on the Dog

        Animal cat = new Cat();  // Create a Cat object
        AnimalService catService = new AnimalService(cat);  // Create AnimalService for the Cat
        catService.performActions();  // Perform actions (eat and make sound) on the Cat
    }
}
