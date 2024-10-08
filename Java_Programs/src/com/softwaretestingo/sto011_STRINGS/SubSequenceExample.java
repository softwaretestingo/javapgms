package com.softwaretestingo.sto011_STRINGS;
public class SubSequenceExample 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Get Substring from a String using subSequence() method
	 * 
	 */
	public static void main(String[] args) 
	{
		String str = "www.SoftwareTestingo.com";
		System.out.println("Last 4 char String: " + str.subSequence(str.length() - 4, str.length()));
		System.out.println("First 4 char String: " + str.subSequence(0, 4));
		System.out.println("website name: " + str.subSequence(4, 20));
		// substring vs subSequence
		//When you are compare with == its comparing Hashcode which is different 
		System.out.println("substring == subSequence ? " + (str.substring(4, 14) == str.subSequence(4, 14)));
		//When you compare with equals(), its comparing value
		System.out.println("substring equals subSequence ? " + (str.substring(4, 14).equals(str.subSequence(4, 14))));
	}
}