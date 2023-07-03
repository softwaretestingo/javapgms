package com.softwaretestingo.inheritance;

class Single_ParentClass
{
	public void parent_method()
	{
		System.out.println("Parent Class Method");
	}
}
public class Single_Inheritance extends Single_ParentClass
{
	public void child_method()
	{
		System.out.println("Child class Method");
	}
	public static void main(String[] args) 
	{
		Single_Inheritance obj=new Single_Inheritance();
		obj.parent_method(); //Calling Parent Class Method
		obj.child_method();  //Calling Child Class Method
	}
}
