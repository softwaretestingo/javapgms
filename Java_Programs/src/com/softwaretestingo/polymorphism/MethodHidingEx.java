package com.softwaretestingo.polymorphism;
class parent
{
	public static void foo() 
	{
		System.out.println("Inside foo method in parent class");
	}

	public void bar() 
	{
		System.out.println("Inside bar method in parent class");
	}
}
class Child extends parent 
{
	// Hiding
	public static void foo() 
	{
		System.out.println("Inside foo method in child class");
	}

	// Overriding
	public void bar() 
	{
		System.out.println("Inside bar method in child class");
	}
}
public class MethodHidingEx 
{
	public static void main(String[] args) 
	{
		parent p = new parent();

		//Here c is the reference variable of parent class but points to Child class
		parent c = new Child();
		System.out.println("****************Method Hiding*******************");
		p.foo(); // This will call method in parent class
		c.foo(); // This will call method in parent class
		System.out.println("****************Method overriding*******************");
		p.bar(); // This will call method in parent class
		c.bar(); // This will call method in child class
	}
}