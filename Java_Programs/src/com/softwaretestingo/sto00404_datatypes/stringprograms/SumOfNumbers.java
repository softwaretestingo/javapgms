package com.softwaretestingo.sto00404_datatypes.stringprograms;
public class SumOfNumbers 
{
	public static void main(String[] args) 
	{
		// Input string
		String input = "1a b23c de45f";

		// Variable to store the sum
		int sum = 0;

		// Variable to store the current number
		StringBuilder currentNumber = new StringBuilder();

		// Iterate through each character in the input string
		for (char ch : input.toCharArray()) 
		{
			// Check if the character is a digit
			if (Character.isDigit(ch)) 
			{
				// Append the digit to the current number
				currentNumber.append(ch);
			}
			else 
			{
				// If the current number is not empty, add it to the sum and reset it
				if (currentNumber.length() > 0) 
				{
					sum += Integer.parseInt(currentNumber.toString());
					currentNumber.setLength(0); // Reset the current number
				}
			}
		}

		// Add the last number if it exists
		if (currentNumber.length() > 0) 
		{
			sum += Integer.parseInt(currentNumber.toString());
		}

		// Output the sum
		System.out.println("Original String Is: "+input);
		System.out.println("Sum of numbers: " + sum);
	}
}