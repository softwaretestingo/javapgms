package com.softwaretestingo.interfacepackage;
interface interfaceWithStaticMethod
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Interface With Static Method With Example
	 * 
	 */
	// Abstract Method
	void method1();
	
	// Default Method
	default void defaultMethod()
	{
		System.out.println("Default Method Of Interface");
	}
	
	// Static Method
	static void staticMethod()
	{
		System.out.println("Static Method Of Interface");
	}
}
public class StaticMethodEx1 implements interfaceWithStaticMethod
{
	@Override
	public void method1() 
	{
		System.out.println("Method1 Class Of Interface");
	}
	public static void main(String[] args) 
	{
		StaticMethodEx1 obj=new StaticMethodEx1();
		obj.method1();
		obj.defaultMethod();
	}
}