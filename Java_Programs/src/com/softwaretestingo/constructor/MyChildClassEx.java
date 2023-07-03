package com.softwaretestingo.constructor;
class MyParentClass 
{
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