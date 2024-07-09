package Exception_Handling.Multiple_catch;


public class Ex1 {

    public static void main(String[] args) {
        System.out.println("Open files");

        try{
            int n = args.length;
            System.out.println("n="+n);
            int a = 45/n;
            System.out.println("a="+a);
            int b[] = new int[4];
            b[5] = 30; // This line will throw an ArrayIndexOutOfBoundsException
        }

        catch(ArithmeticException e){
            System.out.println(e);
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception caught:");
        }

        //the above two catch block can also be represented as
        // catch(ArithmeticException |ArrayIndexOutOfBoundsException ae){
        //     System.out.println(e);
        // }
    }
}