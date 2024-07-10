package Wrapperclass;
//Illustratiing different ways in which the wrapper class can be shown.
public class WrapperCreationExample {
    public static void main(String[] args) {
        // Using Constructor (Deprecated)
        Integer x1 = new Integer(10); // Deprecated since Java 9
        Double y1 = new Double(10.5);  // Deprecated since Java 9

        // Using valueOf method
        Integer x2 = Integer.valueOf(10);
        Double y2 = Double.valueOf(10.5);
        Boolean z2 = Boolean.valueOf(true);

        // Using Autoboxing
        Integer x3 = 10; // Autoboxing
        Double y3 = 10.5; // Autoboxing
        Boolean z3 = true; // Autoboxing

        // Parsing Strings
        Integer x4 = Integer.parseInt("10");
        Double y4 = Double.parseDouble("10.5");
        Boolean z4 = Boolean.parseBoolean("true");

        // Display the values
        System.out.println("Integer object using Constructor: " + x1);
        System.out.println("Double object using Constructor: " + y1);
System.out.println();
        System.out.println("Integer object using valueOf: " + x2);
        System.out.println("Double object using valueOf: " + y2);
        System.out.println("Boolean object using valueOf: " + z2);
System.out.println();
        System.out.println("Integer object using Autoboxing: " + x3);
        System.out.println("Double object using Autoboxing: " + y3);
        System.out.println("Boolean object using Autoboxing: " + z3);
System.out.println();
        System.out.println("Integer object using parseInt: " + x4);
        System.out.println("Double object using parseDouble: " + y4);
        System.out.println("Boolean object using parseBoolean: " + z4);
    }
}
