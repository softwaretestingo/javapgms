package com.softwaretestingo.basic;
class Super_Parent_Class 
{
	Super_Parent_Class() 
	{
		System.out.println("Parent Class Default Constructor");
	}
	
	Super_Parent_Class(String str)
	{
		System.out.println(str +": This is Parametrized Constructor Of Parent Class");
	}
}
public class Super_Keyword_With_Param_Constructor extends Super_Parent_Class
{
	Super_Keyword_With_Param_Constructor() 
	{
		super("User");
		System.out.println("Child Class Default Constructor");
	}
	public void display()
	{
		System.out.println("Simply Printing Hello");
	}
	public static void main(String[] args) 
	{
	
		Super_Keyword_With_Param_Constructor obj=new Super_Keyword_With_Param_Constructor();
		obj.display();
	}

}

