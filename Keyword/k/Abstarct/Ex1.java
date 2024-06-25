package Keyword.k.Abstarct;
abstract class CSE{
    //Constructor
    CSE(){
        System.out.println("Learining!!!");
    }
    abstract void syllabus();

    void Learn(){
        System.out.println("Reading!!!");
    }
}

class CSM extends CSE{
    @Override
    void syllabus(){
        System.out.println("DLD,DT,DMS,CTT");
    }
}
public class Ex1 {
    public static void main(String[] args) {
        CSM x = new CSM();
        x.syllabus();
        x.Learn();
    }
}
