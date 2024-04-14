package com.softwaretestingo.conditionalstatements;
public class ForEachLoop_Example 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: For Each Loop Iterate Elements Of Character Array
	 * 
	 */
	public static void main(String args[])
	{
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};
		
		// foreach loop
		for (char item: vowels) 
		{
			System.out.println(item);
		}
	}
}