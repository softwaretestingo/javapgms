package com.softwaretestingo.sto016_constructors;
public class ConstructorOverloadingEx 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Constructor Overloading Example
	 * 
	 */
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