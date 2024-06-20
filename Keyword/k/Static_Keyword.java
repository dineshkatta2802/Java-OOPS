package Keyword.k;
//⁡⁣⁣⁢Note:⁡
//It is declared by using the "Static" Keyword
//A Static method is a method that doednot act upon the instance variables 
//this is because the JVM first executes the Ststic methods and only then it create the Objects
class demo{
    //Illustrating the Ststic Keyword
        //Instance Variables
        int x;
        demo(int x){
            this.x = x;
        }

        static void access(){
            System.out.println("Inside the Static Variable");       
            System.out.println("x="+x);                               
        }                                                             
}                                                                    ⁡ 
⁡⁣⁢⁣// //Note:
// //If we run this program we get an error   
// //bcoz the JVM executes the Static method first  
// //and later it creates the object which results to the errors⁡
public class Static_Keyword {
    public static void main(String[] args) {
        demo z = new demo(10);//Parameterized Constructor
        demo.access();
    }
}
