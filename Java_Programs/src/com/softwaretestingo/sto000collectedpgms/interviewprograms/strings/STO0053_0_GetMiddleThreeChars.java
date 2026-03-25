package com.softwaretestingo.sto000collectedpgms.interviewprograms.strings;
public class STO0053_0_GetMiddleThreeChars 
{
	/**
	 * Write Java code for return middle three letters
	 * Input: NewMumbai
	 * Output: Mum
	 * 
	 */
	public static void main(String[] args) 
	{
		String input = "NewMumbai";
		System.out.println("Input: "+input);
		String output = getMiddleThreeLetters(input);
		System.out.println("Output: "+output);
	}

	public static String getMiddleThreeLetters(String input) 
	{
		int length = input.length();
		if (length <= 3) 
		{
			return input;
		}
		else if (length % 2 == 0) 
		{
			return "";
		}
		else 
		{
			int middleIndex = length / 2;
			return input.substring(middleIndex - 1, middleIndex + 2);
		}
	}
}