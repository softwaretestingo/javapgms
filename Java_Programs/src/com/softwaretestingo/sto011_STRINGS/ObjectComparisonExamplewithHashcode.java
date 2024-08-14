package com.softwaretestingo.sto011_STRINGS;
class employeer1
{
	// attributes of class1
	String name;
	int age;
	String location;

	// constructor of class
	employeer1(String name, int age, String location)
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
		if (obj == null
				|| this.getClass() != obj.getClass())
			return false;
		employeer2 p1 = (employeer2)obj;

		// Checking only if attribute- name & age and ignore lcoation
		return this.name.equals(p1.name)
				&& this.age == p1.age;
	}
}
public class ObjectComparisonExamplewithHashcode  
{
	// Main driver method
	public static void main(String args[])
	{
		// assigning value */
		employeer2 emp1 = new employeer2("Harish", 25, "Bangalore");
		employeer2 emp2 = new employeer2("Harish", 25, "Hyderabad");
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		boolean isHashcodeEquals = emp1.hashCode() == emp2.hashCode();

		if (isHashcodeEquals) 
		{
			System.out.println("Should compare with equals method too.");
		} 
		else
		{
			System.out.println("Should not compare with equals method because " +
					"the id is different, that means the objects are not equals for sure.");
		}
	}
}