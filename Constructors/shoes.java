package Constructors;
class Adidas{
    String name;
    int cost;

    Adidas(String s,int i){
        name = s;
        cost = i;
    }

    void display(){
        System.out.println("A Bright pop");
        System.out.println("The name of the shoe is Adidas "+name);
        System.out.println("The price of the shoes "+cost);
    }
}
public class shoes {
    public static void main(String[] args) {
        Adidas cupa = new Adidas("Sense", 2000);
        cupa.display();
    }
}
