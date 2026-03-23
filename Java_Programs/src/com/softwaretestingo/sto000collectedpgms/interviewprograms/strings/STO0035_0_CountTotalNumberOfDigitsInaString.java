package com.softwaretestingo.sto000collectedpgms.interviewprograms.strings;
public class STO0035_0_CountTotalNumberOfDigitsInaString 
{	
	/**
	 * Input: %i a#m s@o$ftwa346re
	 * Number of digits (Output): 3
	 * 
	 */
	public static void main(String[] args) 
	{	
		String s="%i a#m s@o$ftwa346re";
		System.out.println("Input: "+s);
		int digits=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) >= 48 && s.charAt(i) <= 57)
			{
				digits++;
			}
		}
		System.out.println("Number of digits (Output): " + digits);		
	}
}