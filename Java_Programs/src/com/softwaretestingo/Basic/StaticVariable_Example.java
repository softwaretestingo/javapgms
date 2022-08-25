package com.softwaretestingo.Basic;

public class StaticVariable_Example 
{
	static int count=0;
	public void increment()
	{
		count++;
	}
	@SuppressWarnings("static-access")
	public static void main(String[] args) 
	{
		StaticVariable_Example obj1=new StaticVariable_Example();
		StaticVariable_Example obj2=new StaticVariable_Example();
		obj1.increment();
		obj2.increment();
		System.out.println("Obj1: count is="+obj1.count);
		System.out.println("Obj2: count is="+obj2.count);
	}
}