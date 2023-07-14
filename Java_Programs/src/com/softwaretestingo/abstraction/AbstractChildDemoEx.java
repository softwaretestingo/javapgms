package com.softwaretestingo.abstraction;
abstract class AbstractDemo
{
	//Concrete Method
	public void myMethod()
	{
		System.out.println("Hello");
	}
	
	//Abstract Method
	abstract public void anotherMethod();
}
public class AbstractChildDemoEx 
{
	public void anotherMethod()
	{
		System.out.println("Child Class anotherMethod Executed");
	}
	public static void main(String[] args) 
	{
		//error: You can't create an object of it
		//AbstractDemo obj = new AbstractDemo();
		//obj.anotherMethod();
	}
}