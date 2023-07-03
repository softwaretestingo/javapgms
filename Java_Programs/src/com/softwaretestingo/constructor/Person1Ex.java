package com.softwaretestingo.constructor;
public class Person1Ex 
{
	private String name;
	private int age;

	public Person1Ex(String name, int age) 
	{
		this.name = name;
		this.age = age;
	}

	public Person1Ex(String name) 
	{
		this(name, 0);
	}

	public Person1Ex(int age) 
	{
		this("Unknown", age);
	}
	public static void main(String[] args) 
	{
		Person1Ex p1=new Person1Ex("SoftwareTestingo", 2023);
		Person1Ex p2=new Person1Ex("SoftwareTestingo");
		Person1Ex p3=new Person1Ex(2023);
	}
}