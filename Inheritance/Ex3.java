package Inheritance;
class Shape{
    String Color;
    //Parameterised Constructor
    Shape(String Color){
        this.Color = Color;
    }

    //Method
    void draw(){
        System.out.println("Drawing a shape of "+Color+" sides");
    }
}

class Circle extends Shape{
    double radius;
    //Parameterised constructor
    Circle(String Color , double radius){
        super(Color);
        this.radius = radius;
    }

    void area_of_circle(){
        double PI = 3.1415;
        double area = PI * radius* radius;
        System.out.println("The area of the cicle is:"+area);
    }
}

class Square extends Shape{
    double length;
    Square(String Color,double length){
        super(Color);
        this.length = length;
    }

    void area_of_square(){
        double area_Square = length*length;
        System.out.println("The length of Square is:"+area_Square);
    }
}
public class Ex3 {
    public static void main(String[] args) {
        Circle x = new Circle("Red",2.1);
        x.draw();
        x.area_of_circle();
        Square y = new Square("Blue", 4);
        y.area_of_square();
    }
}
