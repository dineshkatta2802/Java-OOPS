package Exception_Handling;

//Java program to demonstrate NullPointerException 
//⁡⁣⁣⁢--->Note:⁡
//⁡⁣⁢⁣Def:⁡
/*This exception is raised when referring to the 
members of a null object. Null represents nothing */
class NullPointer_Demo 
{ 
	public static void main(String args[]) 
	{ 
		try { 
			String a = null; //null value 
			System.out.println(a.charAt(0)); 
		} catch(NullPointerException e) { 
			System.out.println("NullPointerException.."); 
		} 
	} 
} 

