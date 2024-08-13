package com.softwaretestingo.sto000collectedpgms.interviewprograms;
public class STO0038_0_InterviewPrograms 
{
	/*
	 * Input = AAABBBBCC 
	 * Output = A3B4C2
	 */
	public static void main(String[] args) 
	{
		String str = "AAABBBBCC";
		int length = str.length ( ) ;

		// Created an object of a StringBuffer class .
		StringBuffer sb= new StringBuffer();
		int count = 1; // counter for counting number of occurrences

		// input String
		// length of a String .
		for ( int i=0; i<length; i++)
		{
			// if i reaches at the end then append all and break the loop
			if (i == length-1)
			{
				sb.append(str.charAt(i)+""+count);
				break ;
				
			}

			// if two successive chars are equal then increase the
			if (str.charAt(i) == str.charAt(i+1))
			{
				count ++ ;
			}
			else 
			{
				// else append character with its count
				sb.append(str.charAt(i)+""+count);
				count = 1 ; // resetting the counter
			}
		}
		// String representation of a StringBuffer object
		System.out.println(sb.toString());
	}
}