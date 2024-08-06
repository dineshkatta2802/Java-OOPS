package Generics.Generic_Methods;
public class Generic_Methods {
    //Creating generic methods
    //Here T is just a Datatype which can accept any tpe of data like int, char , string etc...
    static <T> void generic(T t){
        System.out.println(t);
    }
    public static void main(String[] args) {
        Generic_Methods obj = new Generic_Methods();
        obj.generic(101);
        obj.generic("Hello dinesh");
        obj.generic(2.1314);
        //here the methods can also be called without the object 
        System.out.println("calling generic methods without making an object");
        //this is bcoz in stativ=c mthods we can invoke methods without object
        generic(102);
        generic("Hello mf");
        generic(30.545);
    }
}
