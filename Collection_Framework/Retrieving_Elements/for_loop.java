package Collection_Framework.Retrieving_Elements;
import java.util.ArrayList;
import java.util.List;
public class for_loop {
    public static void main(String[] args) {
        //Creating array list
        List<String> names = new ArrayList<String>();
        //We can inituate like this 
        names.add("Dinesh");
        names.add("Divya");
        names.add("Daxton");
        //or
        //like this
        names.addAll(List.of("Suresh", "Pooja", "Ramesh"));

        for (String name : names) {
            System.out.println(name);
        }
    }
}
