package com.softwaretestingo.interfacepackage;
interface interfaceWithDefaultMethod4
{
	default void method1()
	{
		System.out.println("Default Method Of Parent Interface");
	}
}
interface childInterface4
{
	default void method1()
	{
		System.out.println("Default Method Of Child Interface");
	}
}
public class DefaultMethodEx4 implements interfaceWithDefaultMethod4,childInterface4
{
	@Override
	public void method1() 
	{
		interfaceWithDefaultMethod4.super.method1();
	}
	public static void main(String[] args) 
	{
		new DefaultMethodEx4().method1();
	}
}