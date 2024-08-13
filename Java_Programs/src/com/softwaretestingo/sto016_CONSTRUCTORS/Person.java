package com.softwaretestingo.sto016_CONSTRUCTORS;
public class Person 
{
	private String name;
	private int age;
	public Person(String name, int year) 
	{
		this.name = name;
		this.age = year;
	}
	public static void main(String[] args) 
	{
		Person obj=new Person("Ramesh", 2023);
	}
}