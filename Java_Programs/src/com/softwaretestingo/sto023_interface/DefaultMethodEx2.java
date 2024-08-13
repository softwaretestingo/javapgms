package com.softwaretestingo.sto023_interface;
interface interfaceWithDefaultMethod1
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
interface childInterface extends interfaceWithDefaultMethod1
{
	@Override
	default void method1()
	{
		System.out.println("Default Method Of Child Interface");
	}
}
class MyClass implements interfaceWithDefaultMethod1, childInterface
{
	@Override
	public void method1()
	{
		System.out.println("Method From Class");
	}
}
public class DefaultMethodEx2 extends MyClass implements interfaceWithDefaultMethod1,childInterface
{
	public static void main(String[] args) 
	{
		new DefaultMethodEx2().method1();
	}
}