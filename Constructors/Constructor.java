package Constructors;

//--->Note:
//Default Constructor
class person{
    String name;
    int age;

    person(){
        name = "Raju";
        age = 18;
    }


    void talk(){
        System.out.println("Hello my name is"+name);
        System.out.println("My age is"+age);
    }

}
public class Constructor {
    public static void main(String[] args) {
        person p1 = new person();
        // p1.talk();
    }
}

//--->Note:
//The Constructor is parameterised
// class person{
//     String name;
//     int age;

//     person(String s,int i){
//         name = s;
//         age = i;
//     }


//     void talk(){
//         System.out.println("Hello my name is "+name);
//         System.out.println("My age is "+age);
//     }

// }

// public class Constructor {
//     public static void main(String[] args) {
//         person p1 = new person("Sita",25);
//         p1.talk();
//     }
// }

