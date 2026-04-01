
package com.softwaretestingo.sto016_CONSTRUCTORS;
public class Test 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Copy Constructor Example
	 * 
	 */
	private String personName;
	private int personAge;
	
	//constructor to initialize personName and personAge  
	Test(String name, int age)
	{
		personName=name;
		personAge=age;
	}
	
	//creating a copy constructor  
	Test(Test obj)
	{
		System.out.println("Invoking the Copy Constructor:");
		personName=obj.personName;
		personAge=obj.personAge;
		
	}
	
	//creating a method that returns the price of the fruit  
	String showName()  
	{  
	return personName;  
	}  
	//creating a method that returns the name of the fruit  
	int showAge()  
	{  
	return personAge;  
	}  
	public static void main(String[] args) 
	{
		Test conobj=new Test("Ramesh",23);
		System.out.println("Name of the Person: "+conobj.showName());
		System.out.println("Age Of the Person :"+conobj.showAge());
		
		//passing the parameters to the copy constructor  
		Test conobj1=new Test(conobj);
		System.out.println("Name of the Person: "+conobj1.showName());
		System.out.println("Age Of the Person :"+conobj1.showAge());
	}
}