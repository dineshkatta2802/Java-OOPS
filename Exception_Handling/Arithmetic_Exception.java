package Exception_Handling;
//Here lets see whether there the given expression can throw the exception
public class Arithmetic_Exception {

    public static void main(String[] args) {
        // //⁡⁣⁣⁢Case 1:⁡
        // int x = 50/0;
        // System.out.println(x);
        // System.out.println("The is not termiinated");

        /*⁡⁣⁣⁢Output:⁡
         * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
         * at Exception_Handling.Ex1.main(Ex1.java:5)
         */

        // //⁡⁣⁣⁢Case 2:⁡
        // //Now consider the below code
        // try{
        //     //we thought that the this expression can throw the exception so we place this bit of code in try block
        //     int x = 50/0;
        // }
        // //in this catch block we write what kind of exception that is to be handled sinece we are dealing with the 
        // //integers and number we used the Arithmetic Exception
        // catch(ArithmeticException e){
        //     System.out.println(e);
        // }
        // System.out.println("the code is not terminated");

        /*⁡⁣⁣⁢Output:⁡
         * java.lang.ArithmeticException: / by zero
         *  the code is not terminated
         */

        //⁡⁣⁣⁢Case 3:⁡
        //Now consider 
        try{
            //The print statement "the code is not terminated", is brought inside the try block
            int x = 50/0;
            System.out.println("the code is not terminated");
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        /*⁡⁣⁣⁡⁣⁣⁢Output:⁡⁡
         * java.lang.ArithmeticException: / by zero
         */
    }
}
