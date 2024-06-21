package Inheritance;

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

class HP extends Laptop{
    
}
public class Ex2 {

    public static void main(String[] args) {
        
    }
}