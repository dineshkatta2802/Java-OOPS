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

    void fetch(){
        System.out.println("fetch Balls");
    }
    }
public class Narrowing_Object {

    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        myAnimal.makesound();
        //Since we know that the DownCasting is "not safe"
        //"Instance of" operator checks the if 'myAnimal' is actually the object of class 'Dog
        // If the check passes, myAnimal is downcast to Dog using (Dog) myAnimal;
        // This explicit cast allows us to treat myAnimal as a Dog.
        //Now that myAnimal is downcast to Dog, we can call myDog.fetch()
        // a method specific to the Dog class.
        if (myAnimal instanceof Dog) {
            Dog myDog = (Dog) myAnimal; // Downcasting
            myDog.fetch(); // Outputs: Fetches ball
        }
        


        //--->Note:
        //The above Declaration of object can also be done in the following way
        // Dog Terex = new Dog();
        // //Assigning the sub class object "Dog" to the variable of super class
        // Animal myAnimal = Terex;//Upcast to Animal
        // //here we make the Object of Sublass and Object of super class same
        // //Now,calling subclass method with superclass Object
        // //⁡⁣⁣⁢⁡⁣⁣⁢--->Note:⁡
        // //The method names should be same in Super and Sub class
        // myAnimal.makesound();
    }

}