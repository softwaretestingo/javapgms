package com.softwaretestingo.constructor;

public class ConstructorOverloadingEx 
{
	ConstructorOverloadingEx()
	{
		System.out.println("Default Constructor is called");
	}
	ConstructorOverloadingEx(String Name)
	{
		System.out.println("Parameterized Constructor is called");
	}
	public static void main(String[] args) 
	{
		ConstructorOverloadingEx obj=new ConstructorOverloadingEx();
		ConstructorOverloadingEx obj1=new ConstructorOverloadingEx("Softwaretestingo");
	}

}
