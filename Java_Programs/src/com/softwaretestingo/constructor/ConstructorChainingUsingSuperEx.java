package com.softwaretestingo.constructor;
class Base
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Constructor Chaining With Super Keyword Example
	 * 
	 */
	String name;

	// constructor 1
	Base()
	{
		this("");
		System.out.println("No-argument constructor of" +" base class");
	}

	// constructor 2
	Base(String name)
	{
		this.name = name;
		System.out.println("Calling parameterized constructor"+ " of base");
	}
}
public class ConstructorChainingUsingSuperEx extends Base
{
	// constructor 3
	ConstructorChainingUsingSuperEx()
	{
		System.out.println("No-argument constructor " +"of derived");
	}

	// parameterized constructor 4
	ConstructorChainingUsingSuperEx(String name)
	{
		// invokes base class constructor 2
		super(name);
		System.out.println("Calling parameterized " +"constructor of derived");
	}

	public static void main(String[] args) 
	{
		// calls parameterized constructor 4
		ConstructorChainingUsingSuperEx obj = new ConstructorChainingUsingSuperEx("test");
	}
}