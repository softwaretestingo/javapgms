package com.softwaretestingo.sto00701_controlstatements.ifelse;
public class NestedIf_Example 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Nested If Statement Example
	 * 
	 */
	public static void main(String[] args) 
	{
		int i = 10; 
		if (i == 10) 
		{ 
			// First if statement 
			if (i < 15) 
				System.out.println("i is smaller than 15"); 

			// Nested - if statement 
			// Will only be executed if statement above 
			// it is true 
			if (i < 12) 
				System.out.println("i is smaller than 12 too"); 
			else
				System.out.println("i is greater than 15"); 
		} 
	}
}
