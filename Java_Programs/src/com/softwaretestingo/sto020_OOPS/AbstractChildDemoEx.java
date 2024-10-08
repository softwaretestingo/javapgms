package com.softwaretestingo.sto020_OOPS;
abstract class AbstractDemo
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Note: You Can Not Create Object Of Abstract Class
	 */
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
	//Child Class Concrete Method
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