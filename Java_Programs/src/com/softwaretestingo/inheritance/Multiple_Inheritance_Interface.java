package com.softwaretestingo.inheritance;
interface interface1
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Multiple Inheritance Interface Example
	 * 
	 */
	default	void parentMethod1()
	{
		System.out.println("Interface1 Method Called");
	}
}
interface interface2
{
	default void parentMethod2()
	{
		System.out.println("Interface2 Method Called");
	}
}
//In Java
public class Multiple_Inheritance_Interface implements interface1, interface2 
{
	public static void main(String[] args) 
	{
		Multiple_Inheritance_Interface obj=new Multiple_Inheritance_Interface();
		obj.parentMethod1();
		obj.parentMethod2();
	}
}
