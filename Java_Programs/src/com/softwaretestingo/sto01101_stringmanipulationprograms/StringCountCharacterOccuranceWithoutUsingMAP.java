package com.softwaretestingo.sto01101_stringmanipulationprograms;
public class StringCountCharacterOccuranceWithoutUsingMAP 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Find Each Character Count Of a String Using Without Collection
	 * 
	 */
	public static void main(String[] args) 
	{
		String str = "hello world";
		int[] charCounts = new int[256]; // Assuming ASCII characters

		// Count occurrences of each character
		for (int i = 0; i < str.length(); i++) 
		{
			char ch = str.charAt(i);
			charCounts[ch]++;
		}

		// Print characters and their occurrences
		System.out.println("Character occurrences:");
		for (int i = 0; i < charCounts.length; i++) 
		{
			if (charCounts[i] > 0) 
			{
				System.out.println((char) i + ": " + charCounts[i]);
			}
		}
	}
}