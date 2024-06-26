package Keyword.k.Super_Keyword;

class Parent {
    int x = 10;
}

class Child extends Parent {
    int x = 20;

    void display() {
        System.out.println("Child class field: " + x);
        System.out.println("Parent class field: " + super.x);
    }
}

public class Calling_The_Fields {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}

