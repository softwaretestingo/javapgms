package com.softwaretestingo.string;
class employeer2
{
	// attributes of class1
	String name;
	int age;
	String location;

	// constructor of class
	employeer2(String name, int age, String location)
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
public class ObjectComparisonExamplewithHashcodeEqual  
{
	// Main driver method
	public static void main(String args[])
	{
		// assigning value */
		employeer2 emp1 = new employeer2("Harish", 25, "Bangalore");
		employeer2 emp2 = new employeer2("Harish", 25, "Hyderabad");
		System.out.println("EMP1 Hashocde: "+emp1.hashCode());
		System.out.println("EMP2 Hashocde: "+emp2.hashCode());

		if (emp1.equals(emp2)) 
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