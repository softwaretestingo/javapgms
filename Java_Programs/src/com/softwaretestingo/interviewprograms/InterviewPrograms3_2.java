package com.softwaretestingo.interviewprograms;

public class InterviewPrograms3_2 
{
	/*
	 * String s =“lekhale” How many times “le” is Getting repeated, write a code to
	 * find out using java.
	 */
	public static void main(String[] args) 
	{

		String s = "lekhale";
		int occurence = s.split("le").length; 
		
		System.out.println("The substring 'le' is repeated " + occurence + " times in the given string.");
	}

}
