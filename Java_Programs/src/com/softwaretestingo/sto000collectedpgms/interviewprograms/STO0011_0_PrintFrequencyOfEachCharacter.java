package com.softwaretestingo.sto000collectedpgms.interviewprograms;
public class STO0011_0_PrintFrequencyOfEachCharacter 
{
	/*
	 * Input string =AAAADDDCCCA 
	 * Output= A4D3C3A1
	 */
	public static void main(String[] args) 
	{
		String s = "AAAADDDCCCA";
		System.out.println("Input: "+s);
		int count = 1;
		String re = "" ;
		for (int i = 0 ; i <=s.length()-1; i++ )
		{
			if ( i == s.length()-1 & count == 1 )
			{
				re = re + s.charAt(i)+count;
				break ;
			}
			if ( s.charAt(i) == s.charAt(i+1))
			{
				count++;
			}
			else
			{
				re = re + s.charAt ( i ) + count ;
				count=1;
			}

		}
		System.out.println ("Output: "+re);
	}
}