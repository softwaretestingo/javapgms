package com.softwaretestingo.basic;
class ABCa 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Private Access Modifier Example
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
		// System.out.println(obj.num);
		// System.out.println(obj.square(10));
	}
}