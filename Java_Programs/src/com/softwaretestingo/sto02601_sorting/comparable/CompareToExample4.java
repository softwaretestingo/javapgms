package com.softwaretestingo.sto02601_sorting.comparable;
public class CompareToExample4 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Compare Two Strings Using compareTo() Method
	 * 
	 */
	public static void main(String[] args) 
	{
		// Initializing Strings
		String str1 = "software";
		String str2 = "SoFTwaRe";

		// Checking str1 string with str2 string
		System.out.println("Using compareTo Difference is : "+ str1.compareTo(str2));

		// Checking str1 string with str3 string using 
		System.out.print("Using compareToIgnoreCase Difference is : "+str1.compareToIgnoreCase(str2));
	}
} 