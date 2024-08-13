package com.softwaretestingo.sto016_CONSTRUCTORS;
class MySingleton
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Singleton Class
	 * 
	 */
	static MySingleton object = null;
	public int number = 10;

	// private constructor
	private MySingleton() 
	{
	}

	// Factory method to provide the users with object
	static public MySingleton displayInstance()
	{
		if (object == null)        
			object = new MySingleton();

		return object;
	} 
}
public class PrivateConstructorEx 
{
	public static void main(String[] args) 
	{
		MySingleton obj1=MySingleton.displayInstance();
		MySingleton obj2=MySingleton.displayInstance();
		
		//Increase the Value of number Variable using one object
		obj1.number = obj1.number+30;
		
		System.out.println("The Value of Number Variable of Object 1 :"+obj1.number);
		System.out.println("The Value of Number Variable of Object 2 :"+obj2.number);
	}
}