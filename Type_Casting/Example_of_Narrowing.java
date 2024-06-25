package Type_Casting;
//Since we are using abstract methods to make code flexible and reusable we made class abstract
abstract class Vehicle {
    public String Brand;
    public String Model;
    private int Year;

    Vehicle(String Brand, String Model, int Year) {
        this.Brand = Brand;
        this.Model = Model;
        this.Year = Year;
    }

    public String getBrand() {
        return Brand;
    }

    public String getModel() {
        return Model;
    }

    public int getYear() {
        return Year;
    }

    //Abstract methods are use becoz these methods ahve to be implemented by Subclasses only and 
    //promotes code flexibility and reusability

    public abstract void StartEngine();

    public abstract void StopEngine();
}

class Car extends Vehicle {
    private int noofDoors;
    private boolean isConvertible;

    Car(String Brand, String Model, int Year, int noofDoors, boolean isConvertible) {
        super(Brand, Model, Year);
        this.noofDoors = noofDoors;
        this.isConvertible = isConvertible;
    }

    public int getnoofDoors() {
        return noofDoors;
    }

    public boolean isConvertible() {
        return isConvertible;
    }

    @Override
    public void StartEngine() {
        System.out.println("Car Engine Starts");
    }

    @Override
    public void StopEngine() {
        System.out.println("Car Engine Stops");
    }
}

class Bike extends Vehicle {
    private boolean hasCarrier;
    private boolean isElectric;

    Bike(String Brand, String Model, int Year, boolean hasCarrier, boolean isElectric) {
        super(Brand, Model, Year);
        this.hasCarrier = hasCarrier;
        this.isElectric = isElectric;
    }

    public boolean gethasCarrier() {
        return hasCarrier;
    }

    public boolean isElectric() {
        return isElectric;
    }

    @Override
    public void StartEngine() {
        System.out.println("Bike Engine Starts");
    }

    @Override
    public void StopEngine() {
        System.out.println("Bike Engine Stops");
    }
}

class Truck extends Vehicle {
    private double loadcapacity;
    private boolean hasTrailer;

    Truck(String Brand, String Model, int Year, double loadcapacity, boolean hasTrailer) {
        super(Brand, Model, Year);
        this.loadcapacity = loadcapacity;
        this.hasTrailer = hasTrailer;
    }

    public double getloadcapacity() {
        return loadcapacity;
    }

    public boolean hasTrailer() {
        return hasTrailer;
    }

    @Override
    public void StartEngine() {
        System.out.println("Truck Engine Starts");
    }

    @Override
    public void StopEngine() {
        System.out.println("Truck Engine Stops");
    }
}

public class Example_of_Narrowing {
    public static void main(String[] args) {
        Vehicle myCar = new Car("Swift", "Baleno", 2020, 4, false);
        Vehicle myBike = new Bike("Hero", "Passion Pro", 2012, true, false);
        Vehicle myTruck = new Truck("Ford", "F-150", 2016, 1000, true);

        System.out.println("Car: " + myCar.getBrand() + " " + myCar.getModel() + ", Doors: " + ((Car) myCar).getnoofDoors() + ", Convertible: " + ((Car) myCar).isConvertible());
        System.out.println("Bike: " + myBike.getBrand() + " " + myBike.getModel() + ", Carrier: " + ((Bike) myBike).gethasCarrier() + ", Electric: " + ((Bike) myBike).isElectric());
        System.out.println("Truck: " + myTruck.getBrand() + " " + myTruck.getModel() + ", Load Capacity: " + ((Truck) myTruck).getloadcapacity() + ", Has Trailer: " + ((Truck) myTruck).hasTrailer());

        //⁡⁣⁣⁢--->Note:⁡
        //Since Vehicle does not have the methods getnoofDoors() and isConvertible()
        // you need to cast the Vehicle reference to a Car to access these methods.

        //myCar is declared as a Vehicle but it's actually an instance of Car. To access Car-specific 
        //details like the number of doors (getnoofDoors()) and whether it's convertible (isConvertible())
        // you use downcasting like this: 
        //((Car) myCar).getnoofDoors() 
        // ((Car) myCar).isConvertible().

        /*⁡⁣⁢⁣((Car) myCar).getnoofDoors()⁡
        ⁡⁢⁣⁣(Car) myCar:⁡
        This part is called casting. Here, you're telling the Java compiler that even though myCar is declared 
        as a Vehicle (the superclass), you know for sure that at runtime it refers to an object 
        of type Car (the subclass).

        ⁡⁢⁣⁣.getnoofDoors():⁡
        After casting myCar to Car, you can now access the specific methods and properties that belong to the 
        Car class. getnoofDoors() is a method defined in the Car class that returns the number of doors the car has.

        ⁡⁢⁣⁣Purpose:⁡
        This allows you to treat myCar as a Car temporarily, so you can call Car-specific methods like 
        getnoofDoors() that are not available in the Vehicle superclass. */

        /*
        -The expression ⁡⁢⁣⁣(Car) myCar⁡ casts the Vehicle reference to a Car reference.
        -⁡⁢⁣⁣((Car) myCar).getnoofDoors()⁡ calls the getnoofDoors() method on the casted Car reference
        retrieving the number of doors of the car. */

        //Similarly its the same for Bike and Truck

        myCar.StartEngine();
        myBike.StartEngine();
        myTruck.StartEngine();

        System.out.println();

        myCar.StopEngine();
        myBike.StopEngine();
        myTruck.StopEngine();
    }
}
