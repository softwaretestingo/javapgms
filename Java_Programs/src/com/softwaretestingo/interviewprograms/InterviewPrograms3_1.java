package com.softwaretestingo.interviewprograms;
public class InterviewPrograms3_1 
{
	/*
	 * String s =“lekhale” How many times “le” is Getting repeated, write a code to
	 * find out using java.
	 */
	public static void main(String[] args) 
	{

		String s = "lekhale";
		int count = 0;
		int index = s.indexOf("le");
		while (index != -1) 
		{
			count++;
			index = s.indexOf("le", index + 1);
		}
		System.out.println("The substring 'le' is repeated " + count + " times in the given string.");
	}
}