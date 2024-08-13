package com.softwaretestingo.sto023_interface;
interface interfaceWithDefaultMethod2
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Default Method Example
	 * 
	 */
	default void method1()
	{
		System.out.println("Default Method Of Parent Interface");
	}
}
interface childInterface2 extends interfaceWithDefaultMethod2
{
	@Override
	default void method1()
	{
		System.out.println("Default Method Of Child Interface");
	}
}
public class DefaultMethodEx3 implements interfaceWithDefaultMethod2,childInterface2
{
	public static void main(String[] args) 
	{
		new DefaultMethodEx3().method1();
	}
}