package Inheritance.Super_Keyword;
class Animal{  
    void eat(){System.out.println("eating...");}  
    }  
    class Dog extends Animal{  
    void eat(){System.out.println("eating bread...");}  
    void bark(){System.out.println("barking...");}  
    void work(){  
    super.eat();  
    bark();  
    }  
    }  
    class Super_Keyword_Invoke_Methods{  
    public static void main(String args[]){  
    Dog d=new Dog();  
    d.work();  
    }}  
