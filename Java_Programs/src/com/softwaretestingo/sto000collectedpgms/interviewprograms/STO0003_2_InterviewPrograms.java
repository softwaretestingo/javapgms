package com.softwaretestingo.sto000collectedpgms.interviewprograms;

public class STO0003_2_InterviewPrograms 
{
	/*
	 * String s =“lekhale” How many times “le” is Getting repeated, write a code to
	 * find out using java.
	 */
	public static void main(String[] args) 
	{
		String s = "lekhale";
		System.out.println("Input: "+s);
		int occurence = s.split("le").length; 

		System.out.println("Output: "+"The substring 'le' is repeated " + occurence + " times in the given string.");
	}

}
