package com.softwaretestingo.operators;
public class ArithmaticOperatorEx 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Arithmatic Operator Example
	 * 
	 */
	public static void main(String[] args) 
	{
		int a = 11, b = 22; 
		String string1 = "Software", string2 = "Testingo"; 

		// + and - operator 
		System.out.println("a + b = " + (a + b)); 
		System.out.println("a - b = " + (a - b)); 

		// + operator if used with strings 
		System.out.println("Use of + Operator With String " + string1 + string2); 

		// * and / operator 
		System.out.println("a * b = " + (a * b)); 
		System.out.println("a / b = " + (a / b)); 

		// modulo operator gives remainder 
		// on dividing first operand with second 
		System.out.println("a % b = " + (a % b)); 
	}
}