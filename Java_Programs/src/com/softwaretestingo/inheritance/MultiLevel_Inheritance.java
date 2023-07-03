package com.softwaretestingo.inheritance;

class MultiLevel_ParentClass
{
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