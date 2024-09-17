package com.softwaretestingo.sto000collectedpgms.interviewprograms;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class STO0039_1_RemoveDuplicatesFromStrings 
{
	/*
	 * Input string : weelccoommee hhoommeee 
	 * Output string : welcome home
	 */
	public static void main(String[] args) 
	{
		String s = " weelccoomme hhommeee " ;
		System.out.println("Input: "+s);
		Pattern pattern = Pattern.compile("(.)\\1*");
		Matcher m= pattern.matcher ( s ) ;
		String output = "";
		while ( m.find())
		{
			output= output + m.group().charAt(0);
		}
		System.out.println ("Output: "+output ) ;
	}
}