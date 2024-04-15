package com.softwaretestingo.string;
public class StringConcatUsingStringBuilder 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Append Two String With append() method & StringBuilder
	 * 
	 */
	public static void main(String[] args) 
	{
		String s1 = "Welcome to SoftwareTestingo on: ";
		Integer s2 = 2023;

		// create StringBuffer Instance
		StringBuilder newstring=new StringBuilder();

		// using append method to concatenate strings
		StringBuilder concatenate=newstring.append(s1).append(s2);

		// printing
		System.out.println("The String s1 Value: "+s1);
		System.out.println("The String s2 Value: "+s2);
		System.out.println("After Concate: "+concatenate);
	}
}