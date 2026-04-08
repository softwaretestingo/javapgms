package com.softwaretestingo.sto000collectedpgms.interviewprograms.strings;

public class STO0003_0_SubstringCount 
{
	/**
	 * Input: lekhale Output: The substring 'le' is repeated 2 times in the given
	 * string.
	 */
	public static void main(String[] args)
	{

		String s = "lekhale";
		int count = 0;

		for (int i = 0; i < s.length()-1; i++) 
		{
			if (s.charAt(i) == 'l' && s.charAt(i + 1) == 'e') 
			{
				count++;
			}
		}

		System.out.println("Found 'le' " + count + " times");

	}
}