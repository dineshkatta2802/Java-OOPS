package Methods.Passing_Methods;
class Person {
    String name;
    int age;

    // Constructor to initialize the fields
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display the person's details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Passing_object{
    // Method to update the Person object's fields
    public static void updatePerson(Person p2) {
        p2.name = "Divya";
        p2.age = 16;
    }

    public static void main(String[] args) {
        // Create a new Person object
        Person p1 = new Person("Dinesh", 18);

        // Display the original details
        System.out.println("Before update:");
        p1.display();

        // Call the updatePerson method and pass the p1 object
        updatePerson(p1);
        //⁡⁣⁣⁢Note⁡⁡⁣⁣⁢:⁡
        //Person p2 = p1
        //this is what happens inside after passing the object as argument to the parameter
        //now the command goes to the person class and a new object is created p2
        //now in the method u have given the name and age of the person p2 diffrent

        // Display the updated details
        System.out.println("After update:");
        p1.display();
    }
}
