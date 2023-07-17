package com.softwaretestingo.interviewprograms;
public class InterviewPrograms29 
{
	/*
	 * Input - Hi I am Naveen I need and answer 
	 * Output - answer and deen I Naveen ma I Hi
	 */
	public static void main(String[] args) 
	{
		String str = "Hi I am Naveen I need and answer";
		String[] sp=getPattern(str);
		
		// print Array
		for(int j=sp.length-1; j>=0; j--) 
		{
			System.out.print(sp[j] + " ");
		}
	}
	private static String[] getPattern(String revStr)
	{
		String[] splitStr = revStr.split(" ");
		for ( int j = splitStr.length-3; j>=0 ; j=j-3)
		{
			String temp=splitStr[j];
			StringBuilder sb = new StringBuilder(temp);
			splitStr[j] = sb.reverse().toString();
		}
		return splitStr ;
	}
}