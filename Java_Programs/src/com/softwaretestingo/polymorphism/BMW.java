package com.softwaretestingo.polymorphism;
public class BMW extends Car
{
	public static void method1()
	{
		System.out.println("BMW Class Method 1 Called");
	}
	public static void main(String[] args) 
	{
		// This Will Call The BWM Class Method1() method
		BMW.method1();
		
		// It Hides the Method1() of BMW Class
		Car c=new BMW();
		c.method1();
	}
}
