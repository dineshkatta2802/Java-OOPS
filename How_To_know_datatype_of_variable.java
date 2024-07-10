//In order to find the datatype of the variable there are 2 methods 
//1.to create some functions to show the datatype 
//2.use getclass() and getName() 

//method 1
class sample {
    void displayType(int x){
        System.out.println("Integer ");
    }
    void displayType(double x){
        System.out.println("Double ");
    }
    void displayType(Float x){
        System.out.println("Float ");
    }
    void displayType(String x){
        System.out.println("String ");
    }
    void displayType(Character x){
        System.out.println("Character ");
    }

    void displayType(boolean x){
        System.out.println("Boolean ");
    }

}
public class How_To_know_datatype_of_variable {
    public static void main(String[] args) {
        sample y = new sample();
        int x = 10;
        double z = 10.5;
        boolean b = true;
        String s = "Hello";

        y.displayType(s);
        y.displayType(x);
        y.displayType(z);
        y.displayType(b);

        //--------------------------------------------
        //method 2
        System.out.println("x datatype: " + ((Object)x).getClass().getName());
        System.out.println("s datatype: " +((Object)s).getClass().getName());
        System.out.println("z datatype: " +((Object)z).getClass().getName());
        System.out.println("b datatype: " +((Object)b).getClass().getName());
    }
}
