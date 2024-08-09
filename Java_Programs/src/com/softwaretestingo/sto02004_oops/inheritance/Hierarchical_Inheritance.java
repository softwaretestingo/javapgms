package com.softwaretestingo.sto02004_oops.inheritance;
class parent_class
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Check Hierarchical Inheritance Example 
	 * 
	 */
	public void parent_method()
	{
		System.out.println("Parent Class Method");
	}
}
class ClassA extends parent_class
{
	public void classAMethod()
	{
		System.out.println("Class A Method");
	}
}
class ClassB extends parent_class
{
	public void classBMethod()
	{
		System.out.println("Class B Method");
	}
}
class ClassC extends parent_class
{
	public void ClassCMethod()
	{
		System.out.println("Class C Method");
	}
}
public class Hierarchical_Inheritance 
{
	public static void main(String[] args)
	{
		ClassA obj1=new ClassA();
		ClassB obj2=new ClassB();
		ClassC obj3=new ClassC();
		
		// Call All Classes Method by Using above objects
		
		obj1.classAMethod();
		obj2.classBMethod();
		obj3.ClassCMethod();
	}
}