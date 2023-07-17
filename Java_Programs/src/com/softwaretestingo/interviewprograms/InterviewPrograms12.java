package com.softwaretestingo.interviewprograms;
public class InterviewPrograms12 
{
	/*
	 * Input: tomorrow 
	 * Output: t#m##rr###w
	 */
	public static void main(String[] args) 
	{
		StringBuilder charactersToAppend = new StringBuilder("#");
		String input = "tomorrow";
		while (input.contains("o")) 
		{
			input = input.replaceFirst("o", charactersToAppend.toString());
			charactersToAppend.append("#");
		}
		System.out.println(input);
	}
}