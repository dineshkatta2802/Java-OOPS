package Type_Casting;
//We know that for Typcasting objects we need some relation between two classes
//like Inheritance
//⁡⁣⁢⁣Super Class⁡
class Animal{
    void makesound(){
        System.out.println("Animals eat!");
    }
    }
    
//⁡⁣⁢⁣Subclass⁡
    class Dog extends Animal{
        @Override
    void makesound(){
        System.out.println("Woof! Woof!");
    }
    }
public class Widening_Object {

    public static void main(String[] args) {
        Dog Terex = new Dog();
        //Assigning the sub class object "Dog" to the variable of super class
        Animal myAnimal = Terex;//Upcast to Animal
        //here we make the Object of Sublass and Object of super class same
        //Now,calling subclass method with superclass Object
        //⁡⁣⁣⁢⁡⁣⁣⁢--->Note:⁡
        //The method names should be same in Super and Sub class
        myAnimal.makesound();

        //--->Note:
        //The above Declaration of object can also be done in the following way
        //For Method
        // Animal myAnimal = new Dog();
        // myAnimal.makesound();

        //For Parameterised Constructor
        //Animal myAnimal = new Dog("Terex",2....);
    }

}