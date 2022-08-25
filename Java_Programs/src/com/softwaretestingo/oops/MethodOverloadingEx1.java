package com.softwaretestingo.oops;

class ParentClassEx
{
	public void displayString(String str)
	{
		System.out.println("Single Parameterized Display Method Executed");
	}
	public void displayString(String str, String str1) {
		System.out.println("Double Parameterized Display Method Got Executed");
		
	}
}
public class MethodOverloadingEx1 
{
	public static void main(String[] args) 
	{
		PolymorphismEx obj=new PolymorphismEx();
		obj.displayString("Welcome"); // Will Call Single Parameterized Method
		obj.displayString("WELCOME", "USER");// Will Call Double Parameterized Method
	}
}