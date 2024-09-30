package com.softwaretestingo.sto000collectedpgms.interviewprograms.strings;
public class STO0003_0_NoOfOccuranceOfSubstringInString 
{
	/*
	 * String s =“lekhale” How many times “le” is Getting repeated, write a code to
	 * find out using java.
	 */
	public static void main(String[] args) 
	{

		String s="lekhale";
		System.out.println("Input:  "+s);
		//This will print the length of the string (7)
		//System.out.println(s.length());

		//this will give you the total length of the string after replace le with space(3)
		//System.out.println((s.replaceAll("le","").length()));

		//Need to divide the number of character 
		int result = (s.length()-s.replaceAll("le","").length())/2;
		System.out.println("Output: "+result);
	}
}