package com.softwaretestingo.interfacepackage;
interface interfaceWithDefaultMethod1
{
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