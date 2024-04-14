package com.softwaretestingo.basic;
class employeer
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: How to Compare Two Objects
	 * @param args
	 */
	// attributes of class1
	String name;
	int age;
	String location;

	// constructor of class
	employeer(String name, int age, String location)
	{
		// Assignment of current attributes using this keyword with same
		this.name = name;
		this.age = age;
		this.location = location;
	}
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null || this.getClass() != obj.getClass())
			return false;
		employeer p1 = (employeer)obj;

		// Checking only if attribute- name & age and ignore lcoation
		return this.name.equals(p1.name) && this.age == p1.age;
	}
}
public class ObjectComparisonExamplewithOverrideEqual 
{
	// Main driver method
	public static void main(String args[])
	{
		// assigning value */
		employeer emp1 = new employeer("Harish", 25, "Bangalore");
		employeer emp2 = new employeer("Harish", 25, "Hyderabad");

		// Checking objects are equal and printing output- true/false
		System.out.println(emp1.equals(emp2));
	}
}
