package com.softwaretestingo.sto015_OBJECTS;
public class STO0001_1_CreateObjectEx2  implements Cloneable
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Create Duplicate Object With Clone() method Example
	 * 
	 */
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		// Way 1: using new operator or keyword
		STO0001_1_CreateObjectEx2 obj=new STO0001_1_CreateObjectEx2();

		// Way 2: using clone() method of Object class
		STO0001_1_CreateObjectEx2 obj1 = (STO0001_1_CreateObjectEx2)obj.clone();

		// invoking display() method
		obj1.display();
	}
	
	//display() method to test
	public void display()
	{
		System.out.println("display() method is invoked");
	}
}