package com.softwaretestingo.sto011_STRINGS;
class ParentClass
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Super Keyword Constructor Calling With Super Keyword 
	 * 
	 */
	public ParentClass() 
	{
		System.out.println("Parent Class No Arg Consructor Executed");
	}
	public ParentClass(String abc) 
	{
		System.out.println("Parent Class With Argument Consructor Executed");
	}
}
public class Super_Keyword_With_Constructor extends ParentClass
{
	public Super_Keyword_With_Constructor()
	{
		//super();
		super("Welcome");
		System.out.println("Child Class Constructor Got Executed");
	}
	public static void main(String[] args) 
	{
		Super_Keyword_With_Constructor obj=new Super_Keyword_With_Constructor();
		System.out.println("Main Method executed");
	}
}