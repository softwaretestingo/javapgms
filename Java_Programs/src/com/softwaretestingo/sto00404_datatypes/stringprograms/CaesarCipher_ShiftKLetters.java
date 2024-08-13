package com.softwaretestingo.sto00404_datatypes.stringprograms;
public class CaesarCipher_ShiftKLetters 
{
	public static void main(String[] args) 
	{
		// Input string
		String input = "HELLO";

		// Key for Caesar cipher
		int key = 3;

		// Variable to store the encrypted string
		StringBuilder output = new StringBuilder();

		// Iterate through each character in the input string
		for (char ch : input.toCharArray()) 
		{
			// Check if the character is a letter
			if (Character.isLetter(ch)) 
			{
				// Determine whether to shift the letter up or down the alphabet
				char base = Character.isUpperCase(ch) ? 'A' : 'a';
				// Apply the Caesar cipher encryption
				char encryptedChar = (char) (((ch - base + key) % 26) + base);
				// Append the encrypted character to the output
				output.append(encryptedChar);
			} 
			else 
			{
				// If the character is not a letter, append it to the output as is
				output.append(ch);
			}
		}

		// Output the encrypted string
		System.out.println("Input: "+input);
		System.out.println("After Shiffting each character " + key +" letters");
		System.out.println("Output: " + output.toString());
	}
}