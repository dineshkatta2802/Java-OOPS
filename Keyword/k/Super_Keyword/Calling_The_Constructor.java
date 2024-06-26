package Keyword.k.Super_Keyword;
class Parent {
    //Parent Class Constructor
    Parent(){
        System.out.println("Inside the Parent Class Consttructor");
    }
}

class child extends Parent{
    //Child Class Constructor
    child(){
        //Super Keyword to call the Parent class constructor
        super();
        System.out.println("Inside the Child Class Constructor");
    }
}
public class Calling_The_Constructor {
    public static void main(String[] args) {
        child Dinesh = new child();
    }
}
