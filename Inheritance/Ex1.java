package Inheritance;
//Base-Class
class vehicle{
    //2 instance variables are created
    int gear;
    int speed;
    //Parameterised constructor is created
    vehicle(int gear,int speed){
    this.gear = gear;
    this.speed = speed;
    }

    //Method1
    void accelerating(int increment){
        speed += increment;
        System.out.println("Vehicle is accelerating and spped is:"+speed);
        System.out.println("The gear is:"+gear);
    }

    //Method2
    void brake(int decrement){
        speed -= decrement;
        System.out.println("Appling brakes!");
        System.out.println("Vehicle is slowing down and speed is:"+speed);
    }
}

//Derived Class
class Car extends vehicle{
    int cargear;
    //parameterised Constructor
    Car(int gear,int speed){
        //Now lets link with the super class i.e the Base class
        //Calling the Base class Constructor "Vehicle(int gear,int speed)"
        super(gear,speed);
    }

    void changegear(int newgear){
        gear = newgear;
        System.out.println("Changing gear!");
        System.out.println("Car has chaned gera to:"+gear);
    }
}

public class Ex1 {

    public static void main(String[] args) {
        Car Baleno = new Car(1, 0);
        Baleno.accelerating(30);
        Baleno.changegear(2);
        Baleno.accelerating(50);
        Baleno.brake(20);
    }
}