package com.softwaretestingo.sto00404_datatypes.stringprograms;
import java.util.Arrays;
public class SortCharacters 
{
	public static void main(String[] args) 
	{
		// Input string
		String input = "aBcA1bC2";

		// Variables to store groups
		StringBuilder lowerCase = new StringBuilder();
		StringBuilder upperCase = new StringBuilder();
		StringBuilder numbers = new StringBuilder();

		// Separate characters into groups
		for (char ch : input.toCharArray()) 
		{
			if (Character.isLowerCase(ch)) 
			{
				lowerCase.append(ch);
			} else if (Character.isUpperCase(ch)) 
			{
				upperCase.append(ch);
			} else if (Character.isDigit(ch)) 
			{
				numbers.append(ch);
			}
		}

		// Sort each group
		char[] lowerCaseArray = lowerCase.toString().toCharArray();
		char[] upperCaseArray = upperCase.toString().toCharArray();
		char[] numbersArray = numbers.toString().toCharArray();

		Arrays.sort(lowerCaseArray);
		Arrays.sort(upperCaseArray);
		Arrays.sort(numbersArray);

		// Concatenate sorted groups
		String result = new String(lowerCaseArray) + new String(upperCaseArray) + new String(numbersArray);

		// Output the result
		System.out.println("Original String: " + input);
		System.out.println("Final Output: " + result);
	}
}