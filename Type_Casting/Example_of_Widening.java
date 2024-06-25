package Type_Casting;
abstract class  Vehicle{
    public String Brand;
    public String Model;
    private int Year;
    Vehicle(String Brand,String Model,int Year){
        this.Brand = Brand;
        this.Model = Model;
        this.Year = Year;
    }
    public String getBrand(){
        return Brand;
    }
    public String getModel(){
        return Model;
    }
    public int getYear(){
        return Year;
    }
    public abstract void StartEngine();
    public abstract void StopEngine();
}

class Car extends Vehicle{
    private int noofDoors;
    Car(String Brand,String Model,int Year,int noofDoors){
        super(Brand,Model,Year);
        this.noofDoors = noofDoors;
    }
    public int getnoofDoors(){
        return noofDoors;
    }
    @Override
    public void StartEngine(){
        System.out.println("Car Engine Starts");
    }
    @Override
    public void StopEngine(){
        System.out.println("Car Engine Stops");
    }
}

class Bike extends Vehicle{
    private boolean hasCarrier;
    Bike(String Brand,String Model,int Year,boolean hasCarrier){
        super(Brand,Model,Year);
        this.hasCarrier = hasCarrier;
    }
    public boolean gethasCarrier(){
        return hasCarrier;
    }
    @Override
    public void StartEngine(){
        System.out.println("Bike Engine Starts");
    }
    @Override
    public void StopEngine(){
        System.out.println("Bike Engine Stops");
    }
}

class Truck extends Vehicle{
    private double loadcapacity;
    Truck(String Brand,String Model,int Year,double loadcapacity){
        super(Brand,Model,Year);
        this.loadcapacity = loadcapacity;
    }
    public double getloadcapacity(){
        return loadcapacity;
    }
    @Override
    public void StartEngine(){
        System.out.println("Truck Engine Starts");
    }
    @Override
    public void StopEngine(){
        System.out.println("Truck Engine Stops");
    }
}
public class Example_of_Widening {
    public static void main(String[] args) {
        Vehicle myCar = new Car("Swift", "Baleno", 2020, 4);
        Vehicle myBike = new Bike("Hero", "Passion Pro", 2012, true);
        Vehicle myTruck = new Truck("Ford", "F-150", 2016, 1000);

        myCar.StartEngine();
        myBike.StartEngine();
        myTruck.StartEngine();

        System.out.println();
        
        myCar.StopEngine();
        myBike.StopEngine();
        myTruck.StopEngine();
    }
}
