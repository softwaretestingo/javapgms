package com.softwaretestingo.innerclass;
public class StaticNestedClassEx 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Static Nested Class Example
	 * 
	 */
	//Static Nested Class
	static class NestedDemo
	{
		public void myMethod()
		{
			System.out.println("Static nested class method is called");
		}
	}
	public static void main(String[] args) 
	{
		//Accessing the static nested class without initializing the object of Outer class
		StaticNestedClassEx.NestedDemo obj= new StaticNestedClassEx.NestedDemo();
		obj.myMethod();
	}
}