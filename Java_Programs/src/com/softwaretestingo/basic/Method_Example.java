package com.softwaretestingo.basic;
public class Method_Example 
{
	public static void main(String[] args) 
	{
		System.out.println("Going to Call static method myMethod()");
		// method call
		myMethod();
		System.out.println("myMethod was executed successfully!");
	}
	// method definition
	private static void myMethod(){
		System.out.println("Printing from inside myMethod()!");
	}
}