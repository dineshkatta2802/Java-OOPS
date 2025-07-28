package TEST_PROGRAMS;

/**
 * loop
 */
public class loop {

    public static void main(String[] args) {
        int i=0;
        while(i<=100){
            System.out.println(i%7==0);
            i++;
        }
    }
}