package com.softwaretestingo.sto011_STRINGS;
public class ToStringMethodEx2 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Use Of toString() method Example
	 * 
	 */
	String firstName;
	String lastName;
	int age;

	ToStringMethodEx2(String firstName,String lastName,int age)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.age=age;
	}
	public String toString() 
	{
		return "Person: firstName=" + firstName + ", lastName=" + lastName + ", Age=" + age;
	}
	public static void main(String[] args) 
	{
		ToStringMethodEx2 obj=new ToStringMethodEx2("Ramesh", "Dixit",20);
		ToStringMethodEx2 obj1=new ToStringMethodEx2("Anmol", "Arora",30);

		System.out.println(obj);
		System.out.println(obj.toString());
		System.out.println(obj1.toString());
	}
}