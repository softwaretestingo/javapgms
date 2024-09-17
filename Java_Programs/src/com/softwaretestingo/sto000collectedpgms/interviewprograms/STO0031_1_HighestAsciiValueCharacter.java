package com.softwaretestingo.sto000collectedpgms.interviewprograms;
public class STO0031_1_HighestAsciiValueCharacter 
{
	/*
	 * Input string s ="amZgxY" 
	 * Print character who have highest ASCII value.
	 */
	public static void main(String[] args) 
	{
		String str = "amZgxY";
		System.out.println("Input: "+str);
		int currentmax = 0 ;
		for (Character c : str.toCharArray()) 
		{
			if ((int)c>currentmax)
				currentmax = (int)c;
		}
		System.out.println ("Output: "+(char)currentmax);
	}
}