package com.softwaretestingo.inheritance;
class ParentClass1
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Multiple Inheritance Example
	 * 
	 */
	public void parentMethod1()
	{
		System.out.println("Parent Method Called");
	}
}
class ParentClass2
{
	public void parentMethod2()
	{
		System.out.println("Parent Method Called");
	}
}
//In Java
/*
 * public class Multiple_Inheritance extends ParentClass1, ParentClass2 { public
 * static void main(String[] args) { Multiple_Inheritance obj=new
 * Multiple_Inheritance(); obj.parentMethod1(); obj.parentMethod2(); } }
 */