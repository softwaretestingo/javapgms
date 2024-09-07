package com.softwaretestingo.abstraction;

public class TestABC 
{
	public static void main(String[] args) 
	{
		String input = "I Love Dogs";
		generatePairs(input);
	}
	//Test

	private static void generatePairs(String str) 
	{
		// Remove leading and trailing spaces and convert to uppercase
		//str = str.trim().toUpperCase();
		// Length of the string
		int length = str.length();
		// Loop through each character in the string
		for (int i = 0; i < length; i++) 
		{ 
			// Print pairs for the current character at position i
			for (int j = 0; j < length; j++) 
			{
				if (i != j) 
				{
					// Avoid pairing the character with itself
					System.out.print(str.charAt(i) + "" + str.charAt(j) + ", ");
				}
			}
			// Move to the next line after printing pairs for one character
			System.out.println();
		}
	}
}