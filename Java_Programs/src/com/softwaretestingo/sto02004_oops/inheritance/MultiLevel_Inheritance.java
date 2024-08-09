package com.softwaretestingo.sto02004_oops.inheritance;
class MultiLevel_ParentClass
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Multi-Level Inheritance Example
	 * 
	 */
	public void parent_method()
	{
		System.out.println("Parent Class Method");
	}
}
class Middle_Class extends MultiLevel_ParentClass
{
	public void middleClass_method()
	{
		System.out.println("Middle Class Method");
	}
}
public class MultiLevel_Inheritance extends Middle_Class
{
	public void child_method()
	{
		System.out.println("Child Class Method");
	}
	public static void main(String[] args) 
	{
		MultiLevel_Inheritance obj=new MultiLevel_Inheritance();
		obj.parent_method(); //Calling Grand Parent Method
		obj.middleClass_method(); // Calling Parent Method
		obj.child_method();  //Calling Child Method	
	}
}