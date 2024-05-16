package Constructors;
class flower{
    String name;
    int petals;
    int sepals;

    flower(String n ,int p,int s){
        // name = "Dathura";
        // petals = 5;
        // sepals = 10;
        name = n;
        petals = p;
        sepals = s;
        System.out.println("Helo there I am a "+n+" Flower consisting of "+p+" Petals and "+s+" sepals in Total");
    }
}
public class x {
    public static void main(String[] args) {
        flower flw = new flower("Dathura",5,10);
    }
}
