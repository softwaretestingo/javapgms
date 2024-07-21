package com.softwaretestingo.interviewprograms;
public class InterviewPrograms_117_SplitReverseEachWordOfaString 
{
	/**
	 * Write Java code for
	 * String input = "I am Rajesh, currently attending, interview with, abc systems";
	 * String output= "Rajesb am I, attending currently, with interview, systems abc";
	 * 
	 */
	public static void main(String[] args) 
	{
		String str= "I am Rajesh, currently attending, interview with, abc systems";
		String[] strArray=str.split(",");
		String reverse="";
		
		for(int i=0;i<strArray.length;i++)
		{
			String[] s2=strArray[i].split(" ");
			reverse=reverse+reverse(s2)+",";
  		}
		System.out.println("Inpur String: "+str);
		System.out.println("Output String: "+reverse);
	}

	private static String reverse(String[] str) 
	{
		String reverse=" ";
		for(int i=str.length-1;i>=0;i--)
		{
			reverse=reverse+str[i]+" ";
		}
		return reverse;
	}
}