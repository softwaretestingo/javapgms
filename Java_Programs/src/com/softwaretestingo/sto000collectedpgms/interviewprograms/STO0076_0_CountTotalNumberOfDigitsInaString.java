package com.softwaretestingo.sto000collectedpgms.interviewprograms;
public class STO0076_0_CountTotalNumberOfDigitsInaString 
{	
	public static void main(String[] args) 
	{	
		String s="%i a#m m@o$noj346";
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