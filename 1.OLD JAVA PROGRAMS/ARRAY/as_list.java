package ARRAY;
import java.util.Arrays;
import java.util.List;

/**
 * as_list
 */
public class as_list {

    public static void main(String[] args) {
        //1.Array as argument in asList()
        String arr[]={"Java","Python","C","Ruby","Flutter"};
        List<String> x = Arrays.asList(arr);
        System.out.println(x);

        //2.Element as argument in asList();
        List<String> y = Arrays.asList("Java","Python","C","Ruby","Flutter");
        System.out.println(y);
    }
}