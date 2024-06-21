package Inheritance;
//⁡⁣⁣⁢Base Class⁡
class Laptop{
    int version;
    int RAM;

    //Parameterised constructor
    Laptop(int version,int RAM){
        this.version = version;
        this.RAM = RAM;
    }
    void ExtendRAM(int Extend_RAM){
        RAM += Extend_RAM;
        System.out.println("The memory has been ugraded to :"+RAM);
    }

    void ShrinkRAM(int Shrink_RAM){
        RAM -= Shrink_RAM;
        System.out.println("The memory has been shrinked to :"+RAM);
    }
}

//⁡⁣⁣⁢Derived Class⁡
class HP extends Laptop{
    //Parameterised Constructor
    HP(int version,int RAM){
        super(version,RAM);
    }

    void changeMemorycard(int newcard){
        RAM = newcard;
        System.out.println("the memory card is beign changed");
        System.out.println("The memory card is changed to:"+RAM);
    }
}

//⁡⁣⁣⁢Driver Class⁡
public class Ex2 {

    public static void main(String[] args) {
        HP x = new HP(10, 500);
        x.ExtendRAM(1000);
        x.changeMemorycard(2);
        x.ExtendRAM(500);
        x.ShrinkRAM(2000);
    }
}