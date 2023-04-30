package com.softwaretestingo.Constructor;
public class CopyConstructorEx 
{
	private String personName;
	private int personAge;
	
	//constructor to initialize personName and personAge  
	CopyConstructorEx(String name, int age)
	{
		personName=name;
		personAge=age;
	}
	
	//creating a copy constructor  
	CopyConstructorEx(CopyConstructorEx obj)
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
		CopyConstructorEx conobj=new CopyConstructorEx("Ramesh",23);
		System.out.println("Name of the Person: "+conobj.showName());
		System.out.println("Age Of the Person :"+conobj.showAge());
		
		//passing the parameters to the copy constructor  
		CopyConstructorEx conobj1=new CopyConstructorEx(conobj);
		System.out.println("Name of the Person: "+conobj.showName());
		System.out.println("Age Of the Person :"+conobj.showAge());
		
	}
}