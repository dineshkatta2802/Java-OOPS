package TEST_PROGRAMS;
public class student {

	int id;
	String name;
	int age;
	student(int i,String n)
	{
	    id=i;
	    name=n;
	}
	student(int i,String n,int a)
	{
	    id=i;
	    name=n;
	    age=a;
	}
	void display()
	{
	 System.out.println(id+""+name+""+age);
	}
	public static void main(String[]args)
	{
	    student S1=new student(1111,"maru");
	    student S2=new student(2222,"hari",30);
	    S1.display();
	    S2.display();
	}

}
