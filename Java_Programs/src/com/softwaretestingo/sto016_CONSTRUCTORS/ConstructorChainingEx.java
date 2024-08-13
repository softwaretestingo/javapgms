package com.softwaretestingo.sto016_CONSTRUCTORS;
public class ConstructorChainingEx 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Constructor Chaining Example
	 * 
	 */
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