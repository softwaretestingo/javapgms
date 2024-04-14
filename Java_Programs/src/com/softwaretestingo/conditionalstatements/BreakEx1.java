package com.softwaretestingo.conditionalstatements;
public class BreakEx1 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Use Of Break Keyword
	 * 
	 */
	public static void main(String[] args) 
	{
		int[] numbers = { 2, 4, 6, 7, 9, 10, 11 };
		for (int i = 0; i < numbers.length; i++) 
		{
		    if (numbers[i] % 3 == 0) 
		    {
		        System.out.println("Found a number divisible by 3: " + numbers[i]);
		        break;
		    }
		}
	}
}