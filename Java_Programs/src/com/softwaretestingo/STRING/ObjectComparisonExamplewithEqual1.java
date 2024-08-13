package com.softwaretestingo.STRING;
//Class 1
class employeers 
{
	// attributes of class1
	String name;
	int age;
	String location;

	// constructor of class 1
	employeers(String name, int age, String location)
	{
		// Assignment of current attributes using this keyword with same
		this.name = name;
		this.age = age;
		this.location = location;
	}
}

/* Class 2 : where execution is shown for class 1 */
public class ObjectComparisonExamplewithEqual1  
{
	// Main driver method
	public static void main(String args[])
	{

		// Objects of class1 (auxiliary class)
		// are assigned value */
		employeers emp1 = new employeers("Harish", 25, "Bangalore");
		employeers emp2 = new employeers("Ram", 28, "Hyderabad");
		employeers emp3 = new employeers("Swati", 23, "Noida");

		// Checking objects are equal and printing output- true/false
		System.out.println(emp1.equals(emp3));
	}
}