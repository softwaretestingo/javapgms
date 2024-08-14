package com.softwaretestingo.sto011_STRINGS;
class Employee 
{ 
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Compare Two Strings Using equals() Method
	 * 
	 */
	private String name;
	private int age;
	Employee(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	// Overriding equals() to compare two objects
	public boolean equals(Object obj) 
	{
		// If We Compare with itself then it return true
		if (obj == this) 
		{
			return true;
		}
		// If obj object is instance of employee class then return false 
		if (!(obj instanceof Employee)) 
		{
			return false;
		}
		//typecast obj to Employee so that we can compare data members
		Employee emp = (Employee) obj;
		
		// Compare the data members and return accordingly
		return name.equals(emp.name)&& 
				Integer.compare(age, emp.age) == 0;
	}
}
public class EqualsExampleSample 
{
	public static void main(String[] args) {
		Employee emp1 = new Employee("Ramesh", 25);
		Employee emp2 = new Employee("Ramesh", 25);
		//Comparing the two objects
		boolean bool = emp1.equals(emp2);
		System.out.println(bool);
	}
}