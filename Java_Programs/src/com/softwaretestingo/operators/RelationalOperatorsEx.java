package com.softwaretestingo.operators;
public class RelationalOperatorsEx 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Relational Operator Example
	 * 
	 */
	public static void main(String[] args) 
	{
		int a = 20, b = 10; 
		String x = "SoftwareTestingo", y = "SoftwareTestingo";
		int array1[] = { 1, 2, 3 }; 
		int array2[] = { 1, 2, 3 }; 
		boolean condition = true; 

		// various conditional operators 
		System.out.println("a == b :" + (a == b)); 
		System.out.println("a < b :" + (a < b)); 
		System.out.println("a <= b :" + (a <= b)); 
		System.out.println("a > b :" + (a > b)); 
		System.out.println("a >= b :" + (a >= b)); 
		System.out.println("a != b :" + (a != b)); 

		// Arrays cannot be compared with 
		// relational operators because objects 
		// store references not the value 
		System.out.println("x == y : " + (array1 == array2)); 

		System.out.println("condition==true :"+ (condition == true));  
	}
}