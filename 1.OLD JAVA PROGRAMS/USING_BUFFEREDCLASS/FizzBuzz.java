package USING_BUFFEREDCLASS;

public class FizzBuzz {
    public static void main(String[] args) {
        for(int i=0;i<=100;i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            else if (i%3==0) {
                System.out.println("Fizz");
            }
            else if(i%5==0){
                System.out.println("Buzz");
            }
        }
//--->Infinite loop
        // for(int i=0 ; ; ){
        //     if(i%3==0 && i%5==0){
        //         System.out.println("FizzBuzz");
        //     }
        //     else if (i%3==0) {
        //         System.out.println("Fizz");
        //     }
        //     else if(i%5==0){
        //         System.out.println("Buzz");
        //     }
        // }
    }
}


