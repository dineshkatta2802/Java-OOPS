package Inheritance;
//Base-Class
class vehicle{
    //2 instance variables are created
    int gear;
    int speed;
    //Parameterised constructor is created
    vehicle(int gear,int speed){
    this.gear = gear;             //⁡⁣⁣⁢--->Note:⁡
    this.speed = speed;           //The "this" keyword is actually helping the initialised construct
    }                             //during the object creation to store the values in the instance variables

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

//⁡⁣⁢⁣What is actually happening inside ⁡
//⁡⁢⁣⁣1.Baleno.accelarating(30);⁡
//In this line the speed which is zero at 1st gear i.e,
//In line 15
//Speed += incrememnt;
//Speed = Speed + increment;
//Speed = 0 +30
//Speed = 30 

//⁡⁢⁣⁣2.Baleno.changegear(2);⁡
//In line 39
//gear = newgear;
//gear = 2;

//⁡⁢⁣⁣3.Baleno.accelarating(30);⁡
//In this line the speed which is zero at 1st gear i.e,
//In line 15
//Speed += incrememnt;
//Speed = Speed + increment;
//Speed = 30 +50
//Speed = 80 

//⁡⁢⁣⁣4.Baleno.brake(20);⁡
//In this line the speed which is zero at 1st gear i.e,
//In line 15
//Speed += decrememnt;
//Speed = Speed + decrement;
//Speed = 80 - 20
//Speed = 60
