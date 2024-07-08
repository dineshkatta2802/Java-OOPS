package Keyword.k.Abstarct;
abstract class y{
    abstract void calc(double x);
}

class z extends y{
@Override
void calc(double x){
    System.out.println("Sqaure:"+(x*x));
}
}

class w extends y{
    @Override
    void calc(double x){
        System.out.println("Sqrt:"+Math.sqrt(x));
    }
}

class v extends y{
    @Override
    void calc(double x){
        System.out.println("Cube:"+(x*x*x));
    }
}
public class Abstract_Keyword {
    public static void main(String[] args) {
        z z1 = new z();
        z1.calc(10);

        w w1 = new w();
        w1.calc(100);

        v v1 = new v();
        v1.calc(10);
        
    }
}
