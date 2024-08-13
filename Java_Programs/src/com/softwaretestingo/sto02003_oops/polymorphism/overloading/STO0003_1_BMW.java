package com.softwaretestingo.sto02003_oops.polymorphism.overloading;
public class STO0003_1_BMW extends STO0003_0_Car
{
	public static void method1()
	{
		System.out.println("BMW Class Method 1 Called");
	}
	public static void main(String[] args) 
	{
		// This Will Call The BWM Class Method1() method
		STO0003_1_BMW.method1();
		
		// It Hides the Method1() of BMW Class
		STO0003_0_Car c=new STO0003_1_BMW();
		c.method1();
	}
}
