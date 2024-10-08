package com.softwaretestingo.sto00705_controlstatements.foreach;
public class STO0003_0_ForEachLoop_Example 
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