package com.softwaretestingo.constructor;
class MyParentClass 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Constructor Calling From Child To Parent Class
	 * 
	 */
	MyParentClass()
	{
		System.out.println("MyParentClass Constructor");
	}
}
public class MyChildClassEx extends MyParentClass
{
	MyChildClassEx() 
	{
		System.out.println("MyChildClass Constructor");
	}
	public static void main(String[] args) 
	{
		new MyChildClassEx();
	}
}