package com.softwaretestingo.sto02004_oops.inheritance;
class Single_ParentClass
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Single Inheritance Example
	 * 
	 */
	public void parent_method()
	{
		System.out.println("Parent Class Method");
	}
}
public class STO0001_0_Single_Inheritance extends Single_ParentClass
{
	public void child_method()
	{
		System.out.println("Child class Method");
	}
	public static void main(String[] args) 
	{
		STO0001_0_Single_Inheritance obj=new STO0001_0_Single_Inheritance();
		obj.parent_method(); //Calling Parent Class Method
		obj.child_method();  //Calling Child Class Method
	}
}
