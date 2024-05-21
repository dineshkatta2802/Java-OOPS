package Keyword.This;
// Java code for using this() to
// invoke current class constructor
class Person {
    String name;
    int age;

    // Default constructor
    Person() {
        this("Dinesh", 18); // Calls the parameterized constructor
    }

    // Parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.display();
		System.out.println("In this program the \'Default Constructor\' calls the \'Parameterized Constructor\' which is invoked init");
    }
}




