package com.softwaretestingo.conditionalstatements;
public class DoWhileInfiniteLoop_Example 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Use Of Do While Infinite Loop
	 * 
	 */
	public static void main(String[] args) 
	{
		int i = 1;
		do 
		{
			System.out.println("Counting: " + i);
			i++;
		} while (i > 0);
	}
}