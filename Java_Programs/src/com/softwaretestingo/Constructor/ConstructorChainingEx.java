package com.softwaretestingo.Constructor;
public class ConstructorChainingEx 
{
	private String name;
	private int age;

	public ConstructorChainingEx() 
	{
		System.out.println("Default Constructor");
	}
	public ConstructorChainingEx(String name) 
	{
		//Invokes Default Constructor
		this();
		System.out.println("One Parameterized Constructor");
	}
	public ConstructorChainingEx(String name, int age) 
	{
		this(name);
		System.out.println("Two Parametrized Constructor");
	}
	public static void main(String[] args) 
	{
		ConstructorChainingEx p1=new ConstructorChainingEx("SoftwareTestingo", 2023);
	}
}