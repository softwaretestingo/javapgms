package com.softwaretestingo.sto021_TYPECASTING;
class Parent 
{
	void displayName() 
	{
		System.out.println("Parent Class Display Name Method.");
	}
}

class Child extends Parent 
{
	@Override
	void displayName() 
	{
		System.out.println("Child Class Display Name Method.");
	}
}
public class STO0001_1_UpcastingEx
{

	public static void main(String[] args) 
	{
		Parent obj=new Child();
		/*
		 * If you are doing upcasting and the calling method which is available in Both Parent 
		 * and child class then child class method will be called.
		 */
		obj.displayName();
	}
}