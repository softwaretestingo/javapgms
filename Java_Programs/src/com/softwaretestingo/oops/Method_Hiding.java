package com.softwaretestingo.oops;

class bus
{
	public static void driver()
	{
		System.out.println("Driver Method Of Bus Class Executed");
	}
	public void conductor()
	{
		System.out.println("Conductor Method Of Bus Class Got Executed");
	}
}
class Volvobus extends bus
{
	//This Method Hides
	public static void driver()
	{
		System.out.println("Driver Method Of Volvobus Class Executed");
	}
	public void conductor()
	{
		System.out.println("Conductor Method Of Volvobus Class Got Executed");
	}
}
public class Method_Hiding 
{
	public static void main(String[] args) 
	{
		bus pobj=new bus();
		bus cobj=new Volvobus();
		
		System.out.println("+++++++++ Method Hiding +++++++++");
		System.out.println();
		pobj.driver(); //This will call the parent method
		cobj.driver(); //This will call the parent method
		System.out.println();
		System.out.println("+++++++++ Method Overriding +++++++++");
		System.out.println();
		pobj.conductor(); //This will call the parent method
		cobj.conductor(); //This will call the child method
	}
}