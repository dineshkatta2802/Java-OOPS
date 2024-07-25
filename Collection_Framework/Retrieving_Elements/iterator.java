package Collection_Framework.Retrieving_Elements;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iterator {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Dinesh");
        names.add("Divya");
        names.add("Daxton");

        Iterator<String> i = names.iterator();
        while (i.hasNext()) {
            String x = i.next();
            System.out.println("Current elements:"+x);

            if ("Dinesh".equals(x)) {
                i.remove();
                System.out.println("Dinesh is removed");
                
                System.out.println("Remaining elements:"+names);
                // This part should be modified to iterate again over the remaining elements
                
            }
        }
    }
}
