package com.softwaretestingo.interfacepackage;
interface interfaceWithDefaultMethod
{
	//abstract method
	void method1();
	
	default void defaultMethod()
	{
		System.out.println("Default Method Of Interface");
	}
}
public class DefaultMethodEx1 implements interfaceWithDefaultMethod
{
	@Override
	public void method1() 
	{
		System.out.println("Abstract Method Of Interface");
		
	}
	public static void main(String[] args) 
	{
		DefaultMethodEx1 obj=new DefaultMethodEx1();
		
		// No Need to Implement the default method
		obj.defaultMethod();
	}
}