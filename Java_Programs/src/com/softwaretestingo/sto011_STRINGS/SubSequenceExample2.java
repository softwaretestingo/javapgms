package com.softwaretestingo.sto011_STRINGS;
public class SubSequenceExample2 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Get SubString with the Help of subSequence() method
	 * 
	 */
	public static void main(String[] args) 
	{
		String stringObject = "This example is with negative index";

		CharSequence output = stringObject.subSequence(10, stringObject.length());
		System.out.println(output);
	}
}