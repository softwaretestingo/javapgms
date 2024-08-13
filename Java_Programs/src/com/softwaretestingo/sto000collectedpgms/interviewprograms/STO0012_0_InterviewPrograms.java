package com.softwaretestingo.sto000collectedpgms.interviewprograms;
public class STO0012_0_InterviewPrograms 
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