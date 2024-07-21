package com.softwaretestingo.basic;
class ABCa 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Private Access Modifier Example
	 * Read Here: https://www.softwaretestingo.com/access-modifiers-in-java/
	 * @param args
	 */
	private double num = 100;

	private int square(int a) 
	{
		return a * a;
	}
}

public class PrivateAccessModifiers_Example 
{
	public static void main(String[] args) 
	{
		ABCa obj = new ABCa();
		
		//You Can not Access Private Variavale or Methods Outside of the Class
		// System.out.println(obj.num);
		// System.out.println(obj.square(10));
	}
}