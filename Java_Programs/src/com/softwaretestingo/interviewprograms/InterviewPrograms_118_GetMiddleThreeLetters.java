package com.softwaretestingo.interviewprograms;
public class InterviewPrograms_118_GetMiddleThreeLetters 
{
	/**
	 * Write Java code for return middle three letters
	 * Input: “NewMumbai” or "New"
	 * Output: Mum or New
	 * 
	 */
	public static void main(String[] args) 
	{
		String input = "NewMumbai";
		String output = getMiddleThreeLetters(input);
		System.out.println(output);
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