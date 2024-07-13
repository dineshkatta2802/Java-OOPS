package Collection_Framework.Retrieving_Elements;
import java.util.ArrayList;
import java.util.List;
public class for_loop {
    public static void main(String[] args) {
        //Creating array list
        List<String> names = new ArrayList<String>();
        names.add("Dinesh");
        names.add("Divya");
        names.add("Daxton");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
