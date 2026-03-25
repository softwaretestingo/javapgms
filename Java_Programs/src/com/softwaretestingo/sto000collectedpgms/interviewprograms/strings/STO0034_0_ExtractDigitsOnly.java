package com.softwaretestingo.sto000collectedpgms.interviewprograms.strings;
public class STO0034_0_ExtractDigitsOnly 
{
	/**
	 * Input: Soft4w8a1re
	 * Output: 481
	 * 
	 */
	public static void main(String[] args) 
	{
		String s ="Soft4w8a1re";
		System.out.println("Input: "+s);
		char ch[]=s.toCharArray();

		StringBuilder sb = new StringBuilder();
		for(char ch1: ch)
		{
			if(Character.isDigit(ch1))
			{
				sb.append(ch1);
			}
		}
		System.out.println("Output: "+sb);
	}
}