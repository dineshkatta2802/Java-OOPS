package Collection_Framework.Retrieving_Elements;
import java.util.ArrayList;
import java.util.ListIterator;
public class listIterator {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Dinesh");
        names.add("Divya");
        names.add("Daxton");

        ListIterator<String> LI = names.listIterator();
        while (LI.hasNext()) {
            String x = LI.next();
            System.out.println(x);
        }
        //it gives the list of elements in reverse order
        System.out.println("Previous Element");
        while (LI.hasPrevious()) {
            String x = LI.previous();
            System.out.println(x);
        }
    }
}
