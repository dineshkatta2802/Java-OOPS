package Inheritance.Types_of_Inheritance;
//⁡⁣⁣⁢--->Note:⁡
//Single inheritance refers to a scenario where a class
// inherits from one superclass only. This establishes a 
//straightforward parent-child relationship.

//⁡⁣⁢⁣Super class⁡
class Animal{
void eat(){
    System.out.println("Animals eat!");
}
}
//⁡⁣⁢⁣Subclass⁡
class dog extends Animal{
void bark(){
    System.out.println("Woof! Woof!");
}
}
public class Single_Inheritance {
    public static void main(String[] args) {
        dog x = new dog();
        x.eat();
        x.bark();
    }
}
