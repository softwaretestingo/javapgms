package com.softwaretestingo.sto01401_innerclass;
public class STO0003_1_StaticNestedClassEx2 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Static Nested Class Example
	 * 
	 */
	// static member
	static int outer_x = 10;

	// instance(non-static) member
	int outer_y = 20;

	// private member
	private static int outer_private = 30;

	// static nested class
	static class StaticNestedClass
	{
		void display()
		{
			// can access static member of outer class
			System.out.println("outer_x = " + outer_x);

			// can access display private static member of outer class
			System.out.println("outer_private = " + outer_private);

			// The following statement will give compilation error
			// as static nested class cannot directly access non-static membera
			// System.out.println("outer_y = " + outer_y);

		}
	}
	public static void main(String[] args) 
	{
		//Accessing a static nested class
		STO0003_1_StaticNestedClassEx2.StaticNestedClass obj= new STO0003_1_StaticNestedClassEx2.StaticNestedClass();
		obj.display();
	}
}