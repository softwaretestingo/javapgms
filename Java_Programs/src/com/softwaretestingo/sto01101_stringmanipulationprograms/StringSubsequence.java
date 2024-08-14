package com.softwaretestingo.sto01101_stringmanipulationprograms;
public class StringSubsequence 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: This class shows usage of String subSequence method
	 * 
	 */
	public static void main(String[] args) 
	{
		String str = "www.softwaretestingo.com";
		System.out.println("Last 4 char String: " + str.subSequence(str.length() - 4, str.length()));
		System.out.println("First 4 char String: " + str.subSequence(0, 4));
		System.out.println("website name: " + str.subSequence(4, 20));
		// substring vs subSequence
		System.out.println("substring == subSequence ? " + (str.substring(4, 14) == str.subSequence(4, 14)));
		System.out.println("substring equals subSequence ? " + (str.substring(4, 14).equals(str.subSequence(4, 14))));
	}
}