package Methods.TypesOfMethods;
class Instance{
    private String name;
    private int age;
    /*We used ⁡⁣⁣⁢"Private"⁡ as the access specifier to ⁡⁣⁢⁣encapsulate⁡(protect and make it hidden from outside world)
    *  -->With private variables, you can ⁡⁣⁢⁣control⁡ how these variables are 
    * accessed and modified. 
    * -->You typically provide public ⁡⁣⁢⁣getter(Accessor method) and setter(Mutator method) methods⁡ (like getAge() and setAge(int newAge)) 
    * to manage access to these variables. 
    *  -->If we want to modify you only need to update the getter and setter methods rather than changing 
    * every place where the variables are accessed directly.*/
    
    //⁡⁣⁣⁢--->Note:⁡
    //Now creating a setname()and set_age() methods which are also called as ⁡⁣⁣⁢Mutator Methods⁡
    //these Mutator methods can ⁡⁣⁢⁣access and modify⁡ the variables
    public void Set_name(String name){
        this.name = name;
        //⁡⁣⁢⁣this.name⁡ refer to the instantaneous variables
    }

    public void Set_age(int age){
        this.age = age;
    }

    //⁡⁣⁣⁢--->Note:⁡
    //Now Creating a get_name() and get_age() methods which are also called as ⁡⁣⁣⁢Accessors Methods⁡
    //these Access methods can ⁡⁣⁢⁣only access and cannot modify⁡ 

    //⁡⁣⁣⁢--->Note:⁡
    //As we could see that the methods has got ⁡⁣⁢⁣return type⁡ and the there are ⁡⁣⁢⁣no Parameter list⁡
    public String get_name(){
        return name;
    }

    public int get_age(){
        return age;
    }
}
public class Instance_Method {
    public static void main(String[] args) {
        Instance x = new Instance();
        x.Set_name("Dinesh");
        x.Set_age(20);
        System.out.println("Name:"+x.get_name());
        System.out.println("Age:"+x.get_age());
    }
}
