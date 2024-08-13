package com.softwaretestingo.sto02004_oops.inheritance;
class classAA
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Check Hybrid Inheritance Example
	 * 
	 */
	public void displayA()
	{
		System.out.println("Class A Method");
	}
}
class classBB extends classAA
{
	public void show()
	{
		System.out.println("Show Method Of Class B");
	}
	public void displayB()
	{
		System.out.println("Class B Method");
	}
}
class classCD extends classAA
{
	public void show()
	{
		System.out.println("Show Method Of Class C");
	}
	public void display()
	{
		System.out.println("Class C Method");
	}
}
public class STO0006_0_Hybrid_Inheritance extends classBB //, classC
{
	public void dislay_localclass()
	{
		System.out.println("Display() method of Local Class");
	}
	public static void main(String[] args) 
	{
		STO0006_0_Hybrid_Inheritance obj=new STO0006_0_Hybrid_Inheritance();
		obj.dislay_localclass();
		obj.show(); //When this statement executed it give you error
	}
}