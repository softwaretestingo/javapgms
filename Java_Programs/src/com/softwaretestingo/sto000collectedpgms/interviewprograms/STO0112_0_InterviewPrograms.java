package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.util.ArrayList;
import java.util.List;
public class STO0112_0_InterviewPrograms 
{
	/**
	 * Author: SoftwareTestingo 
	 * Admin Blog: www.softwaretestingo.com Problem
	 * Statement: 
	 * 
	 * Input Value: ab2c4d45ef234
	 * Integers: 2,4,45,234
	 * Characters: ab,c,d,ef
	 * 
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String input = "ab2c4d45ef234";
		System.out.println("Input Value: "+input);
		
		List<String> integers = new ArrayList<>();
		List<String> characters = new ArrayList<>();

		StringBuilder currentNumber = new StringBuilder();
		StringBuilder currentChars = new StringBuilder();

		for (int i = 0; i < input.length(); i++) 
		{
			char c = input.charAt(i);

			if (Character.isDigit(c)) 
			{
				if (currentChars.length() > 0) 
				{
					characters.add(currentChars.toString());
					currentChars.setLength(0);
				}
				currentNumber.append(c);
			} 
			else if (Character.isLetter(c)) 
			{
				if (currentNumber.length() > 0) 
				{
					integers.add(currentNumber.toString());
					currentNumber.setLength(0);
				}
				currentChars.append(c);
			}
		}

		// Add any remaining sequences to their respective lists
		if (currentNumber.length() > 0) 
		{
			integers.add(currentNumber.toString());
		}
		if (currentChars.length() > 0) 
		{
			characters.add(currentChars.toString());
		}

		// Format the output
		System.out.print("Integers: ");
		for (int i = 0; i < integers.size(); i++) 
		{
			System.out.print(integers.get(i));
			if (i < integers.size() - 1) 
			{
				System.out.print(",");
			}
		}
		System.out.println();

		System.out.print("Characters: ");
		for (int i = 0; i < characters.size(); i++) 
		{
			System.out.print(characters.get(i));
			if (i < characters.size() - 1) 
			{
				System.out.print(",");
			}
		}
	}
}