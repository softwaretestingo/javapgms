package com.softwaretestingo.sto000collectedpgms.interviewprograms.strings;
public class STO0003_1_NoOfOccuranceOfSubstringInString 
{
	/**
	 * Input: lekhale
	 * Output: The substring 'le' is repeated 2 times in the given string.
	 */
	public static void main(String[] args) 
	{

		String s = "lekhale";
		System.out.println("Input: "+s);
		int count = 0;
		int index = s.indexOf("le");
		while (index != -1) 
		{
			count++;
			index = s.indexOf("le", index + 1);
		}
		System.out.println("Output: "+"The substring 'le' is repeated " + count + " times in the given string.");
	}
}