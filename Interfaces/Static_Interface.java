package Interfaces;
interface Animal {
    void eat();
    void sleep();
    default void move(){
        System.out.println("Moving...");
    }
    static void info(){
        System.out.println("This is an animal");
    }
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
}

public class Static_Interface {
    public static void main(String[] args) {
        Animal.info();
        Dog x = new Dog("Toddy");
        x.eat();
        x.sleep();
        // x.move();
    }
}
