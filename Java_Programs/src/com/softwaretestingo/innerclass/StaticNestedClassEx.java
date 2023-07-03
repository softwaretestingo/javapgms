package com.softwaretestingo.innerclass;
public class StaticNestedClassEx 
{
	//Static Nested Class
	static class NestedDemo
	{
		public void myMethod()
		{
			System.out.println("Static nested class method is called");
		}
	}
	public static void main(String[] args) 
	{
		//Accessing the static nested class without initializing the object of Outer class
		StaticNestedClassEx.NestedDemo obj= new StaticNestedClassEx.NestedDemo();
		obj.myMethod();
	}
}