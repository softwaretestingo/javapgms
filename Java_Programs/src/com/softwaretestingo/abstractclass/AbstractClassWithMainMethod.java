package com.softwaretestingo.abstractclass;
public abstract class AbstractClassWithMainMethod 
{
	String msg="Hi User";
	public static void method1()
	{
		System.out.println("Normal Method 1 Called");
	}
	public static void main(String[] args) 
	{
		AbstractClassWithMainMethod.method1();
	}
}