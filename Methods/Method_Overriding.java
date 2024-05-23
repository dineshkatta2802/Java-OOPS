package Methods;
//⁡⁣⁣⁢--->Note:⁡
//If subclass (child class) has the same method as declared in the parent class,
// it is known as method overriding in Java.

//In other words, If a subclass provides the specific implementation of the method that
// has been declared by one of its parent class, it is known as method overriding.

//Java Program to demonstrate the real scenario of Java Method Overriding  
//where three classes are overriding the method of a parent class.  
//Creating a parent class.  
class Bank{  
    int getRateOfInterest(){return 0;}  
}  
//Creating child classes.  
class SBI extends Bank{  
    int getRateOfInterest(){return 8;}  
}  
class ICICI extends Bank{  
    int getRateOfInterest(){return 7;}  
}  
class AXIS extends Bank{  
    int getRateOfInterest(){return 9;}  
}  

//Test class to create objects and call the methods  
public class Method_Overriding{  
    public static void main(String args[]){  
    SBI s=new SBI();  
    ICICI i=new ICICI();  
    AXIS a=new AXIS();  
    System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());  
    System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());  
    System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());  
    }  
    }  
    
