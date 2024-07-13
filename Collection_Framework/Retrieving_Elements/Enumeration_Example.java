package Collection_Framework.Retrieving_Elements;
import java.util.Enumeration;
import java.util.Vector;

public class Enumeration_Example {
    public static void main(String[] args) {
        // Creating a Vector and adding elements to it
        Vector<String> vector = new Vector<>();
        vector.add("Dinesh");
        vector.add("Divya");
        vector.add("Daxton");

        // Obtaining the Enumeration
        Enumeration<String> enumeration = vector.elements();

        // Iterating through the Vector using Enumeration
        while (enumeration.hasMoreElements()) {
            String fruit = enumeration.nextElement();
            System.out.println(fruit);
        }
    }
}
