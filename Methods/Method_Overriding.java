//⁡⁣⁣⁢--->Note:⁡
//Method overriding is one of the ways by which Java achieves ⁡⁣⁢⁣Run Time Polymorphism⁡⁣⁢⁣(Dynamic Polymorphism)⁡⁡. 
//Writing 2 or more methods in super and sub class such that the methods have same name and parameters.


package Methods;
// Base Class
class Parent {
	void show() { System.out.println("Parent's show()"); }
}

// Inherited class
class Child extends Parent {
	// This method overrides show() of Parent
	@Override void show()    //⁡⁣⁣⁢--->Note:⁡
                             //@Override annotation is to inform the compiler and the 
                             //reader that the method is intended to override a method 
                             //in its superclass (Parent in this case)
	{
		System.out.println("Child's show()");
	}
}

class Method_Overriding {
	public static void main(String[] args)
	{
		// If a Parent type reference refers
		// to a Parent object, then Parent's
		// show is called
		Parent obj1 = new Parent();
		obj1.show();

		// If a Parent type reference refers
		// to a Child object Child's show()
		// is called. This is called RUN TIME
		// POLYMORPHISM.
		Parent obj2 = new Child();
		obj2.show();
	}
}
