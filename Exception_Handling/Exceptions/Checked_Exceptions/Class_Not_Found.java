package Exception_Handling.Checked_Exceptions;

public class Class_Not_Found {
    public static void main(String[] args) {
        // Java program to demonstrate ClassNotFoundException 
		try{ 
			Class.forName("Class1"); // Class1 is not defined 
		} 
		catch(ClassNotFoundException e){ 
			System.out.println(e); 
			System.out.println("Class Not Found..."); 
		} 

    }
}
