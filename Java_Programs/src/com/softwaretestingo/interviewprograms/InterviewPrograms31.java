package com.softwaretestingo.interviewprograms;
public class InterviewPrograms31 
{
	/*
	 * Input string s ="amZgxY" 
	 * Need to print biggest character asiic value.
	 */
	public static void main(String[] args) 
	{
		String str = "amZgxY";
		System.out.println(test(str));
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