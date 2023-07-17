package com.softwaretestingo.interviewprograms;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InterviewPrograms39_1 
{
	/*
	 * Input string : weelccoommee hhoommeee 
	 * Output string : welcome home
	 */
	public static void main(String[] args) 
	{
		String s = " weelccoomme hhommeee " ;
		Pattern pattern = Pattern.compile("(.)\\1*");
		Matcher m= pattern.matcher ( s ) ;
		String output = "";
		while ( m.find())
		{
			output= output + m.group().charAt(0);
		}
		System.out.println ( output ) ;
	}
}