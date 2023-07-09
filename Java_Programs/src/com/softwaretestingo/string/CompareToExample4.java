package com.softwaretestingo.string;
public class CompareToExample4 
{
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