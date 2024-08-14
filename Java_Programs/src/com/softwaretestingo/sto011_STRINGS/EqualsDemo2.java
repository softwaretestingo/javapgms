package com.softwaretestingo.sto011_STRINGS;
public class EqualsDemo2 
{
	/**
	 * Author: SoftwareTestingo Admin
	 * Blog: www.softwaretestingo.com
	 * URL: https://www.softwaretestingo.com/core-java-tutorial/
	 * 
	 * Problem Statement: Compare Two Strings Using equals() Method
	 * 
	 */
	public static void main(String[] args) 
	{
		String Str1 = new String("HELLO");
		String Str2 = new String("hello");    
		String Str3 = null;
		String Str4 = "HELLO";


		System.out.println("Check Weather Str1 and Str2 are equal : "+(Str1.equals(Str2)));  
		//Both Objects are Same
		System.out.println("Check Weather Str1 and Str4 are equal : "+(Str1.equals(Str4)));
		System.out.println("Check Weather Str2 and Str4 are equal : "+(Str2.equals(Str4)));
		System.out.println("Check Weather Str4 and Str3 are equal : "+(Str4.equals(Str3)));

	}
}