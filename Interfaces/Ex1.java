package Interfaces;

interface Animal {
    void eat();
    void sleep();
    void makeSound();
}

class Dog implements Animal {
    private String name;
    Dog(String name){
        this.name = name;
    }
    @Override
    public void eat() {
        System.out.println(name+" is eating");
    }

    @Override
    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    @Override
    public void makeSound() {
        System.out.println(name+" says Woof!");
    }
}

    class Cat implements Animal {
    private String name;
    Cat(String name){
        this.name = name;
    }
    @Override
    public void eat() {
        System.out.println(name+" is eating");
    }

    @Override
    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    @Override
    public void makeSound() {
        System.out.println(name+" says Meow!");
    }
}


public class Ex1 {
    public static void main(String[] args) {
        Dog x = new Dog("Tommy");
        Cat y = new Cat("Terex");

        x.eat();
        x.sleep();
        x.makeSound();

        y.eat();
        y.sleep();
        y.makeSound();
    }
}
