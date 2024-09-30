package com.softwaretestingo.sto000collectedpgms.interviewprograms.strings;
public class STO0031_0_HighestAsciiValueCharacter 
{
	/*
	 * Input string s ="amZgxY" 
	 * Print character who have highest ASCII value.
	 */
	public static void main(String[] args) 
	{
		String str = "amZgxY";
		System.out.println("Inout: "+str);
		System.out.println("Output: "+test(str));
	}
	public static char test ( String str ) 
	{
		int greatestVal = 0 ;
		int len = str.length();
		for (int i = 0 ; i<len; i++ )
		{
			int currentVal = (int)str.charAt(i);
			if (currentVal>greatestVal)
			{
				greatestVal=currentVal ;
			}
		}
		char greatestChar = (char)(greatestVal);
		return greatestChar ;
	}
}