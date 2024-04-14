package com.softwaretestingo.basic;
public class Static_Method_Example 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Static Method Example
	 * @param args
	 */
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