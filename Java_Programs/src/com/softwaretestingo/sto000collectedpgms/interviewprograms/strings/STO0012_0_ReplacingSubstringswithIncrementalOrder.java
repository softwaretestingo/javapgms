package com.softwaretestingo.sto000collectedpgms.interviewprograms.strings;
public class STO0012_0_ReplacingSubstringswithIncrementalOrder 
{
	/*
	 * Input: tomorrow 
	 * Output: t#m##rr###w
	 */
	public static void main(String[] args) 
	{
		StringBuilder charactersToAppend = new StringBuilder("#");
		String input = "tomorrow";
		System.out.println("Input: "+input);
		while (input.contains("o")) 
		{
			input = input.replaceFirst("o", charactersToAppend.toString());
			charactersToAppend.append("#");
		}
		System.out.println("Output: "+input);
	}
}