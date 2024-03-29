package myPackage;
class class1 
{
	// Private constructor
	private class1() 
	{
		// Constructor logic here
	}

	// Non-static method
	public void method1() 
	{
		// Method logic here
		System.out.println("Method1 called from class1");
	}

	// Public static factory method to get an instance of class1
	public static class1 getInstance() 
	{
		return new class1();
	}
}

public class Class2 
{
	public static void main(String[] args) 
	{
		// Accessing method1 from class2
		class1 obj = class1.getInstance();
		obj.method1();
	}
}