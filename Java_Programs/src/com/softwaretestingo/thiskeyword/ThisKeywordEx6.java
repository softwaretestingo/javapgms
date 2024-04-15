package com.softwaretestingo.thiskeyword;
class ex8
{  
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Method Chaining Example
	 * 
	 */
	// Declare an Instance Method with return class type (ex8) 
	ex8 show()
	{
		return this;
	}
	void msg()
	{
		System.out.println("Displaying Message");
	}

}  
public class ThisKeywordEx6 
{
	public static void main(String[] args) 
	{
		new ex8().show().msg();
	}
}