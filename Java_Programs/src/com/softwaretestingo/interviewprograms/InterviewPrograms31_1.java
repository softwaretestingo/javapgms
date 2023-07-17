package com.softwaretestingo.interviewprograms;
public class InterviewPrograms31_1 
{
	/*
	 * Input string s ="amZgxY" 
	 * Need to print biggest character asiic value.
	 */
	public static void main(String[] args) 
	{
		String str = "badTyx";
		int currentmax = 0 ;
		for (Character c : str.toCharArray()) 
		{
			if ((int)c>currentmax)
				currentmax = (int)c;
		}
		System.out.println ((char)currentmax);
	}
}